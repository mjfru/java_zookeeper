public class Gorilla extends Mammal {
    
    public String throwSomething() {
        this.energyLevel -= 5;
        return ("The gorilla has thrown...something...let's hope for the best. Gorilla's energy has decreased by 5 and is now at " + this.energyLevel);
    }

    public String eatBananas() {
        this.energyLevel += 10;
        return ("The gorilla found some bananas, feasted on them, and is now feeling more energetic! Its energy level is now " + this.energyLevel);
    }

    public String climb() {
        this.energyLevel -= 10;
        return ("The gorilla climbed a tree and understandbly became tired. Its energy level is now " + this.energyLevel);
    }
}