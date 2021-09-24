public class Pet{
    private String name;
    private int age;

    private static int numPets = 0;

    public static int getNumPets(){
        return numPets;
    }

    public Pet(){
        name = "";
        age = 0;
        numPets++;
    }

    public Pet(String aName, int anAge){
        name = aName;
        age = anAge;
        numPets++;
    }

    public String getName(){
        return name;
    }

    public void setName(String aName){
        name = aName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int anAge){
        age = anAge;
    }

    public String toString(){
        return "Hi my name is " + name + " I am " + age + " years old.";
    }

}