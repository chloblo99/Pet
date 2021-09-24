public class Dog extends Pet{
    private String breed;

    private static int numDogs = 0;

    public static int getNumDogs(){
        return numDogs;
    }

    public Dog(){
        super();
        breed = "";
        numDogs++;
    }

    public Dog(String aName, int anAge, String dogBreed){
        super(aName, anAge);
        breed = dogBreed;
        numDogs++;
    }

    public String getDogBreed(){
        return breed;
    }

    public void setDogBreed(String dogBreed){
        breed = dogBreed;
    }

    public String speak(){
        String str = "Woof! " + super.toString();
        str += " I am a " + breed;
        return str;
    }


} 