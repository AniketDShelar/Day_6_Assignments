package com.intellijide.logicalcoreprograms;

public class BinarySearch {
    static double sqrt(double c) {

        double t = c;
        double epsilon = 1e-15;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2;
        }

        return t;
    }
}
