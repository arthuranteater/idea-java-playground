package com;

public class Application {

    public static boolean isActive(String status) {
        if (status.equals("active")) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    public static String grade(int input) {
        if (input > 89) {
            return "A";
        } else if (input > 79) {
            return "B";
        } else if (input > 69) {
            return "C";
        } else if (input > 59) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        isActive("active");
        System.out.println(grade(70));
    }
}
