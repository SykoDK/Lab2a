package edu.umw.lab2a;

public class Lab2a {

    public static boolean isWeekend(String dayOfWeek) {
        return dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday");
    }

    public static double gradePoints(String letterGrade){
       double gradeA = 4.0;
       double gradeB = 3.0;
       double gradeC = 2.0;
       double gradeD = 1.0;
       double gradeF = 0.0;

        if (letterGrade.equals("A")) {
            return gradeA;
        } else if (letterGrade.equals("B")){
                return gradeB;
        } else if (letterGrade.equals("C")){
            return gradeC;
        } else if (letterGrade.equals("D")) {
            return gradeD;
        } else {
            return gradeF;
        }
    }

    public static void main(String[] args){
        System.out.println(isWeekend("Sunday"));
        System.out.println(isWeekend("Monday"));
        System.out.println(isWeekend("Tuesday"));
        System.out.println(isWeekend("Wednesday"));
        System.out.println(isWeekend("Thursday"));
        System.out.println(isWeekend("Friday"));
        System.out.println(isWeekend("Saturday"));
        System.out.println(gradePoints("A"));
        System.out.println(gradePoints("B"));
        System.out.println(gradePoints("C"));
        System.out.println(gradePoints("D"));
        System.out.println(gradePoints("F"));
    }
}
