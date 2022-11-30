package org.example.chapter10;

public class Zoo {

    public static void main(String [] arg){

       Dog rocky = new Dog();
       rocky.fetch();
       rocky.makeSound();
       feed(rocky);


        Animal sasha = new Dog();
        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
        feed(sasha);
    }

    public static void feed(Animal animal){

        if(animal instanceof Dog){
            System.out.println("here is your dog");
        }
        else if(animal instanceof Cat){
            System.out.println("here is your cat food");
        }
    }

}
