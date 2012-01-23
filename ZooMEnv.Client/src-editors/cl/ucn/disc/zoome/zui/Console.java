package cl.ucn.disc.zoome.zui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptEngine;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.codehaus.groovy.control.CompilationFailedException;

import cl.ucn.disc.zoome.Application;

public class Console extends JPanel {
	
	List<String> commandHistory = new ArrayList<String>();  //  @jve:decl-index=0:
	int commandIndex = 0;

	private static final long serialVersionUID = 1L;


	private JTextArea jTextAreaConsoleOutput = null;

	private ScriptEngine scriptEngine;
	
	private Application app;

	public void setScriptEngine(ScriptEngine shell) {
		this.scriptEngine = shell;
	}

	private JScrollPane jScrollPane = null;
	private JTextArea jTextAreaConsoleInput = null;
	private JScrollPane jScrollPane1 = null;

	/**
	 * This is the default constructor
	 * @param scriptEngine 
	 */
	public Console(Application app) {
		super();
		this.app = app;
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(600, 200);
		this.setPreferredSize(new Dimension(600, 200));
		setLayout(new BorderLayout());
		add(getJScrollPane(), BorderLayout.CENTER);
		add(getJScrollPane1(), BorderLayout.SOUTH);


	}



	/**
	 * This method initializes jTextAreaConsoleOutput	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextAreaConsoleOutput() {
		if (jTextAreaConsoleOutput == null) {
			jTextAreaConsoleOutput = new JTextArea();
			jTextAreaConsoleOutput.setRows(20);
			jTextAreaConsoleOutput.setColumns(50);
		}
		return jTextAreaConsoleOutput;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJTextAreaConsoleOutput());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTextAreaConsoleInput	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextAreaConsoleInput() {
		if (jTextAreaConsoleInput == null) {
			jTextAreaConsoleInput = new JTextArea();
			jTextAreaConsoleInput.setColumns(50);
			jTextAreaConsoleInput.setRows(3);
			jTextAreaConsoleInput.addKeyListener(new java.awt.event.KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						println("> " + jTextAreaConsoleInput.getText());
						commandHistory.add(jTextAreaConsoleInput.getText());
						try {
							println(String.valueOf(eval()));
						} catch (CompilationFailedException e1) {
							println(e1.toString());
							e1.printStackTrace();
						} catch (RuntimeException e1) {
							println(e1.toString());
							e1.printStackTrace();
						} catch (Exception e1) {
							println(e1.toString());
							e1.printStackTrace();
						}
						jTextAreaConsoleInput.setText("");
						commandIndex = commandHistory.size();
					} else if (e.getKeyCode() == KeyEvent.VK_UP) {
						commandIndex--;
						if (commandIndex < 0) {
							commandIndex = 0;
						} else {
							jTextAreaConsoleInput.setText(commandHistory.get(commandIndex));
						}
					} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
						commandIndex++;
						if (commandIndex > commandHistory.size()-1) {
							commandIndex = commandHistory.size()-1;
						} else {
							jTextAreaConsoleInput.setText(commandHistory.get(commandIndex));
						}
					}
				}
				
		
			});
		}
		return jTextAreaConsoleInput;
	}
	
	private Object eval() {
		// TODO Should add imports as scripts instead of concatenating strings
//		String importsStr = "import com.jpavlich.view.VEModel.*;\n import com.jpavlich.view.VEModel.impl.*;\n import com.jpavlich.model.ACModel.*;\n import com.jpavlich.model.ACModel.impl.*;";
//		return shell.evaluate(importsStr + "\n" + jTextAreaConsoleInput.getText());
		try {
			return scriptEngine.eval(jTextAreaConsoleInput.getText(), app.getGroovyVariables());
		} catch (Throwable e) {
//			YLogger.instance.error(e);
			e.printStackTrace();
			return e;
		}
	}

	/**
	 * This method initializes jScrollPane1	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJTextAreaConsoleInput());
		}
		return jScrollPane1;
	}
	
	public void println(String str) {
		jTextAreaConsoleOutput.append(str + "\n");
	}

}  //  @jve:decl-index=0:visual-constraint="6,4"
