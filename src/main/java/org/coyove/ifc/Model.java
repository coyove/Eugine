package org.coyove.ifc;

import ifc2x3javatoolbox.guidcompressor.GuidCompressor;
import ifc2x3javatoolbox.ifc2x3tc1.*;
import ifc2x3javatoolbox.ifcmodel.*;
import org.apache.commons.lang3.ClassUtils;

import java.io.FileInputStream;
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
//        model.addIfcObject(xDirection);
//        model.addIfcObject(yDirection);
//        model.addIfcObject(zDirection);
//
//        Collection<IfcBuildingElementProxyType> walls = model.getCollection(IfcBuildingElementProxyType.class);
//        for (IfcBuildingElementProxyType vol : walls) {
////            IfcObjectPlacement op = new IfcLocalPlacement(((IfcLocalPlacement) wall.getObjectPlacement())
////                    .getPlacementRelTo(), buildDefaultPlacement(model, 100,0,0));
////            model.addIfcObject(op);
////
////            model.addIfcObject(new IfcWallStandardCase(newRandomGUID(), wall.getOwnerHistory(),
////                    wall.getName(), wall.getDescription(), wall.getObjectType(),
////                    op,
////                    wall.getRepresentation(),
////                    wall.getTag()));
//
//            LIST<IfcRepresentationMap> maps = vol.getRepresentationMaps();
//
//            final IfcRepresentationMap map = (IfcRepresentationMap) maps.get(0).clone();
//            map.setMappingOrigin(buildDefaultPlacement(model, 100, 0, 0));
//            map.setMappedRepresentation(maps.get(0).getMappedRepresentation());
//
//            for (IfcRepresentationItem iri : map.getMappedRepresentation().getItems()) {
//                IfcClosedShell ics =  ((IfcFacetedBrep) iri).getOuter();
//
//                for (IfcFace face : ics.getCfsFaces()) {
//                    for (IfcFaceBound ifb : face.getBounds()) {
//                        for (IfcCartesianPoint icp : ((IfcPolyLoop) ifb.getBound()).getPolygon()) {
//                            //
//                            for (IfcLengthMeasure ilm : icp.getCoordinates()) {
//                                System.out.print(ilm + " ");
//                            }
//                            System.out.println();
//                        }
//                    }
//                }
//            }
//
//            model.addIfcObject(map);
//
//            IfcGloballyUniqueId guid = newRandomGUID();
//
//            IfcBuildingElementProxyType v = new IfcBuildingElementProxyType(guid,
//                    vol.getOwnerHistory(), new IfcLabel("vol2_type", true), new IfcText(), new IfcLabel(),
//                    new SET<IfcPropertySetDefinition>(), new LIST<IfcRepresentationMap>() {{
//                add(map);
//            }},new IfcLabel(), new IfcLabel(), vol.getPredefinedType());
//
//            IfcBuildingElementProxy proxy = ((IfcBuildingElementProxy) model.getIfcObjectByID
//                    ("04SGlrFrH018J__bR_pLdV"));
//            IfcProductRepresentation rep = proxy.getRepresentation();
//
//
//            IfcLocalPlacement pos = new IfcLocalPlacement(new IfcLocalPlacement(), buildDefaultPlacement(model,
//                    1000,0,0));
//
//            model.addIfcObject(pos);
//
//            IfcBuildingElementProxy p = new IfcBuildingElementProxy(guid,
//                    vol.getOwnerHistory(), new IfcLabel("vol2", true), new IfcText(),
//                    new IfcLabel(), pos, rep, new IfcIdentifier(), proxy.getCompositionType());
//
////            model.addIfcObject(v);
////            model.addIfcObject(p);
//            break;
//        }
//
//        model.writeStepfile(new FileOutputStream("new.ifc"));
        return model;
    }

    public static void createVolume(
            IfcModel model,
            IfcBuildingElementProxy ref,
            String name,
            String desc,
            double x, double y, double z) {
        IfcLocalPlacement pos = new IfcLocalPlacement(new IfcLocalPlacement(), buildDefaultPlacement(model,
                x, y, z));
        model.addIfcObject(pos);

        model.addIfcObject(new IfcBuildingElementProxy(newRandomGUID(),
                ref.getOwnerHistory(), new IfcLabel(name, true), new IfcText(desc, true),
                new IfcLabel(), pos, ref.getRepresentation(),
                new IfcIdentifier(), ref.getCompositionType()));
    }

    public static IfcGloballyUniqueId newRandomGUID() {
        IfcGloballyUniqueId ret = new IfcGloballyUniqueId();
        ret.setEncodedValue(GuidCompressor.getNewIfcGloballyUniqueId());
        return ret;
    }

    public static IfcAxis2Placement3D buildDefaultPlacement(IfcModel model, double x, double y, double z) {
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

    public static Collection getObjectsByType(IfcModel model, String cls) {
        try {
            return model.getCollection(ClassUtils.getClass("ifc2x3javatoolbox.ifc2x3tc1." + cls));
        } catch (ClassNotFoundException ex) {
            return null;
        }
    }
}
