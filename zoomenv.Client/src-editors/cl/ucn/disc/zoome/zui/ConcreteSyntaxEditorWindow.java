package cl.ucn.disc.zoome.zui;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import cl.ucn.disc.zoome.Application;
import cl.ucn.disc.zoome.ConcreteSyntaxEditor;

public class ConcreteSyntaxEditorWindow extends ApplicationWindow {

	private JButton jButton1 = null;
	private JButton jButton2 = null;
	private JButton jButton3 = null;
	private JButton jButton = null;
	private JButton jButton4 = null;
	private JButton jButtonText;  //  @jve:decl-index=0:

	public ConcreteSyntaxEditorWindow(Application zoome) {
		super(zoome);
		setTitle("Concrete Syntax Editor");
	}

	@Override
	protected JPanel getJContentPane() {
		// TODO Auto-generated method stub
		return super.getJContentPane();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 4982305628568462786L;

	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Associate");
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					((ConcreteSyntaxEditor) application).createConnection();
				}
			});
		}
		return jButton1;
	}

	@Override
	public JToolBar getJToolBar() {
		super.getJToolBar();
		jToolBar.add(getJButton2());
		jToolBar.add(getJButtonText());
		jToolBar.add(getJButton1());
		jToolBar.add(getJButton3());
		jToolBar.add(getJButton());
		jToolBar.add(getJButton4());
		return jToolBar;

	}

	/**
	 * This method initializes jButton2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("New Node");
			jButton2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					((ConcreteSyntaxEditor) application).createNode();
				}
			});
		}
		return jButton2;
	}
	
	/**
	 * This method initializes jButtonText	
	 * 	
	 * @return javax.swing.JButton	
	 */
	JButton getJButtonText() {
		if (jButtonText == null) {
			jButtonText = new JButton();
			jButtonText.setText("New Text");
			jButtonText.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					((ConcreteSyntaxEditor) application).createText();
				}
			});
		}
		return jButtonText;
	}

	/**
	 * This method initializes jButton3	
	 * 	
	 * @return javax.swing.JButton	
	 */
	JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("Fit All");
			jButton3.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					application.fitAll();
				}
			});
		}
		return jButton3;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("Up");
			jButton.setEnabled(false);
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					application.fitOneLevelUp();
				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jButton4	
	 * 	
	 * @return javax.swing.JButton	
	 */
	JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("Layout 1");
			jButton4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					application.layout();
				}
			});
		}
		return jButton4;
	}

	

}
