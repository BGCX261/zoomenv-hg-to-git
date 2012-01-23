package cl.ucn.disc.zoome.zui.view;

import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import cl.ucn.disc.zoome.binding.Binding;
import cl.ucn.disc.zoome.zui.layout.CSTextDocumentListener;
import cl.ucn.disc.zoome.zui.layout.ElementView;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.event.PInputEvent;
import edu.umd.cs.piccolo.nodes.PHtmlView;
import edu.umd.cs.piccolo.util.PPaintContext;
import edu.umd.cs.piccolo.util.PPickPath;
import edu.umd.cs.piccolox.event.PStyledTextEventHandler;

/**
 * @author jpavlich
 * This code is based on {@link PStyledTextEventHandler} by Lance Good
 */
public class TextView extends PHtmlView implements ElementView {
	private static final long serialVersionUID = 1L;

    public static final int TEXT_EDIT_PADDING = 3;

	
	private LayoutManager layoutManager = new LayoutManager(this);

    /**
     * A listener that will handle programatic changes to the underlying
     * document and update the view accordingly.
     */
    protected CSTextDocumentListener docListener = new CSTextDocumentListener() {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void removeUpdate(final DocumentEvent e) {
            reshapeEditorLater();
        }

        public void insertUpdate(final DocumentEvent e) {
            reshapeEditorLater();
        }

        public void changedUpdate(final DocumentEvent e) {
            reshapeEditorLater();
        }
    };

	private SimpleAttributeSet sas;

	
	TextView(String text) {
		super(text);
//        Document doc = new HTMLDocument();
//        if (doc instanceof StyledDocument && missingFontFamilyOrSize(doc)) {
////            final Font eFont = editor.getFont();
////            sas = new SimpleAttributeSet();
////            sas.addAttribute(StyleConstants.FontFamily, eFont.getFamily());
////            sas.addAttribute(StyleConstants.FontSize, new Integer(eFont.getSize()));
////            sas.addAttribute(StyleConstants.Alignment, StyleConstants.ALIGN_CENTER);
//
////            ((StyledDocument) doc).setParagraphAttributes(0, doc.getLength(), sas, false);
//            try {
//				doc.insertString(0, text, sas);
//			} catch (BadLocationException e) {
//				e.printStackTrace();
//			}
//
//        }
//        setDocument(doc);
//        getDocument().addDocumentListener(docListener);


        
//        editor.setVisible(false);
    }

	
    /**
     * Begins editing the provided text node as a result of the provided event.
     * Will swap out the text node for an editor.
     * 
     * @param event the event responsible for starting the editing
     */
    public void startEditing(final PInputEvent event) {
//        // Get the node's top right hand corner
//        final Insets pInsets = getInsets();
//        final Point2D nodePt = new Point2D.Double(getX() + pInsets.left, getY() + pInsets.top);
//        localToGlobal(nodePt);
//        event.getTopCamera().viewToLocal(nodePt);
//
//        // Update the editor to edit the specified node
//        editor.setDocument(getDocument());
//        editor.setVisible(true);
//
//        final Insets bInsets = editor.getBorder().getBorderInsets(editor);
//        editor.setLocation((int) nodePt.getX() - bInsets.left, (int) nodePt.getY() - bInsets.top);
//        reshapeEditorLater();
//
//        dispatchEventToEditor(event);
////        canvas.repaint();
//
//        setEditing(true);
    }
	
    
    
    /**
     * Stops editing the current text node.
     * 
     * @param event the event responsible for stopping the editing
     */
    public void stopEditing(final PInputEvent event) {

//        setEditing(false);
//
//        syncWithDocument();
//
//        //		This property change event should be managed by an instance of
////		{@link PStyledText#syncWithDocument()}
//		try {
//			firePropertyChange(0, YBinding.VIEW_CHANGED, null, this.document.getText(0, this.document.getLength()));
//		} catch (BadLocationException e) {
//			e.printStackTrace();
//		}
//        editor.setVisible(false);

    }
	

	
	
    private boolean missingFontFamilyOrSize(final Document doc) {
        return !doc.getDefaultRootElement().getAttributes().isDefined(StyleConstants.FontFamily)
                || !doc.getDefaultRootElement().getAttributes().isDefined(StyleConstants.FontSize);
    }
    
