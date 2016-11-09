package org.coyove.ifc;

import ifc2x3javatoolbox.guidcompressor.GuidCompressor;
import ifc2x3javatoolbox.ifc2x3tc1.*;
import ifc2x3javatoolbox.ifcmodel.*;
import org.coyove.eugine.util.ErrorHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Collection;

/**
 * Created by coyove on 2016/11/9.
 */
public class Model {
    public static IfcDirection xDirection = new IfcDirection(new LIST<DOUBLE>() {{
        add(new DOUBLE(1.0));
        add(new DOUBLE(0));
        add(new DOUBLE(0));
    }});

    public static IfcDirection yDirection = new IfcDirection(new LIST<DOUBLE>() {{
        add(new DOUBLE(0));
        add(new DOUBLE(1.0));
        add(new DOUBLE(0));
    }});

    public static IfcDirection zDirection = new IfcDirection(new LIST<DOUBLE>() {{
        add(new DOUBLE(0));
        add(new DOUBLE(0));
        add(new DOUBLE(1.0));
    }});

    public static IfcModel load(String path) throws Exception {
        IfcModel model = new IfcModel();
        model.readStepFile(new FileInputStream(path));
        model.addIfcObject(xDirection);
        model.addIfcObject(yDirection);
        model.addIfcObject(zDirection);

        Collection<IfcWall> walls = model.getCollection(IfcWall.class);
        for (IfcWall wall : walls) {
            for (IfcRepresentation r : wall.getRepresentation().getRepresentations()) {
                for (IfcRepresentationItem item : r.getItems()) {

                }
            }

            IfcObjectPlacement op = new IfcLocalPlacement(((IfcLocalPlacement) wall.getObjectPlacement())
                    .getPlacementRelTo(), buildDefaultPlacementSpace(model, 100,0,0));
            model.addIfcObject(op);

            model.addIfcObject(new IfcWallStandardCase(newRandomGUID(), wall.getOwnerHistory(),
                    wall.getName(), wall.getDescription(), wall.getObjectType(),
                    op,
                    wall.getRepresentation(),
                    wall.getTag()));
            break;
        }

        model.writeStepfile(new FileOutputStream("new.ifc"));
        return model;
    }

    public static IfcGloballyUniqueId newRandomGUID() {
        IfcGloballyUniqueId ret = new IfcGloballyUniqueId();
        ret.setEncodedValue(GuidCompressor.getNewIfcGloballyUniqueId());
        return ret;
    }

    public static IfcAxis2Placement3D buildDefaultPlacementSpace(IfcModel model, double x, double y, double z) {
        LIST<IfcLengthMeasure> point = new LIST<IfcLengthMeasure>();
        point.add(new IfcLengthMeasure(x));
        point.add(new IfcLengthMeasure(y));
        point.add(new IfcLengthMeasure(z));

        IfcCartesianPoint p = new IfcCartesianPoint(point);
        model.addIfcObject(p);

        IfcAxis2Placement3D pos = new IfcAxis2Placement3D(p, zDirection, xDirection);
        model.addIfcObject(pos);
        return pos;
    }
}
