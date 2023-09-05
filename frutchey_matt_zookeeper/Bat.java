public class Bat extends Mammal {
    public Bat () {
        this.energyLevel = 300;
    }

    public String fly() {
        this.energyLevel -= 50;
        return("The bat is airborne! While that's terrible, its energy took a big hit and is now at " + this.energyLevel);
    }

    public String eatHumans() {
        this.energyLevel += 25;
        return("After feasting on a human, the bat is now super satisfied and its energy is now at " + this.energyLevel);
    }

    public String attackTown() {
        this.energyLevel -= 100;
        return("An exhausting and shocking event, the bat attack an entire town and its energy took a big hit. It now sits at " + this.energyLevel);
    }
}