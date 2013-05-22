package cdo.client;

import library.Author;
import library.Book;
import library.Library;
import library.LibraryFactory;
 
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.ILifecycle;
import org.eclipse.net4j.util.lifecycle.LifecycleEventAdapter;
import org.junit.BeforeClass;
import org.junit.Test;
 
public class TestCdoClient {
 
    private static CDONet4jSession cdoSession;
 
    @BeforeClass
    public static void init() {
        //The following lines are not needed if the extension
        //registry (OSGi/Equinox) is running
        Net4jUtil.prepareContainer(IPluginContainer.INSTANCE);
        TCPUtil.prepareContainer(IPluginContainer.INSTANCE);
 
        cdoSession = openSession("mem");
    }
 
    @Test
    public void inicializar() {
        try {
            CDOTransaction transaction = cdoSession.openTransaction();
            CDOResource resource = transaction.getOrCreateResource("/myResource");
            Library library = LibraryFactory.eINSTANCE.createLibrary();
            
 
            Book book = LibraryFactory.eINSTANCE.createBook();
            book.setTitle("Game of Thrones");
            library.getListBook().add(book);
 
            Author author = LibraryFactory.eINSTANCE.createAuthor();
            author.setName("George R. R.");
            author.setSurname("Martin");
            library.getListAuthor().add(author);
            book.getAuthor().add(author);

            resource.getContents().add(library);
            transaction.commit();
            cdoSession.close();
 
        } catch (CommitException e) {
            e.printStackTrace();
        } finally {
            cdoSession.close();
        }
    }
 
    public static CDONet4jSession openSession(String repoName) {
        final IConnector connector = (IConnector) IPluginContainer.INSTANCE
                .getElement( //
                        "org.eclipse.net4j.connectors", // Product group
                        "tcp", // Type
                        "localhost"); // Description
 
        CDONet4jSessionConfiguration  config = CDONet4jUtil.createNet4jSessionConfiguration();
        config.setConnector(connector);
        config.setRepositoryName(repoName);
 
        CDONet4jSession session = config.openNet4jSession();
 
        session.addListener(new LifecycleEventAdapter() {
            @Override
            protected void onDeactivated(ILifecycle lifecycle) {
                connector.close();
            }
        });
 
        return session;
    }
 
}