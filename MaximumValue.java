package com.bridgelabz.generics;

public class MaximumValue {
    public static  <R extends Comparable<R>>  R maximum(R  A, R B, R C) {
        R maximumNumber = A;
        if (A.compareTo(B) > 0 && A.compareTo(C) > 0)
            maximumNumber = A;
        else if (B.compareTo(A) > 0 && B.compareTo(C) > 0)
            maximumNumber = B;
        else
            maximumNumber = C;
        return maximumNumber;
    }
    public static void main(String[] args) {
        System.out.println(maximum(20,40,30));
        System.out.println(maximum(20.40F,40.20F,30.30F));
        System.out.println(maximum("Virat","Dhoni","Rohit"));
    }
}
