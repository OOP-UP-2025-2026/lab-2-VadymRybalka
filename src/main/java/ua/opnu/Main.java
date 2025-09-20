package ua.opnu;

public class Main {
    public static void main(String[] args) {

        Student vadym = new Student("Вадім Рибалка", 2);

        vadym.addCourse("Теорія Алгоритмів");
        vadym.addCourse("Засоби ШІ у веб-технологіях");
        vadym.addCourse("ООП");
        vadym.addCourse("Укр. мова");
        vadym.addCourse("Організація баз даних та знань");
        vadym.addCourse("Теорія ймовірностей й мат.статистика");

        System.out.println(vadym.getName() + ": дисциплін - " + vadym.getCourseCount());
        System.out.println(vadym.getName() + ": рік - " + vadym.getYear());
        System.out.println(vadym.getName() + ": навчання - " + vadym.getTuition());
    }
}