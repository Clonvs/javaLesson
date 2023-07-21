package lesson6;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Cat> cats = new HashSet<>();
        HashSet<HashCat> hashCats = new HashSet<>();

        Cat cat1 = new Cat("Barsik", "Britain", 7);
        Cat cat2 = new Cat("Barsik", "Britain", 7);
        Cat cat3 = new Cat("Barsik", "Britain", 7);

        HashCat cat4 = new HashCat("Barsik", "Britain", 7);
        HashCat cat5 = new HashCat("Barsik", "Britain", 7);
        HashCat cat6 = new HashCat("Barsik", "Britain", 7);

        System.out.println("cats.add (cat1) = " + cat1);
        System.out.println("cats.add (cat2) = " + cat2);
        System.out.println("cats.add (cat3) = " + cat3);
        System.out.println();

        System.out.println("HashCats.add (cat4) = " + hashCats.add(cat4));
        System.out.println("HashCats.add (cat5) = " + hashCats.add(cat5));
        System.out.println("HashCats.add (cat6) = " + hashCats.add(cat6));
        System.out.println();

        for(Cat cat : cats){
            System.out.println(cat.toString());
        }
        System.out.println();

        for(HashCat hashCat : hashCats){
            System.out.println(hashCat.toString());
        }
        System.out.println();
    }
}
