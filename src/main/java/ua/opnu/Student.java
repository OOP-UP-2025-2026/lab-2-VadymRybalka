package ua.opnu;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String name;
    int year;
    List<String> courses = new ArrayList<>();

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    void addCourse(String courseName) {
        if (courseName != null && !courseName.isEmpty()) {
            courses.add(courseName);
        }
    }

    void dropAll() {
        courses.clear();
    }

    int getCourseCount() {
        return courses.size();
    }

    String getName() {
        return this.name;
    }

    int getYear() {
        return this.year;
    }

    long getTuition() {
        return (long) getYear() * 22205;
    }
}