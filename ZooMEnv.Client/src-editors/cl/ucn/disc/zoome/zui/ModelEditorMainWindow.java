package cl.ucn.disc.zoome.zui;

import javax.swing.JPanel;
import javax.swing.JToolBar;

import cl.ucn.disc.zoome.Application;

public class ModelEditorMainWindow extends ApplicationWindow {

	@Override
	protected JPanel getJContentPane() {
		// TODO Auto-generated method stub
		return super.getJContentPane();
	}

	@Override
	public JToolBar getJToolBar() {
		JToolBar t = super.getJToolBar();
		return t;
	}

	public ModelEditorMainWindow(Application zoome) {
		super(zoome);
		setTitle("Model Editor");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7433049956350334733L;
}  //  @jve:decl-index=0:visual-constraint="48,151"
