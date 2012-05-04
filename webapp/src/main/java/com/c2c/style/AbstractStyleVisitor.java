package com.c2c.style;

import org.geotools.styling.*;

/**
 * User: jeichar
 * Date: Sep 6, 2010
 * Time: 3:11:02 PM
 */
public abstract class AbstractStyleVisitor implements StyleVisitor {

    public void visit(StyledLayerDescriptor sld) {
		// Not implemented
	}

    public void visit(NamedLayer layer) {
		// Not implemented
    }

    public void visit(UserLayer layer) {
		// Not implemented
    }

    public void visit(FeatureTypeConstraint ftc) {
		// Not implemented
    }

    public void visit(Style style) {
    	for (FeatureTypeStyle fts : style.featureTypeStyles()) {
    		fts.accept(this);
    	}
    }

    public void visit(Rule rule) {
    	for (Symbolizer symbolizer : rule.symbolizers()) {
    		symbolizer.accept(this);
    	}
    }

    public void visit(FeatureTypeStyle fts) {
    	for (Rule rule : fts.rules()) {
    		rule.accept(this);
    	}
    }

    public void visit(Fill fill) {
		// Not implemented
    }

    public void visit(Stroke stroke) {
		// Not implemented
    }

    public void visit(Symbolizer sym) {
		// Not implemented
    }

    public void visit(PointSymbolizer ps) {
		// Not implemented
    }

    public void visit(LineSymbolizer line) {
		// Not implemented
    }

    public void visit(PolygonSymbolizer poly) {
		poly.getFill().accept(this);
    }

    public void visit(TextSymbolizer text) {
		// Not implemented
    }

    public void visit(RasterSymbolizer raster) {
		// Not implemented
    }

    public void visit(Graphic gr) {
		// Not implemented
    }

    public void visit(Mark mark) {
		// Not implemented
    }

    public void visit(ExternalGraphic exgr) {
		// Not implemented
    }

    public void visit(PointPlacement pp) {
		// Not implemented
    }

    public void visit(AnchorPoint ap) {
		// Not implemented
    }

    public void visit(Displacement dis) {
		// Not implemented
    }

    public void visit(LinePlacement lp) {
		// Not implemented
    }

    public void visit(Halo halo) {
		// Not implemented
    }

    public void visit(ColorMap colorMap) {
		// Not implemented
    }

    public void visit(ColorMapEntry colorMapEntry) {
		// Not implemented
    }

    public void visit(ContrastEnhancement contrastEnhancement) {
		// Not implemented
    }

    public void visit(ImageOutline outline) {
		// Not implemented
    }

    public void visit(ChannelSelection cs) {
		// Not implemented
    }

    public void visit(OverlapBehavior ob) {
		// Not implemented
    }

    public void visit(SelectedChannelType sct) {
		// Not implemented
    }

    public void visit(ShadedRelief sr) {
		// Not implemented
    }
}
