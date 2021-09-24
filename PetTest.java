import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PetTest {


    public static void main(String[] args){

        /*Dog dog1 = new Dog();

        dog1.setName("Tam");
        dog1.setAge(3);
        dog1.setDogBreed("Shih Tzu");
        Cat myCat = new Cat("Fluffy", 5, "Calico");

        System.out.println(dog1.speak());
        System.out.println(myCat.speak()); */

        String[] dogBreeds = {"Shih Tzu", "Grey Hound", "Pomeranian", "Terrier", "Alsatian"};
        String[] catBreeds = {"Calico", "Tabby", "Bengal", "Siamese", "Sphynx"};


        Pet[] pets = new Pet[5];
        Scanner input = new Scanner(System.in);
        int age;
        String breed;
        Random rand = new Random();
        String name;
        int upperbound = 10;
        int length = 5;

        for (int i = 0; i < 5; i++){
            System.out.println("Which pet would you like to add? (Dog / Cat)");
            String userInput = input.nextLine();

            if (userInput.equals("Dog")){
                System.out.println("What is their name?");
                name = input.nextLine();
                int intRandom = rand.nextInt(upperbound);
                age = intRandom;
                int randomBreed = (int)(Math.random() * length);
                breed = dogBreeds[randomBreed];
                pets[i] = new Dog(name, age, breed);
            }
            else if (userInput.equals("Cat")){
                System.out.println("What is their name?");
                name = input.nextLine();
                int intRandom = rand.nextInt(upperbound);
                age = intRandom;
                int randomBreed = (int)(Math.random() * length);
                breed = catBreeds[randomBreed];
                pets[i] = new Cat(name, age, breed);
            }
            else {
                System.out.println("Wrong input try again.");
            }

        }

        for(int i = 0; i < 5; i++){
            System.out.println(pets[i]);

        }

        System.out.println("\nThere are a total of " +
                Pet.getNumPets() + " pets.");
        System.out.println("Were there are " + Dog.getNumDogs() +
                " dogs and " + Cat.getNumCats() + " are cats.");

        String pet = "";
        String task="";
        String lineToRead;

        System.out.println("Which pet would you like to search?");
        lineToRead = input.nextLine();

        if(pet.startsWith(lineToRead)){
            System.out.println(pet);
        }
    }

}


        /* The application should create an array of 5 animals which is populated by repeatedly
        prompting the user whether they want to add a cat or dog to the collection.

       • Each animal should be created by selecting a random age (within a sensible range)
        and a random breed selected from lists specified as arrays. The animal’s name
        should be provided by the user when promoted.

       • When all animals have been created, the application should output the number of
        cats and the number of dogs that have been generated and should prompt the user
        for the name of a pet.

       • When a pet name is provided, the application should search for the pet in the
        collection and call its speak() method if it is found, or provide a suitable message
        if not. The application should repeat this process until the special pet name “exit” is
        provided by the user.
        */
