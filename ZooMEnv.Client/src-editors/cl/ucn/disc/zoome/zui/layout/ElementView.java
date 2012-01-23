package cl.ucn.disc.zoome.zui.layout;

import cl.ucn.disc.zoome.zui.view.LayoutManager;

/** Indicates methods that should be implemented by classes that require layout.
 * {@link ElementView#addLayout(ZUILayout)} and {@link ElementView#removeLayout(ZUILayout)}
 * must add/remove instances of {@link ZUILayout} to this instance.
 * The implementation of {@link ElementView#layoutChildren()} must
 * iterate over all instances of {@link ZUILayout} associated with this instance
 * and call the method {@link ZUILayout#updateGraphLayout()} for all instances that should
 * be updated automatically. Non-automatic layout should be called from {@link #updateGraphLayout()}
 * 
 * This is an example (and not very efficient) implementation:
 * <pre>
 * {@code
 *	public void addLayout(YLayout l) {
 *		layouts.add(l);
*	}
*	
*	
*	
*
*	public void removeLayout(YLayout l) {
*		layouts.remove(l);
*		
*	}
*
*
*	public void layoutChildren() {
*		for (YLayout<?> l : layouts) {
*			if (l.isAuto()) {
*				l.update();
*			}
*		}
*	}
*
*	public void updateNonAutoLayout() {
*		for (YLayout<?> l : layouts) {
*			if (!l.isAuto()) {
*				l.update();
*			}
*		}
*	}
 * }
 * </pre>
 * @author jpavlich
 *
 */
public interface ElementView {
	
	public static final String ATTRIBUTE_HEIGHT_RATIO_TO_PARENT = "heightRatioToParent";
	public static final String ATTRIBUTE_WIDTH_RATIO_TO_PARENT = "widthRatioToParent";
	public static final String ATTRIBUTE_VERTICAL_ALIGN = "verticalAlign";
	public static final String ATTRIBUTE_HORIZONTAL_ALIGN = "horizontalAlign";
	public static final String ATTRIBUTE_MIN_HEIGHT = "min height";
	public static final String ATTRIBUTE_MIN_WIDTH = "min width";
	public static final String ATTRIBUTE_MAX_HEIGHT = "max height";

	
	public static final double DEFAULT_MIN_WIDTH = 10.0;
	public static final double DEFAULT_MIN_HEIGHT = 10.0;
	public static final double DEFAULT_MAX_HEIGHT = Double.MAX_VALUE;
	public static final Double DEFAULT_MAX_WIDTH = Double.MAX_VALUE;
	public static final String ATTRIBUTE_MAX_WIDTH = "max width";
	
	public LayoutManager getLayoutManager();
	
	public void layoutChildren();
	
	public void move(Integer slots);
	
}