    /**
     * Adjusts the shape of the editor to fit the current document.
     */
    public void reshapeEditor() {
//        Dimension prefSize = editor.getPreferredSize();
//
//        final Insets textInsets = getInsets();
//        final Insets editorInsets = editor.getInsets();
//
//        final int width;
//        if (getConstrainWidthToTextWidth()) {
//            width = (int) prefSize.getWidth();
//        }
//        else {
//            width = (int) (getWidth() - textInsets.left - textInsets.right + editorInsets.left
//                    + editorInsets.right + TEXT_EDIT_PADDING);
//        }
//        prefSize.setSize(width, prefSize.getHeight());
//        editor.setSize(prefSize);
//
//        prefSize = editor.getPreferredSize();
//        final int height;
//        if (getConstrainHeightToTextHeight()) {
//            height = (int) prefSize.getHeight();
//        }
//        else {
//            height = (int) (getHeight() - textInsets.top - textInsets.bottom + editorInsets.top
//                    + editorInsets.bottom + TEXT_EDIT_PADDING);
//        }
//        prefSize.setSize(width, height);
//        editor.setSize(prefSize);
    }

    /**
     * Sometimes we need to invoke this later because the document events seem
     * to get fired before the text is actually incorporated into the document.
     */
    protected void reshapeEditorLater() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                reshapeEditor();
            }
        });
    }
    
    /**
     * Intercepts Piccolo2D events and dispatches the underlying swing one to
     * the current editor.
     * 
     * @param event the swing event being intercepted
     */
    public void dispatchEventToEditor(final PInputEvent event) {
        // We have to nest the mouse press in two invoke laters so that it is
        // fired so that the component has been completely validated at the new
        // size and the mouse event has the correct offset
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                SwingUtilities.invokeLater(new Runnable() {
//                    public void run() {
//                        final MouseEvent me = new MouseEvent(editor, MouseEvent.MOUSE_PRESSED, event.getWhen(), event
//                                .getModifiers()
//                                | InputEvent.BUTTON1_MASK, (int) (event.getCanvasPosition().getX() - editor.getX()),
//                                (int) (event.getCanvasPosition().getY() - editor.getY()), 1, false);
//                        editor.dispatchEvent(me);
//                    }
//                });
//            }
//        });
    }

//
//
//	public String getText() {
//		try {
//			return document.getText(0, document.getLength());
//		} catch (BadLocationException e) {
//			return "";
//		}
//	}
//	
//	public void setText(String text) {
//		try {
//			document.remove(0, document.getLength());
//			document.insertString(0, text, sas);
//			syncWithDocument();
//		} catch (BadLocationException e) {
//			e.printStackTrace();
//		}
//	}

	

	
	
	@Override
	public boolean fullPick(PPickPath pickPath) {
		if (layoutManager.isZUIVisible()) {
			return super.fullPick(pickPath);
			
		} else {
			return false;
		}
	}

	@Override
	public void layoutChildren() {
		layoutManager.updateLayout();
	}

	@Override
	public void addChild(int index, PNode child) {
		super.addChild(index, child);
		layoutManager.addNode(child);
	}

	@Override
	public PNode removeChild(final int index) {
		PNode child = super.removeChild(index);
		layoutManager.removeNode(child);
		return child;
	}

	@Override
	protected void paint(PPaintContext paintContext) {
		layoutManager.updateZoomLayout(paintContext.getScale());
		if (layoutManager.isZUIVisibleChanged()) {			
//			firePropertyChange(PROPERTY_CODE_FULL_BOUNDS, PROPERTY_FULL_BOUNDS, null, null);
			if (getParent() instanceof ElementView) {
				((ElementView)getParent()).getLayoutManager().updateLayout();
			}
		}
		if (layoutManager.isZUIVisible()) {
			super.paint(paintContext);
		}
	}

	@Override
	public LayoutManager getLayoutManager() {
		return layoutManager;
	}
	
	@Override
	public void move(Integer slots) {
		
		PNode parent = getParent();
		int i = parent.getChildrenReference().indexOf(this);
		int newI = i + slots; 
		if (newI <= parent.getChildrenCount() && newI >= 0) {
			parent.removeChild(i);
			parent.addChild(newI, this);
			firePropertyChange(0, Binding.CHILD_ORDER_CHANGED, i, newI);
		}
	}
}
