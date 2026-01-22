package Pet;

public class Snake extends Pet {
    private String colour;
    public Snake(int age, String colour){
        super(age);
        this.colour = colour;
    }
    public String getColour(){
        return this.colour;
    }
    public String toString(){
        return "age of pet "+ this.age + " colour of snake "+ this.colour;
    }
}
