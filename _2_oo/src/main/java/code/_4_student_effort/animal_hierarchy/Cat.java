package code._4_student_effort.animal_hierarchy;

public class Cat extends Animal implements Pet{
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    public void eat(){
        System.out.println("Pisica este un pradator");
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("The cat is playing");
    }
}
