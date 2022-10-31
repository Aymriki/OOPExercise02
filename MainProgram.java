
public class MainProgram {
    public static void main(String[] args) {
        
        Pet pet;
        Dog dog = new Dog("Brownie", 10, "German Shepherd");
        Parrot parrot = new Parrot("Tweetie", 1, "Larazabal");
        
        pet = dog;
        System.out.println(pet.makeSound() + " " + "My Name is " + pet.getName());
        
        pet = parrot;
        System.out.println(pet.makeSound() + "" + "My Name id " + pet.getName;)
    }
    
}
