package zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Магазин Животных");

        zoo.addAnimal(new Cat("Барсик"));
        zoo.addAnimal(new Dog("Рэкс"));
        zoo.addAnimal(new Crow("Черныш"));
        zoo.addAnimal(new Parrot("Кеша"));
        zoo.addAnimal(new Bird("Вася"));

        zoo.hearAnimalSounds();


    }
}