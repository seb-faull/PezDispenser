public class Main {

    public static void main(String[] args) {

        System.out.println("We are making a new Pez Dispenser");
        PezDispenser dispenser = new PezDispenser("Yoda");
        System.out.printf("The dispenser is %s %n",
                            dispenser.getCharacterName()
                        );

    }

}
