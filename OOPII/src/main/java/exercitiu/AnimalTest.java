package exercitiu;

public class AnimalTest {
    public static void main(String[] args) {
        Animal spider = new Spider();
        spider.walk();

        Fish fish = new Fish();
        ((Fish) fish).setName("Fish");
        fish.eat();
        ((Fish) fish).play();

        Pet[] petsList = new Pet[10];
        addPetsInList(petsList, fish);
    }

    public static void addPetsInList(Pet[] pets, Pet petToAdd) {
        //add the petToAdd into pets list
    }
}
