public class Methods4 {
    public static void main(String[] args) {
        String name = "Nitish";
        greet(name);
    }

    static void greet(String naam) {
        System.out.println(naam);
    }


    /*
        In primitive data_types value will be passed hence the original value is not changed

        In non-primitive data_types (arrays etc) -> also pass by value but passing the value of the reference variable
        and making change via that, the original object will be changed
     */
}
