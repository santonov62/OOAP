package com.santonov;

import java.util.Objects;

public class GuitarSpec {

    Builder builder;
    String model;
    Type type;
    Wood backWood;
    Wood topWood;
    String numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, String numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public String getNumStrings() {
        return numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public boolean matches(GuitarSpec otherSpec) {
        if (builder != otherSpec.builder)
            return false;
        if ((model != null) && (!model.equals("")) &&
                (!model.equals(otherSpec.model))) return false;
        if (type != otherSpec.type) return false;
        if (numStrings != otherSpec.numStrings) return false;
        if (backWood != otherSpec.backWood) return false;
        if (topWood != otherSpec.topWood) return false;
        return true;
    }
}
