package classes;

import cat.cat;
import cat.food.Food;
import smartphone.Apple;
import student.Student;


public class ClassesObject {
    public static void main(String[] args) {

        Apple iphone = new Apple();

        Food favFood = new Food();


        cat tom = new cat("Tom", "Red");

        System.out.println("cat's Name: " + tom.getName());
        System.out.println("cat's Age: " + tom.getAge());
        System.out.println("cat's Color: " + tom.getColor());
        tom.move();

        Student std = new Student(1, "Tran The Hieu", 19 );
        Student hoang = new Student(1);
        hoang.setName("Hoang");
        System.out.println("Student Name: " + hoang.getName());
        System.out.println("================================");


        System.out.println("Student Name: " + std.getName());
        System.out.println("Student Age: " + std.getAge());
        System.out.println("ID: " + std.getId());






    }
}
