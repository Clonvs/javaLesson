package lesson6;

import java.util.Objects;

public class HashCat {
    String name;
    String breed;
    int age;

    public HashCat(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || this.getClass() != obj.getClass()) return false;

        HashCat o = (HashCat) obj;
        return this.name.equals(o.name) && this.age == o.age;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, breed, age);
    }

    @Override
    public String toString(){
        return "HashCat name: " + name + ", breed: " + breed + ", age: " + age;
    } 
}
