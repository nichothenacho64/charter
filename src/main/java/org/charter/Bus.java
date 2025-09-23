package org.charter;

public class Bus {
    String number;
    String pointA;
    String pointB;
    String importantAreas;
    String extraSpecifications; // accounting for limited stops and other trailing details

    Bus(String number, String pointA, String pointB, String importantAreas,
        String extraSpecifications) {
        this.number = number;
        this.pointA = pointA;
        this.pointB = pointB;
        this.importantAreas = importantAreas;
        this.extraSpecifications = extraSpecifications;
    }

    public static String[] splitBusPlaceValues(String values) {
        String[] splitValues;
        splitValues = values.split(" ");
        return splitValues;
    } // make this into the means of initialisation
}