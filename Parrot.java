
public class Parrot extends Pet{
    private String jungle;
    
    public Parrot(String name, double weight, String Jungle) {
        super(name, weight);
        this.jungle = jungle;
    }
    
    @Override
    public String makeSound() {
        return "Hello!!!!";
    }
    
    public String getJungle() {
        return jungle;
    }
    
    public void setJungle(String jungle) {
        this.jungle = jungle;
    }
    
}
