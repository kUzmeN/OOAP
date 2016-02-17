package com.company;

public enum Wood {
    INDIAN_WOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
    MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;


    @Override
    public String toString() {
        switch (this) {
            case INDIAN_WOOD:
                return "Indian_wood";
            case BRAZILIAN_ROSEWOOD:
                return "Brazilian_rosewood";
            case MAHOGANY:
                return "Mahogany";
            case MAPLE:
                return "Maple";
            case COCOBOLO:
                return "Cocobolo";
            case CEDAR:
                return "Cedar";
            case ADIRONDACK:
                return "Adirondack";
            case ALDER:
                return "Alder";
            case SITKA:
                return "Sitka";
            default:
                return "SomthingWood";
        }
    }
}