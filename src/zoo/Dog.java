package zoo;

public class Dog extends Animal
{
    public Dog(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println(getName() + " издает звук: Гав");
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println(getName() + " издает звук: Мяу");
    }
}
class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println(getName() + " издает звук: Вася идиот!");
    }
}
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " издает звук: Чирик чирик");
    }
}
class Crow extends Animal {
    public Crow(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println(getName() + " издает звук: Кар Кар");
    }
}