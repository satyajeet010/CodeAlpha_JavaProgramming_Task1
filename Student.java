/*STUDENT CLASS*/

import java.util.*;

class Student {
    static int topperRoll;
    static String topperName;
    static double topperGrade = Double.MIN_VALUE;
    String name;
    int roll;
    ArrayList<Double> grades;

    // Constructor
    public Student(String name,int roll) {
        this.name = name;
        this.roll = roll;
        this.grades = new ArrayList<Double>();
    }

    // Add a grade
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // Calculate average
    public double getAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        if(topperGrade < sum/grades.size()){
            topperGrade = sum/grades.size();
            topperRoll = roll;
            topperName = name;
        }
        return sum / grades.size();
    }

    // Get highest grade
    public double getHighestGrade() {
        return Collections.max(grades);
    }

    // Get lowest grade
    public double getLowestGrade() {
        return Collections.min(grades);
    }
}