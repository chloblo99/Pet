public class Cat extends Pet{
    private String breed;

    private static int numCats = 0;

    public static int getNumCats(){
        return numCats;
    }

    public Cat(){
        super();
        breed = "";
        numCats++;
    }

    public Cat(String aName, int anAge, String catBreed){
        super(aName, anAge);
        breed = catBreed;
        numCats++;
    }

    public String getCatBreed(){

        return breed;
    }

    public void setCatBreed(String catBreed){

        breed = catBreed;
    }

    public String speak(){
        String str = "Meow! " + super.toString();
        str += " I am a " + breed;
        return str;
    }

}