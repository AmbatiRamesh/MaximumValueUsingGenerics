package com.bridgelabz.generics;

public class MaximumValue<T> {
    T number1;
    T number2;
    T number3;
    public MaximumValue(T number1, T number2, T number3){
        super();
       this.number1 = number1;
       this.number2 = number2;
       this.number3 = number3;
    }
    public <T extends Comparable<T>> T maximum(T number1, T number2, T number3) {
        T maximumNumber = number1;
        if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0)
            maximumNumber = number1;
        else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0)
            maximumNumber = number2;
        else
            maximumNumber = number3;
        return maximumNumber;
    }
    public static void main(String[] args) {
        System.out.println(new MaximumValue<>(20,40,30).maximum(20,40,30));
        System.out.println(new MaximumValue<>(20.40F,40.20F,60.30F).maximum(20.40F,40.20F,60.30F));
        System.out.println(new MaximumValue<>("Virat","Dhoni","Rohit").maximum("Virat","Dhoni","Rohit"));
    }
}