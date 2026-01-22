package Pet;
import java.util.*;
public class Bird extends Pet {
    private String breed;
    public Bird(int age, String breed){
        super(age);
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }
    public String toString(){
        return "age of pet "+ this.age + " breed of bird "+ this.breed;
}
}