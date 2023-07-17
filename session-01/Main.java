package org.example;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(3);
        myDog.setAge(2);
        myDog.setMale(false);
        myDog.setName("milo");

        System.out.println(myDog.getLegs());
        System.out.println(myDog.getAge());
        System.out.println(myDog.isMale());
        System.out.println(myDog.getName());
    }


}