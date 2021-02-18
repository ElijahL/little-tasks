package com.epam.jwd.tasks01.application_context;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class Solution {
    public static int firstTask(int lastDigit) throws IllegalArgumentException {
        if(lastDigit < 0  || lastDigit > 9){
            throw new IllegalArgumentException("Passed arguments are invalid: " + lastDigit);
        }

        return (int) (Math.pow(lastDigit, 2) % 10);
    }

    public static int secondTask(int month, int year) throws IllegalArgumentException {
        if(month < 0 || month > 12 || year < 0){
            throw new IllegalArgumentException("Passed arguments are invalid: [" + month + ", " + year + "]");
        }

        boolean isLeap = false;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            isLeap = true;
        }

        if (month % 2 == 1){
            return 31;
        } else {
            if(month == 2) {
                if(isLeap){
                    return 29;
                }
                return 28;
            }
            return 30;
        }
    }

    public static double thirdTask(double area) throws IllegalArgumentException{
        if (area < 0){
            throw new IllegalArgumentException("Passed argument is invalid: " + area);
        }

        return area / 2;
    }

    public static boolean fourthTask(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber)
            throws IllegalArgumentException {
        Integer[] numbers = new Integer[]{
                firstNumber,
                secondNumber,
                thirdNumber,
                fourthNumber};

        int counter = 0;
        for(Integer number: numbers){
            if (counter >= 2){
                return true;
            }
            if (isEven(number)){
                counter++;
            }
        }

        return false;
    }

    private static boolean isEven(Integer number){
        return number % 2 == 0;
    }

    public static boolean fifthTask(int number) throws IllegalArgumentException {
        if(number <= 0) {
            throw new IllegalArgumentException("Passed argument is invalid: " + number);
        }

        int sumOfDividers = 0;
        for (int i = 1; i < number/2; ++i){
            if(number % i == 0){
                sumOfDividers += i;
            }
        }
        return sumOfDividers == number;
    }

    public static Calendar sixthTask(int seconds) throws IllegalArgumentException {
        if(seconds < 0 || seconds > 86400) {
            throw new IllegalArgumentException("Passed argument is invalid: " + seconds);
        }

        Calendar result = new GregorianCalendar();
        result.setTimeInMillis(seconds * 1000);

        return result;
    }

    public static int seventhTask(double x1, double y1, double x2, double y2) throws IllegalArgumentException {
        double firstLength = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double secondLength = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        if (firstLength < secondLength){
            return  1;
        } else if(firstLength > secondLength){
            return  2;
        } else {
            return  0;
        }
    }

    public static double eightsTask(double x) throws IllegalArgumentException {
        return  (x < 3) ? ifLessThanThree(x) : ifGreaterThanThree(x);
    }

    private static double ifLessThanThree(double x){
        return 1 / (Math.pow(x, 3) - 6);
    }

    private static double ifGreaterThanThree(double x){
        return -Math.pow(x, 2) + 3 * x + 9;
    }

    public static double[] ninthTask(double radius) throws IllegalArgumentException{
        if(radius < 0) {
            throw new IllegalArgumentException("Passed argument is invalid: " + radius);
        }

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        return new double[]{ perimeter, area};
    }
    
    public static Map<Double, Double> tenthTask(double a, double b, double step) throws IllegalArgumentException {
        if(!isArgsCorrect(a, b, step)) {
            throw new IllegalArgumentException("Passed arguments are invalid: ["
                    + a + ", "
                    + b + ", "
                    + step + "]");
        }

        int numberOfArguments = (int) ((b - a) / step);
        Map<Double, Double> tableOfArgVal = new TreeMap<>();
        double[][] table = new double[numberOfArguments + 1][numberOfArguments + 1];
        for (int i = 0; i < numberOfArguments; ++i){
            double arg = a + i * step;
            double val = Math.tan(arg);
            tableOfArgVal.put(arg, val);
        }

        return tableOfArgVal;
    }

    private static boolean isArgsCorrect(double a, double b, double step){
        if (a > b || ((int) ((b - a) % step) != 0)){
            return false;
        } else {
            return a != b ? step > 0 : step == 0;
        }
    }
}
