package com.santonov;

public enum Wood {

    INDIAN_ROSEWOOD, MAPLE;

    @Override
    public String toString() {
        switch (this) {
            case INDIAN_ROSEWOOD:
                return "Indian rosewood";
            case MAPLE:
                return "Maple";
            default:
                return "Unknown";
        }
    }
}
