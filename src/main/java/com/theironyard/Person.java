package com.theironyard;

/**
 * Created by psubedi2020 on 3/13/17.
 */
public class Person {
    String name;
    String city;
    String age;

    public Person(String name, String city, String age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}


