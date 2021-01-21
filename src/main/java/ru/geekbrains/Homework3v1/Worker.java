package ru.geekbrains.Homework3v1;

public class Worker {
    private String fullName;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Worker(String fullName, String position, String email, String number, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.println("ФИО: " + fullName+ "\nДолжность: " + position + "\nemail: " + email +
                "\nНомер телефона: " + number +  "\nЗарплата: " + salary + "\nВозраст: " + age);
    }
    public int getAge(){
        return age;
    }

}
