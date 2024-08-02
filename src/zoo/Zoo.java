package zoo;

import java.util.ArrayList;
import java.util.List;
class Zoo {
    private String name;
    private List<Animal> animals;

    public Zoo(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " добавлен в зоомагазин " + name);
    }

    public void hearAnimalSounds() {
        System.out.println("Звуки животных в зоомагазине " + name + ":");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}