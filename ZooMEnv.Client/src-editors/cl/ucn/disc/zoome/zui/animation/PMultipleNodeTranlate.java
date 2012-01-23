package cl.ucn.disc.zoome.zui.animation;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.activities.PActivity;

public class PMultipleNodeTranlate extends PActivity {

	private List<PNode> nodes;
	private List<Point2D> startPositions = new ArrayList<Point2D>();

	private List<Point2D> endPositions = new ArrayList<Point2D>();

	public PMultipleNodeTranlate(long aDuration, long aStepRate,
			long aStartTime, List<PNode> nodes, List<Point2D> endPositions) {
		super(aDuration, aStepRate, aStartTime);
		if (nodes.size() != endPositions.size()) {
			throw new RuntimeException(
					"Amount of target positions does not mach the amount of nodes");
		}
		this.nodes = nodes;
		this.endPositions = endPositions;
		for (int i = 0; i < nodes.size(); i++) {
			PNode n = nodes.get(i);
			// Point2D startPos = n.getOffset();
			Point2D startPos = n.getFullBoundsReference().getOrigin();
			startPositions.add(startPos);

		}
	}

	@Override
	protected void activityStep(long elapsedTime) {
		super.activityStep(elapsedTime);
		for (int i = 0; i < nodes.size(); i++) {
			double step = (double) elapsedTime / getDuration();
			PNode n = nodes.get(i);
			Point2D startPos = startPositions.get(i);
			Point2D endPos = endPositions.get(i); // TODO must calculate center position of the node
//			PBounds b = n.getBounds();
//			n.localToParent(b);
//			endPos.setLocation(endPos.getX() - b.getWidth()/2, endPos.getY() - b.getHeight()/2);

			Point2D pos = new Point2D.Double(
					startPos.getX() + (endPos.getX() - startPos.getX()) * step, 
					startPos.getY()	+ (endPos.getY() - startPos.getY()) * step);
			n.parentToLocal(pos);

			n.translate(pos.getX(), pos.getY());
			

			// n.centerFullBoundsOnPoint(pos.getX(),pos.getY());
		}
	}

	@Override
	protected void activityFinished() {
		super.activityFinished();
		for (int i = 0; i < nodes.size(); i++) {
			PNode n = nodes.get(i);
			Point2D endPos = endPositions.get(i);

			n.parentToLocal(endPos);
			n.translate(endPos.getX(), endPos.getY());

			// n.centerFullBoundsOnPoint(endPos.getX(),endPos.getY());
			// n.signalBoundsChanged();
		}
	}

}
