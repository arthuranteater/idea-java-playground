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
        if (args.length > 0) {
            System.out.println("hello " + args[0]);
        }
        isActive("active");
        System.out.println(grade(70));
        Loop loop1 = new Loop();
        loop1.printAllNums(45, 50);
        loop1.printEvenNums(2,6);
        Table roundTable = new Table();
        roundTable.setShape("round");
        System.out.println(roundTable);
    }
}
