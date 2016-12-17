package com.wolfgang;

/**
 * Created by johna on 12/16/2016.
 */
public class Windows {

    private String type;
    private Dimensions dimensions;

    public Windows(String type, Dimensions dimensions) {
        this.type = type;
        this.dimensions = dimensions;
    }

    public String getType() {
        return type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
