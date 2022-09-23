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

          boolean landing = LandingCheck(3);
          new GuessingGame();
          new MarsExpedition();
          new FindingsLists();

    }
    /**Function name: Landing Check-used to navigate landing of the ship
    *   @param loops (int)
     * @return landed? boolean
     * Inside the function:
     *  1. return instruction based on divisibility of number in loop by 3 and or 5
     *  2. return false after Landing
     *   */
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
