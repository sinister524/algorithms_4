package ru.geekbrains.algorithms4;

import java.util.Objects;

public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        int hash = name != null ? name.hashCode() : 0;;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals node = (Animals) o;
        if (age != node.age) return false;
        return name != null ? name.equals(node.name) : node.name == null;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+", age: "+this.age;
    }


}