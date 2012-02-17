package cl.ucn.disc.zoome.util;

import cl.ucn.disc.zoome.zui.layout.ElementView;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.util.PBounds;

public class PiccoloUtil {
	@SuppressWarnings("unchecked")
	public static <T> T getValue(PNode n, String attr, T defaultValue) {
		T value = (T)n.getAttribute(attr);
		if (value ==null) {
			value = defaultValue;
		}
		return value;
	}

	public static void enforceSize(PNode n, PBounds b) {
        enforceWidth(n, b);

        enforceHeight(n, b);
		
	}

	public static void enforceHeight(PNode n, PBounds b) {
		Double minHeight = getValue(n, ElementView.ATTRIBUTE_MIN_HEIGHT, ElementView.DEFAULT_MIN_HEIGHT);
		Double maxHeight = getValue(n, ElementView.ATTRIBUTE_MAX_HEIGHT, ElementView.DEFAULT_MAX_HEIGHT);
		if (b.height < minHeight) {
            b.height = minHeight ;
        }
		if (b.height > maxHeight) {
			b.height = maxHeight;
		}
	}

	public static void enforceWidth(PNode n, PBounds b) {
		Double minWidth = getValue(n, ElementView.ATTRIBUTE_MIN_WIDTH, ElementView.DEFAULT_MIN_WIDTH);
		Double maxWidth = getValue(n, ElementView.ATTRIBUTE_MAX_WIDTH, ElementView.DEFAULT_MAX_WIDTH);
		if (b.width < minWidth) {
            b.width = minWidth ;
        }
		if (b.width > maxWidth) {
            b.width = maxWidth ;
        }
	}
}
