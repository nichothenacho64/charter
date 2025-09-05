package org.charter;

public class Bus {
    String number;
    String[] areas;

    public Bus(String number, String[] areas) {
        this.number = number;
        this.areas = areas;
    }

    public static void splitBusPlaceValues(String values) {
        String[] splitValues = values.split(" ");
        for (String value : splitValues) {
            System.out.println(value);
        } // sort out return value later
    }
}