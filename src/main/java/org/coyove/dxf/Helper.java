package org.coyove.dxf;

import org.coyove.eugine.util.ListEx;
import org.kabeja.dxf.DXFArc;
import org.kabeja.dxf.DXFDocument;
import org.kabeja.dxf.DXFHatch;
import org.kabeja.dxf.DXFLine;
import org.kabeja.dxf.helpers.HatchBoundaryLoop;
import org.kabeja.dxf.helpers.Point;
import org.kabeja.parser.ParserBuilder;

import java.util.Iterator;

/**
 * Created by zezhong on 2016/11/7.
 */
public class Helper {
    public static double angleInterval = 10;

    public static DXFDocument openDxf(String path) {
        try {
            org.kabeja.parser.Parser parser = ParserBuilder.createDefaultParser();
            parser.parse(path);
            return parser.getDocument();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ListEx<Point> getHatch(DXFDocument doc, String blockName) {
        Iterator entity = doc.getDXFBlock(blockName).getDXFEntitiesIterator();
        ListEx<Point> points = new ListEx<Point>();

        while (entity.hasNext()) {
            Object e = entity.next();
            if (e instanceof DXFHatch) {
                Iterator loop = ((DXFHatch) e).getBoundaryLoops();
                while (loop.hasNext()) {
                    Iterator edge = ((HatchBoundaryLoop) loop.next()).getBoundaryEdgesIterator();
                    while (edge.hasNext()) {
                        Object n = edge.next();
                        if (n instanceof DXFArc) {
                            Point center = ((DXFArc) n).getCenterPoint();
                            double sa = ((DXFArc) n).getStartAngle();
                            double ea = ((DXFArc) n).getEndAngle();
                            double r = ((DXFArc) n).getRadius();

                            points.add(((DXFArc) n).getStartPoint());
                            for (double i = sa + angleInterval; i < ea; i += angleInterval) {
                                double x = center.getX() + Math.cos(i / 180 * Math.PI) * r;
                                double y = center.getY() + Math.sin(i / 180 * Math.PI) * r;
                                points.add(new Point(x, y, 0));
                            }
                            points.add(((DXFArc) n).getEndPoint());

                        } else if (n instanceof DXFLine) {
                            points.add(((DXFLine) n).getStartPoint());
                            points.add(((DXFLine) n).getEndPoint());
                        }
                    }
                }
            }
        }

        return points;
    }
}
