package org.example;

public class Dog {
    private String name;
    private int age;
    private boolean isMale; //true - male, false - female

    private int legs;
    private void sleep() {

    }

    public void eat() {
        sleep();
    }

    public String bark() {
        return "Woof Woof!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public Dog(int legs) {
        this.legs = legs;
    }

    public Dog(String name, int age, boolean isMale, int legs) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.legs = legs;
    }
}
