public class Test {
    public static void main(String[] args) {
        
        //! General Mammal Tests:
        // Mammal x = new Mammal();
        // System.out.println(x.displayEnergy());

        //! Gorilla Tests:
        Gorilla dkong = new Gorilla();
        
        //TODO Throw things 3 times:
        System.out.println(dkong.throwSomething());
        System.out.println(dkong.throwSomething());
        System.out.println(dkong.throwSomething());

        //TODO Eat bananas twice:
        System.out.println(dkong.eatBananas());
        System.out.println(dkong.eatBananas());

        //TODO Climb once:
        System.out.println(dkong.climb());

        //TODO Print the gorilla's energy level:
        System.out.println(dkong.displayEnergy());

        //! Bat Tests:
        Bat vampy = new Bat();

        //TODO Attack 3 towns:
        System.out.println(vampy.attackTown());
        System.out.println(vampy.attackTown());
        System.out.println(vampy.attackTown());

        // //TODO Eat 2 humans:
        System.out.println(vampy.eatHumans());
        System.out.println(vampy.eatHumans());

        //TODO Fly twice:
        System.out.println(vampy.fly());
        System.out.println(vampy.fly());

        //TODO Display energy from the superclass:
        System.out.println(vampy.displayEnergy());
    }
}