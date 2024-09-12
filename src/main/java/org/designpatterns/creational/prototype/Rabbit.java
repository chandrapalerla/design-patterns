package org.designpatterns.creational.prototype;

public class Rabbit implements Cloneable {

    //Age in months
    private int age;
    private Breed breed;
    private Person owner;
    public Rabbit() {

    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(String name) {
        Person owner = new Person(name);
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public Rabbit clone() {
        try {
            Rabbit rabbit = (Rabbit) super.clone();
            //rabbit.owner = owner.clone();
            return rabbit;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public enum Breed {
        HIMALAYAN,
        AMERICAN,
        MINI_REX,
        LIONHEAD,
        DUTCH
    }

}
