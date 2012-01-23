package cl.ucn.disc.zoome.binding;

import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.RoundRectangle2D;
import java.beans.PropertyChangeEvent;
import java.util.HashMap;
import java.util.Map;

import cl.ucn.disc.zoome.Application;
import cl.ucn.disc.zoome.cs.CSColor;
import cl.ucn.disc.zoome.cs.CSElement;
import cl.ucn.disc.zoome.cs.CSFactory;
import cl.ucn.disc.zoome.cs.CSNode;
import cl.ucn.disc.zoome.cs.CSShape;
import cl.ucn.disc.zoome.cs.CSTransform;
import cl.ucn.disc.zoome.zui.layout.ElementView;
import cl.ucn.disc.zoome.zui.layout.ListLayout;
import cl.ucn.disc.zoome.zui.view.NodeView;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.nodes.PPath;
import edu.umd.cs.piccolo.nodes.PText;
import edu.umd.cs.piccolo.util.PAffineTransform;

public class PiccoloToCSMapping {
	
    public static final Rectangle2D.Float RECTANGLE = new Rectangle2D.Float();
    public static final RoundRectangle2D.Float ROUND_RECTANGLE = new RoundRectangle2D.Float();
    public static final Ellipse2D.Float ELLIPSE = new Ellipse2D.Float();
 
    private static Map<String, RectangularShape> shapes = new HashMap<String, RectangularShape>();
    
    static {
    	shapes.put(Application.getRECTANGLE().getName(), RECTANGLE);
    	shapes.put(Application.getELLIPSE().getName(), ELLIPSE);
    	shapes.put(Application.getROUND_RECTANGLE().getName(), ROUND_RECTANGLE);
    	
    	ROUND_RECTANGLE.archeight = 15;
    	ROUND_RECTANGLE.arcwidth = 15;
    	
    }
    
    
	public static void updatePNodeFromYNode(PNode view, CSNode model) {
		view.setName(model.getName());
	
		CSTransform t = model.getTransform();
	
		PAffineTransform tr = new PAffineTransform(t.getM00(), t.getM10(),
				t.getM01(), t.getM11(), t.getM02(), t.getM12());
	
		view.setTransform(tr);
	
		view.setX(model.getX());
		view.setY(model.getY());
	
		view.setWidth(model.getWidth());
		view.setHeight(model.getHeight());
		
		view.setPickable(model.getSelectable());
		CSColor yfc = model.getForeground();
		CSColor ybc = model.getBackground();
		Color fc;
		Color bc;
		
		if (yfc == null) {
			fc = Color.black;
		} else {
			fc = getColor(yfc);
		}
		
		if (ybc == null) {
			bc = Color.white;
		} else {
			bc = getColor(ybc);
		}
		
		if (view instanceof PPath) {
			PPath pp = (PPath)view;
			pp.setStrokePaint(fc);
			view.setPaint(bc);
			if (view instanceof NodeView)
			updatePPathShape((NodeView) pp, model.getShape());
		}  else if (view instanceof PText) {
			PText txt = (PText)view;
			txt.setTextPaint(fc);
			view.setPaint(bc);
		}
		
		view.addAttribute(ElementView.ATTRIBUTE_HORIZONTAL_ALIGN, model.getHorizontalAlign());
		view.addAttribute(ElementView.ATTRIBUTE_VERTICAL_ALIGN, model.getVerticalAlign());
		view.addAttribute(ElementView.ATTRIBUTE_WIDTH_RATIO_TO_PARENT, model.getWidthRatioToParent());
		view.addAttribute(ElementView.ATTRIBUTE_HEIGHT_RATIO_TO_PARENT, model.getHeightRatioToParent());
		view.addAttribute(ElementView.ATTRIBUTE_MIN_HEIGHT, model.getMinHeight());
		view.addAttribute(ElementView.ATTRIBUTE_MIN_WIDTH, model.getMinWidth());
		view.addAttribute(ElementView.ATTRIBUTE_MAX_HEIGHT, model.getMaxHeight());
		view.addAttribute(ElementView.ATTRIBUTE_MAX_WIDTH, model.getMaxWidth());
		
		if (view instanceof ElementView) {
			ElementView n = (ElementView)view;
			// TODO This is temporary. There should be more kinds of layouts available
			if (model.getLayout() == null) {
				n.getLayoutManager().setLayout(null);
			} else {
				n.getLayoutManager().setLayout(new ListLayout());
			}
			n.getLayoutManager().setMinZoom(model.getMinZoom());
			n.getLayoutManager().setMaxZoom(model.getMaxZoom());
		}
		
		
		
		Point2D b = view.getGlobalTranslation();
//		YLogger.instance.debug("View updated, name: " + view.getName()
//				+ " | " + b.getX() + "," + b.getY());
	}

	

