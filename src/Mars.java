public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String ColonyName = "new Horizon";
        int ShipPopulation = 300;
        double ShipFood = 4000.00;
        boolean Landing = true;

        ShipFood = ShipFood - (ShipPopulation*0.75); //Day 1
        ShipFood = ShipFood - (ShipPopulation*0.75); //Day 2
        //Amount of food left
        System.out.println("Food Left on the Ship: " + ShipFood);
        ShipFood = ShipFood*1.5; //Extra crate is found
        ShipPopulation += 5;

        String LandingLocation = "The Ocean";
        if(LandingLocation.equals("The Plain")){
            System.out.println("Bbzzz Landing on the Plane");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        LandingCheck(100);

    }

    public static boolean LandingCheck(int loops) throws InterruptedException {
        for (int i = 0; i < loops; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Keep Center");
            } else if (i % 5 == 0) {
                System.out.println("Right");
            } else if (i % 3 == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }

}
