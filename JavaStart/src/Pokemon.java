public class Pokemon {
    String name;
    int level;

    Pokemon() {
        level = 1;
    }

//    Pokemon(String pName, int pLevel) {
//        name = pName;
//        level = pLevel;
//    }

    Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
        this.attack();
    }

    void attack() {
        System.out.println(name + " Attack!");
    }
}
