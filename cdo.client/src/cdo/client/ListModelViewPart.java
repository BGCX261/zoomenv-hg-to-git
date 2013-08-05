package cdo.client;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.SWT;
//*******************************************************
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.io.IOException;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
//*******************************************************

public class ListModelViewPart extends ViewPart {
	private CDONet4jSession cdoSession; //The CDO session
    //*******************************************************
	
	public ListModelViewPart() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		String repositorio ="";
		//*******************************************************
        //Open CDO session and view
        cdoSession = TestCdoClient.openSession("mem");
        CDOView view = cdoSession.openView();
        CDOResource resource = view.getResource("/myResource");
        parent.setLayout(new FillLayout());
		final Tree tree = new Tree(parent, SWT.NONE);
		TreeItem itemRepositorio = new TreeItem(tree, SWT.NONE);
            try {
            	//Load resource repository
				resource.load(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
            
            EList<EObject> modelos = resource.getContents();
            repositorio = resource.getName();
            itemRepositorio.setText(repositorio);
            int cont3 = 0;
            for(EObject a: modelos){
            	String o = a.eClass().getName();
            	TreeItem itemModelo = new TreeItem(itemRepositorio, SWT.NONE);
            	itemModelo.setText(o);
        		cont3++;
            	EList<EObject> clases = a.eContents();
            	int cont2 = 0;
            	for(EObject b: clases){
            		String n = b.eClass().getName();
            		TreeItem itemClase = new TreeItem(itemModelo, SWT.NONE);
            		itemClase.setText(n);
            		cont2++;
            		int cont = 0;
            		EList<EAttribute> atributos = b.eClass().getEAllAttributes();
            		for(EAttribute c: atributos){
            			String m = c.getName();
            			TreeItem itemAtributo = new TreeItem(itemClase, SWT.NONE);
            			itemAtributo.setText(m);
                		cont++;
            		}
            		EList<EReference> referencias = b.eClass().getEAllReferences();
            		for(EStructuralFeature c: referencias){
            			String m = c.getName();
            			TreeItem itemAtributo = new TreeItem(itemClase, SWT.NONE);
            			itemAtributo.setText(m+" (Ref)");
            		}
            	}
            	/*Arbol de contenidos
            	TreeIterator<EObject> clases = a.eAllContents();
            	clases.next(); //autor
            	//clases.next(); //autor
            	//clases.next(); //autor
            	//clases.next(); //libro
            	//clases.next(); //error
            	String m = clases.next().eClass().getName();
            	*/
            }
            Menu menu = new Menu(tree);
            MenuItem menuItem = new MenuItem(menu, SWT.NONE);
            menuItem.setText("Print Element");
            menuItem.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                	CDOTransaction transaction = cdoSession.openTransaction();
                    CDOResource resource = transaction.getOrCreateResource("/myResource");
                	EList<EObject> modelos = resource.getContents();
                	int cont3 = 0;
                    for(EObject a: modelos){
                    	
                    	EList<EObject> clases = a.eContents();
                    	int cont2 = 0;
                    	for(EObject b: clases){
                    		EList<EAttribute> atributos = b.eClass().getEAllAttributes();
                    		
                    		int cont = 0;
                    		for(EAttribute c: atributos){
                    			String m = c.getName();
                    			if(m==tree.getSelection()[0].getText()){
                    				//resource.getContents().get(cont3).eContents().get(cont2).eClass().getEAllAttributes().get(cont).setName("testOtro");
                    				EObject nuevo = resource.getContents().get(cont3);
                    				nuevo.eContents().get(cont2).eClass().getEAllAttributes().get(cont).setName("testOtro");
                    				resource.getContents().set(cont3, nuevo);
                    				try {
										transaction.commit();
									} catch (CommitException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
                    				System.out.println("Se cambio");
                    			}
                    			//cosas.set(cont, c);
                        		cont++;
                    		}
                    		cont2++;
                    	}
                    	cont3++;
                    }
                    //System.out.println(tree.getSelection()[0].getText());
                    transaction.close();
                }
            });
            tree.setMenu(menu);
	}
	
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}
}

