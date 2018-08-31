package com.santonov;

public enum Builder {

    FENDER;

    @Override
    public String toString() {
        switch (this) {
            case FENDER:
                return "Fender";
            default:
                return "Unknown";
        }
    }
}
