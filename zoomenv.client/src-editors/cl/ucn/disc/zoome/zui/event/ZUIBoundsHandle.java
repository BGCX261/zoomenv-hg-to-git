package cl.ucn.disc.zoome.zui.event;


	/*
	 * Copyright (c) 2008-2010, Piccolo2D project, http://piccolo2d.org
	 * Copyright (c) 1998-2008, University of Maryland
	 * All rights reserved.
	 *
	 * Redistribution and use in source and binary forms, with or without modification, are permitted provided
	 * that the following conditions are met:
	 *
	 * Redistributions of source code must retain the above copyright notice, this list of conditions
	 * and the following disclaimer.
	 *
	 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions
	 * and the following disclaimer in the documentation and/or other materials provided with the
	 * distribution.
	 *
	 * None of the name of the University of Maryland, the name of the Piccolo2D project, or the names of its
	 * contributors may be used to endorse or promote products derived from this software without specific
	 * prior written permission.
	 *
	 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED
	 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
	 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
	 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
	 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
	 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
	 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
	 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
	 */

import javax.swing.SwingConstants;

import cl.ucn.disc.zoome.util.PiccoloUtil;
import edu.umd.cs.piccolo.PCamera;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.event.PInputEvent;
import edu.umd.cs.piccolo.util.PBounds;
import edu.umd.cs.piccolo.util.PDimension;
import edu.umd.cs.piccolox.handles.PBoundsHandle;
import edu.umd.cs.piccolox.util.PBoundsLocator;

	/**
	 * <b>PBoundsHandle</b> a handle for resizing the bounds of another node. If a
	 * bounds handle is dragged such that the other node's width or height becomes
	 * negative then the each drag handle's locator assciated with that other node
	 * is "flipped" so that they are attached to and dragging a different corner of
	 * the nodes bounds.
	 * 
	 * @version 1.0
	 * @author Jesse Grosjean
	 */
	public class ZUIBoundsHandle extends PBoundsHandle {

	    public ZUIBoundsHandle(PBoundsLocator locator) {
			super(locator);
		}

		/**
		 * 
		 */
		private static final long serialVersionUID = -3849858156870939421L;

		/**
	     * Is invoked when the handle is being dragged.
	     * 
	     * @param aLocalDimension dimension representing the magnitude of the handle
	     *            drag
	     * @param aEvent event responsible for the call
	     */
		@Override
	    public void dragHandle(final PDimension aLocalDimension, final PInputEvent aEvent) {
	        final PBoundsLocator l = (PBoundsLocator) getLocator();

	        final PNode n = l.getNode();
	        final PBounds b = n.getBounds();

	        final PNode parent = getParent();
	        if (parent != n && parent instanceof PCamera) {
	            ((PCamera) parent).localToView(aLocalDimension);
	        }

	        localToGlobal(aLocalDimension);
	        n.globalToLocal(aLocalDimension);

	        final double dx = aLocalDimension.getWidth();
	        final double dy = aLocalDimension.getHeight();

	        switch (l.getSide()) {
	            case SwingConstants.NORTH:
	                b.setRect(b.x, b.y + dy, b.width, b.height - dy);
	                break;

	            case SwingConstants.SOUTH:
	                b.setRect(b.x, b.y, b.width, b.height + dy);
	                break;

	            case SwingConstants.EAST:
	                b.setRect(b.x, b.y, b.width + dx, b.height);
	                break;

	            case SwingConstants.WEST:
	                b.setRect(b.x + dx, b.y, b.width - dx, b.height);
	                break;

	            case SwingConstants.NORTH_WEST:
	                b.setRect(b.x + dx, b.y + dy, b.width - dx, b.height - dy);
	                break;

	            case SwingConstants.SOUTH_WEST:
	                b.setRect(b.x + dx, b.y, b.width - dx, b.height + dy);
	                break;

	            case SwingConstants.NORTH_EAST:
	                b.setRect(b.x, b.y + dy, b.width + dx, b.height - dy);
	                break;

	            case SwingConstants.SOUTH_EAST:
	                b.setRect(b.x, b.y, b.width + dx, b.height + dy);
	                break;
	            default:
	                throw new RuntimeException("Invalid side returned from PBoundsLocator");
	        }

	        PiccoloUtil.enforceSize(n,b);

//	        if (b.height < YElementView.MIN_HEIGHT * (1+ n.getChildrenCount())) {
//	            b.height = YElementView.MIN_HEIGHT * (1+n.getChildrenCount());
//	        }

	        n.setBounds(b);
//	        if (n instanceof YNodeView) {
//	        	((YNodeView)n).redrawShape();
//	        }
	    }

}
