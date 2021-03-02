package com.adkinslab;

public class Main {

    public static void main(String[] args) {
	    /*
	    The int keyword is used to declare a variable with the int datatype
        The Integer keyword is a Wrapper Class which provides metadata
        about the integer variable referenced.  In this case, the minimum
        and maximum values of an integer.
        */
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);

        /*
        Overflow and underflow happen when a value is pushed above or below
        the maximum or minimum for that datatype.  Example is below but note that
        neither the IDE nor the compiler throw an error when this occurs!
         */
        System.out.println("Overflowed Maximum Value: " + (myMaxIntValue + 1));
        System.out.println("Underflowed Minimum Value: " + (myMinIntValue - 1));

        /*
        The IDE will throw an error if you try to set the variable to a value
        outside of its range.  Example here:  Try to make the value 2147483648.
         */
        myMaxIntValue = 2147483647;

        //Same thing with Bytes
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);

        //Same thing with Shorts
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Maximum Value: " + myMaxShortValue);

        //Same thing with Longs but longs need an L after the value
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);

        //Narrow casting
        int myTotal = (myMinIntValue /2 );
        byte myByte = (byte) (myMinByteValue / 2);


        /*Challenge
        1) Create a byte variable and set it to any valid byte number.
        2) Create a short variable and set it to any valid short number.
        3) Create an int variable and set it to any valid int number.
        4) Create a long variable and make it equal to 50000 plus
           10 times the sum of the byte plus the short plus the int values.
         */
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);





    }
}
