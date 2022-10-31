
public class Dog extends Pet{
    private String breed;
    
    public Dog(String name, double weight, String Breed) {
        super(name, weight);
        this.breed = breed;
    }
    
    @Override
    public String makeSound() {
        return "Arf! Arf!";
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
}