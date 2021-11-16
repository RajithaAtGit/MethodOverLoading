package com.gtrxone;

public class FeetInchesCentimeters {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double sumOfCm = (feet * 12d * 2.54d) + (inches * 2.54d);
            System.out.println(feet + " feet" + inches + " inches = " + sumOfCm);
            return sumOfCm;

        } else {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches > 0) {
            double feet = (int)(inches / 12);
            double remainInches = (int) inches % 12;
            System.out.println(inches + " inches = " + feet + "feet and " + remainInches + "inches");
            return calcFeetAndInchesToCentimeters(feet,remainInches);
        } else {
            System.out.println("Invalid inches parameter");
            return -1;
        }
    }

}
