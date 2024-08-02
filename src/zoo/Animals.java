package zoo;

abstract class Animal implements ISoundable
{
    private String name;
    public Animal(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

