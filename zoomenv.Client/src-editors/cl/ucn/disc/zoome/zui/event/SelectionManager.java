package cl.ucn.disc.zoome.zui.event;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import cl.ucn.disc.zoome.util.CSEcoreUtil;
import cl.ucn.disc.zoome.zui.view.CanvasView;
import cl.ucn.disc.zoome.zui.view.ViewManager;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.PRoot;
import edu.umd.cs.piccolo.activities.PActivity;
import edu.umd.cs.piccolox.handles.PHandle;
import edu.umd.cs.piccolox.util.PBoundsLocator;
import groovy.lang.GroovyObject;

public class SelectionManager {
	
    private final PActivity updateHandles = new PActivity(-1, 0) {
        
		protected void activityStep(final long elapsedTime) {
            super.activityStep(elapsedTime);

            final PRoot root = getActivityScheduler().getRoot();

            if (root.getPaintInvalid() || root.getChildPaintInvalid()) {
                @SuppressWarnings("rawtypes")
				final Iterator i = canvas.getCamera().getChildrenIterator();
                while (i.hasNext()) {
                    final PNode each = (PNode) i.next();
                    if (each instanceof PHandle) {
                        final PHandle handle = (PHandle) each;
                        handle.relocateHandle();
                    }
                }
            }
        }
    };

    
	private CanvasView canvas;

	private final ViewManager viewManager;

	public SelectionManager(CanvasView canvas, final ViewManager viewManager) {
		this.viewManager = viewManager;
		this.canvas = canvas;
		this.canvas.getRoot().getActivityScheduler().addActivity(updateHandles, true);

		
	}

	private Map<PNode, Set<ZUIBoundsHandle>> selection = new LinkedHashMap<PNode,Set<ZUIBoundsHandle>>();

	public void select(PNode pickedNode) {
		// FIXME Commented YBoundsHandles do not resize the selected node correctly

		// Creates selection handlers
//		YBoundsHandle ne = new YBoundsHandle(PBoundsLocator.createNorthEastLocator(pickedNode));
//		YBoundsHandle nw = new YBoundsHandle(PBoundsLocator.createNorthWestLocator(pickedNode));
		ZUIBoundsHandle se = new ZUIBoundsHandle(PBoundsLocator.createSouthEastLocator(pickedNode));
//		YBoundsHandle sw = new YBoundsHandle(PBoundsLocator.createSouthWestLocator(pickedNode));
//	    canvas.getCamera().addChild(ne);
//	    canvas.getCamera().addChild(nw);
	    canvas.getCamera().addChild(se);
//	    canvas.getCamera().addChild(sw);
	    Set<ZUIBoundsHandle> selector = new HashSet<ZUIBoundsHandle>();
//	    selector.add(ne);
//	    selector.add(nw);
	    selector.add(se);
//	    selector.add(sw);
	    
	    // Associate the selection handlers to the picked node (to facilitate further removal)
		selection.put(pickedNode, selector);
		

	}

	public void unselectAll() {
		for (PNode n : selection.keySet()) {
			for (ZUIBoundsHandle h : selection.get(n)) {
					canvas.getCamera().removeChild(h);
			}
		}
		selection.clear();
	}
	
	public List<PNode> getView() {
		return new ArrayList<PNode>(selection.keySet());
	}
	
	public boolean isSelected(PNode node) {
		return selection.containsKey(node);
	}
	
	
	
	public List<EObject> getCso() {
		List<PNode> l = new ArrayList<PNode>(selection.keySet());
		List<EObject> objs = new ArrayList<EObject>();
		for (PNode n : l) {
			EObject o = viewManager.getCsObjectOfView(n);
			if (o != null) {
				objs.add(o);
			}
		}
		return objs;
		
		
	}
	
	public List<GroovyObject> getObj() {
		List<PNode> l = new ArrayList<PNode>(selection.keySet());
		List<GroovyObject> objs = new ArrayList<GroovyObject>();
		for (PNode n : l) {
			EObject cso = viewManager.getCsObjectOfView(n);
			if (cso != null) {
				Object o = CSEcoreUtil.get(cso, "object");
				if (o != null && o instanceof EObject) {
					objs.add(CSEcoreUtil.createGroovyObject((EObject) o));
				}
			}
		}
		return objs;
	
	}

}
