public class Main {
    public static void main(String[] args) {
        // To create an objects
        // classname var = new classname()
//        Pokemon p1 = new Pokemon();
//        p1.name = "Pikachu";
//        p1.level = 10;
//
//        System.out.println(p1.name + " " + p1.level);
//
//        Pokemon p2 = new Pokemon();
//        p2.name = "Evee";
//        p2.level = 20;

//        System.out.println(p1.level);

//        p2.attack();

        Pokemon p1 = new Pokemon("Eevee", 25);
        System.out.println(p1.name);
        System.out.println(p1.level);
        p1.attack();


    }
}
