package org.example;

public class Employee {

    //задание 1

    private String fullName;
    private String job_title;
    private String email;
    private String phone;
    private double salary; //int не вписалось, да и с double информация выглядит приятнее...
    private int age;

    public Employee(String fullName, String job_title, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.job_title = job_title;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + job_title);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    //задание 2

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Наталья Казакова", "Администратор", "kazakova@gmail.com", "+7 999 574 67 65", 60000, 41);
        employees[1] = new Employee("Екатерина Лукина", "Менеджер по подбору персонала", "lukina@gmail.com", "+7 372 525 54 23", 45000, 28);
        employees[2] = new Employee("Владимир Кумаков", "Менеджер", "kumakow@gmail.com", "+7 535 535 24 64", 46000, 32 );
        employees[3] = new Employee("Марина Некрасова", "Руководитель отдела продаж", "nekrasova@yandx.ru", "+7 542 426 53 24", 63000, 46);
        employees[4] = new Employee("Татьяна Васильева", "Оператор технической поддержки", "vasileva@mail.ru", "+7 257 426 14 85", 34500, 25);
        for (Employee employee : employees)
        {
            employee.printInfo();
        }
    }

}
