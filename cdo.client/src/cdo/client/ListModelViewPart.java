package cdo.client;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;

//*******************************************************
import library.Library;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import java.io.IOException;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
//*******************************************************

public class ListModelViewPart extends ViewPart {
	private Table table;

	//*******************************************************
    private Library library; //The library instance
    private CDONet4jSession cdoSession; //The CDO session
    private Text txtRepositorio;
    private Text txtModelo;
    private Text txtModelo_1;
    //*******************************************************
	
	public ListModelViewPart() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		String modelo = "";
		String repositorio ="";
		//*******************************************************
        //Open CDO session and view
        cdoSession = TestCdoClient.openSession("mem");
        CDOView view = cdoSession.openView();
        CDOResource resource = view.getResource("/myResource");
        
        parent.setLayout(new GridLayout(1, false));
        //*******************************************************
		/*
		TableViewer tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnName = tableViewerColumn.getColumn();
		tblclmnName.setWidth(100);
		tblclmnName.setText("Name");
		*/
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Label lblRepositorio = new Label(composite, SWT.NONE);
		lblRepositorio.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblRepositorio.setText("Repositorio");
		txtRepositorio = new Text(composite, SWT.BORDER);
		txtRepositorio.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        
        try {
            //Load resource library
            resource.load(null);
            
            
            EList<EObject> modelos = resource.getContents();
            repositorio = resource.getName();
            txtRepositorio.setText(repositorio);
            int cont3 = 0;
            for(EObject a: modelos){
            	String o = a.eClass().getName();
            	
            	Label lblModelo3 = new Label(composite, SWT.NONE);
        		lblModelo3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        		
        		lblModelo3.setText("Modelo "+cont3);
        		
        		txtModelo = new Text(composite, SWT.BORDER);
        		txtModelo.setText(o);
        		txtModelo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        		cont3++;
            	
            	//String m = a.eClass().getEStructuralFeatures().get(2).getName();
            	//String m = a.eClass().getEStructuralFeature(2).getName();
            	EList<EObject> clases = a.eContents();
            	int cont2 = 0;
            	for(EObject b: clases){
            		EList<EStructuralFeature> cosas = b.eClass().getEAllStructuralFeatures();
            		String n = b.eClass().getName();
            		Label lblModelo2 = new Label(composite, SWT.NONE);
            		lblModelo2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
            		
            		lblModelo2.setText("Clase "+cont2);
            		
            		txtModelo = new Text(composite, SWT.BORDER);
            		txtModelo.setText(n);
            		txtModelo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
            		cont2++;
            		
            		//String m = b.eClass().getEStructuralFeature(2).getName();
            		int cont = 0;
            		for(EStructuralFeature c: cosas){
            			String m = c.getName();
            			
            			Label lblModelo = new Label(composite, SWT.NONE);
                		lblModelo.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
                		
                		lblModelo.setText("Atributo "+cont);
                		
                		txtModelo = new Text(composite, SWT.BORDER);
                		txtModelo.setText(m);
                		txtModelo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
                		cont++;
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
            
            
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		
		
		
		
		
		
		
	

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
