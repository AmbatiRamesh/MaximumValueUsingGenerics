package com.bridgelabz.generics;

public class MaximumValue {
    public static <String extends Comparable<String>>  String maximum(String  A, String B, String C) {
        String maximumNumber = A;
        if (A.compareTo(B) > 0 && A.compareTo(C) > 0)
            maximumNumber = A;
        else if (B.compareTo(A) > 0 && B.compareTo(C) > 0)
            maximumNumber = B;
        else
            maximumNumber = C;
        return maximumNumber;
    }
    public static void main(String[] args) {
        System.out.println("The max Number Among Three String numbers is: " + maximum("Virat","Dhoni","Rohit"));
    }
}
