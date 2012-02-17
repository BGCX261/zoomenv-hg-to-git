package cl.ucn.disc.zoome.util;

import java.awt.geom.Point2D;

import edu.umd.cs.piccolo.PNode;

public class Geometry {

	/**
	 * @param startPNode
	 * @param endPNode
	 * @return
	 */
	public static Point2D getIntersectionPoint(PNode startPNode, PNode endPNode) {
		Point2D p = new Point2D.Double();
		Point2D start = startPNode.localToGlobal((Point2D) startPNode.getBoundsReference().getCenter2D());
	
		Point2D end = endPNode.localToGlobal((Point2D) endPNode.getBoundsReference().getCenter2D());
	
		Point2D d = new Point2D.Double(end.getX() - start.getX(), end.getY() - start.getY());
	
		double m = d.getY() / d.getX();
	
		Point2D dir = new Point2D.Double(Math.signum(d.getX()), Math.signum(d.getY()));
	
		double sidey = dir.getY() * startPNode.getGlobalFullBounds().getHeight() / 2;
		double sidex = dir.getX() * startPNode.getGlobalFullBounds().getWidth() / 2;
	
		double yint;
		if (m == Double.NaN) {
			yint = sidey;
		} else {
			yint = sidex * m;
		}
		double xint;
		if (m == 0) {
			xint = sidex;
		} else {
			xint = sidey / m;
		}
	
		if (Math.abs(yint) < Math.abs(sidey)) {
			xint = sidex;
		} else {
			yint = sidey;
		}
	
		p.setLocation(start.getX() + xint, start.getY() + yint);
	
		return p;
	}

	public static double getAngle(Point2D start, Point2D end) {
		return Math.atan2(end.getY()-start.getY(), end.getX()-start.getX());
	}


}
