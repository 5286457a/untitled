package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Test7 {
    public static void main(String[] args) {

        Person p = new Person("zhangsan");
        Person p2 = new Person("zhangsan");
        Person p3 = new Person("lisi");
        Set<Person> set = new HashSet<>();
        set.add(p);
        set.add(p2);
        set.add(p3);
        System.out.println(set.size());
    }
}

class Person {
    public String name;
    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        return name.equals(((Person)o).name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
