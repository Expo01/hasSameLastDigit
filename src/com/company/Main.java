package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(1,22,22));
        System.out.println(hasSameLastDigit(22,1,22));
        System.out.println(hasSameLastDigit(22,22,1));
        System.out.println(hasSameLastDigit(10,20,33));
        System.out.println(hasSameLastDigit(10,33,20));
        System.out.println(hasSameLastDigit(33,10,20));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((x < 10 || x > 1000) || (y < 10 || y > 1000) || (z < 10 || z > 1000)) {
            return false;
        } else if ( (x % 10 == y % 10 || x % 10 == z % 10 || y % 10 == z % 10) ){
            return true;
        } return false;
    }
}
