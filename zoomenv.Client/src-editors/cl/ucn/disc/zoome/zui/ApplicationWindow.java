package cl.ucn.disc.zoome.zui;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;

import cl.ucn.disc.zoome.Application;
import cl.ucn.disc.zoome.zui.view.CanvasView;

public class ApplicationWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	protected JPanel jContentPane = null;
	private JSplitPane jSplitPane = null;
	private CanvasView yCanvas = null;
	private Console yConsole = null;
	protected JToolBar jToolBar = null;
	protected Application application;
	private JMenuBar jJMenuBar = null;
	private JMenu fileMenu = null;
	private JMenu jMenu = null;
	private JMenu MetamodelMenu = null;

	/**
	 * This is the default constructor
	 */
	public ApplicationWindow() {
		super();
		initialize();
	}
	
	public ApplicationWindow(Application app) {
		super();
		this.application = app;
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setContentPane(getJContentPane());
		this.setJMenuBar(getJJMenuBar());
		this.setTitle("JFrame");
		this.setBounds(new Rectangle(0, 0, 614, 762));
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	protected JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJSplitPane(), BorderLayout.CENTER);
			jContentPane.add(getJToolBar(), BorderLayout.NORTH);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jSplitPane	
	 * 	
	 * @return javax.swing.JSplitPane	
	 */
	private JSplitPane getJSplitPane() {
		if (jSplitPane == null) {
			jSplitPane = new JSplitPane();
			jSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
			jSplitPane.setTopComponent(getYCanvas());
			jSplitPane.setBottomComponent(getYConsole());
			jSplitPane.setDividerLocation(500);
		}
		return jSplitPane;
	}

	/**
	 * This method initializes yCanvas	
	 * 	
	 * @return cl.ucn.disc.zoome.gui.views.YCanvas	
	 */
	public CanvasView getYCanvas() {
		if (yCanvas == null) {
			yCanvas = new CanvasView();
		}
		return yCanvas;
	}

	/**
	 * This method initializes yConsole	
	 * 	
	 * @return cl.ucn.disc.zoome.gui.YConsole	
	 */
	public Console getYConsole() {
		if (yConsole == null) {
			yConsole = new Console(this.application);
		}
		return yConsole;
	}

	/**
	 * This method initializes jToolBar	
	 * 	
	 * @return javax.swing.JToolBar	
	 */
	public JToolBar getJToolBar() {
		if (jToolBar == null) {
			jToolBar = new JToolBar();
		}
		return jToolBar;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getFileMenu());
			jJMenuBar.add(getJMenu());
			jJMenuBar.add(getMetamodelMenu());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes fileMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	public JMenu getFileMenu() {
		if (fileMenu == null) {
			fileMenu = new JMenu();
			fileMenu.setName("fileMenu");
			fileMenu.setText("File");
		}
		return fileMenu;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("Edit");
		}
		return jMenu;
	}

	/**
	 * This method initializes MetamodelMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	public JMenu getMetamodelMenu() {
		if (MetamodelMenu == null) {
			MetamodelMenu = new JMenu();
			MetamodelMenu.setText("Metamodel");
		}
		return MetamodelMenu;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