	private static void updatePPathShape(NodeView node, CSShape shape) {
		RectangularShape sh;
		if (shape == null) {
			sh = node.getBounds();
		} else {
			sh = shapes.get(shape.getName()); 
			if (sh == null) {
				node.reset(); // No shape
				return;
			} else {
				sh.setFrame(node.getBounds());
			}
		}

		node.setShape(sh);
		
	}



	public static void updateYNodeFromPNode(CSNode model, PNode view) {
		PAffineTransform t = view.getTransformReference(true);
		double[] m = new double[6];
		t.getMatrix(m);
		model.getTransform().setM00(m[0]);
		model.getTransform().setM10(m[1]);
		model.getTransform().setM01(m[2]);
		model.getTransform().setM11(m[3]);
		model.getTransform().setM02(m[4]);
		model.getTransform().setM12(m[5]);
		model.setX(view.getX());
		model.setY(view.getY());
		model.setWidth(view.getWidth());
		model.setHeight(view.getHeight());
		
		model.setSelectable(view.getPickable());
		
		if (view instanceof PPath) {
			PPath pp = (PPath)view;
			model.setForeground(getYColor((Color) pp.getStrokePaint()));
			model.setBackground(getYColor((Color) view.getPaint()));
			
			if (model.getShape() == null) {
				
			}

			
			
		}  else if (view instanceof PText) {
			PText txt = (PText)view;
			model.setForeground(getYColor((Color) txt.getTextPaint()));
			model.setBackground(getYColor((Color) view.getPaint()));
		}
		
		model.setHorizontalAlign((Double) view.getAttribute(ElementView.ATTRIBUTE_HORIZONTAL_ALIGN));
		model.setVerticalAlign((Double)view.getAttribute(ElementView.ATTRIBUTE_VERTICAL_ALIGN));
	
		model.setWidthRatioToParent((Double)view.getAttribute(ElementView.ATTRIBUTE_WIDTH_RATIO_TO_PARENT));
		model.setHeightRatioToParent((Double)view.getAttribute(ElementView.ATTRIBUTE_HEIGHT_RATIO_TO_PARENT));
		model.setMinHeight((Double)view.getAttribute(ElementView.ATTRIBUTE_MIN_HEIGHT));
		model.setMinWidth((Double)view.getAttribute(ElementView.ATTRIBUTE_MIN_WIDTH));
		model.setMaxHeight((Double)view.getAttribute(ElementView.ATTRIBUTE_MAX_HEIGHT));
		model.setMaxWidth((Double)view.getAttribute(ElementView.ATTRIBUTE_MAX_WIDTH));
		
		
		if (view instanceof ElementView) {
			ElementView ev = (ElementView) view;
			if (ev.getLayoutManager().getLayout() == null) { 
				model.eSetDeliver(false);
				model.setLayout(null);
				model.eSetDeliver(true);
			} else {
				model.eSetDeliver(false);
				model.setLayout(Application.LAYOUT);
				model.eSetDeliver(true);
			}
		}
		
		
		
		// TODO Add minZoom and maxZoom updating
		// TODO Add shape update
		
//		YLogger.instance.debug("Model updated, name:" + model.getName()
//				+ " x:" + model.getX() + " y:" + model.getY());

	}
	
	private static Color getColor(CSColor c) {
		return new Color((int)c.getR()*255,(int)c.getG()*255,(int)c.getB()*255,(int)c.getA()*255);
	}
	
	private static CSColor getYColor(Color c) {
		CSColor yc = CSFactory.eINSTANCE.createCSColor();
		yc.setR((double)c.getRed()/255.0);
		yc.setG((double)c.getGreen()/255.0);
		yc.setB((double)c.getBlue()/255.0);
		yc.setA((double)c.getAlpha()/255.0);
		return yc;
	}



	public static void updatePNodeChildOrder(ElementView view, CSNode model, PropertyChangeEvent evt) {
		Integer oldI = (Integer) evt.getOldValue();
		Integer newI = (Integer) evt.getNewValue();
		view.move(newI - oldI);
	}



	public static void updateYNodeChildOrder(CSNode model, PNode view, PropertyChangeEvent evt ) {
		if (evt.getPropertyName().equals(Binding.CHILD_ORDER_CHANGED)) {
			CSElement parent = model.getParent();
			Integer oldI = (Integer) evt.getOldValue();
			Integer newI = (Integer) evt.getNewValue();
			parent.eSetDeliver(false);
			CSElement elem = parent.getChildren().get(oldI);
			parent.getChildren().remove(elem);
			parent.getChildren().add(newI, elem);
			
			parent.eSetDeliver(true);
		}
	}



}
