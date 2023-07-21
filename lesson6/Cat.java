package lesson6;

public class Cat {
    String name;
    String breed;
    int age;
        
    public Cat(String name, String breed, int age){
            this.name = name;
            this.breed = breed;
            this.age = age;
        }

    @Override
    public String toString(){
        return "Cat name: " + name + ", breed: " + breed + ", age " + age;
    }
    
}
    
