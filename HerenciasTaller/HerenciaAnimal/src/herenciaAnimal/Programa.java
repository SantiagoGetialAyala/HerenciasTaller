package herenciaAnimal;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the cat: ");
        String catName = scanner.nextLine();
        Cat cat = new Cat(catName);

        System.out.print("Enter the name of the first dog: ");
        String dogName = scanner.nextLine();
        Dog dog = new Dog(dogName);

        System.out.print("Enter the name of the second dog: ");
        String anotherDogName = scanner.nextLine();
        Dog anotherDog = new Dog(anotherDogName);

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(anotherDog);

        System.out.print(catName + " says: ");
        cat.greets();

        System.out.print(dogName + " says: ");
        dog.greets();

        System.out.print(dogName + " greets " + anotherDogName + ": ");
        dog.greets(anotherDog);

        scanner.close();
    }
}
