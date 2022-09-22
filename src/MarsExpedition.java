import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(){
        Scanner input = new Scanner(System.in);
        System.out.println("Expedition prep program starting...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");
        System.out.println("Hello user. What is your name?");
        String name = input.nextLine();
        System.out.println("Hi, " + name + "- Welcome to the Expedition prep program. \n Are you ready to head out into the new world? \n Type Y or N");
        String excited = input.nextLine();
        String lExcited = excited.toLowerCase();
        if(lExcited.equals("y")){
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad, you are team leader. You have to go.");
        }
        System.out.println("How many people do you want on your expedition team? (Input an int number)");
        int teamSize = input.nextInt();
        input.nextLine();
        if(teamSize>2){
            System.out.println("That's way too many people. We can only send 2 more members.");
            teamSize=2;
        } else if (teamSize<2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
            teamSize = 2;
        } else{
            System.out.println("That's a perfect sized team. Good job.");
        }
        System.out.println("You are allowed to bring one weapon with you. You know, just in case. What do you want to bring?");
        String weapon = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + weapon + " with you.");
        System.out.println("You have the choice of 3 vehicles: \n A: A Mars Rover \n B: A Chevy Silverado \n C: A Honda Civic");
        String vehicleChoice = input.nextLine();
        vehicleChoice = vehicleChoice.toUpperCase();
        String vehicle;
        if(vehicleChoice.equals("A")){
            vehicle = "Mars Rover";
        } else if (vehicleChoice.equals("B")) {
            vehicle = "Chevy Silverado";
        } else if (vehicleChoice.equals("C")) {
            vehicle = "Honda Civic";
        } else {
            vehicle = "your feet";
        }
        System.out.println("Your expedition team is now ready. \n Led by " + name + " with " + teamSize + " teammates. \n To explore the surface of Mars using " + vehicle + ". \n Exploration teams head out in \n 5... \n 4... \n 3... \n 2... \n 1... \n GO GO GO!");

    }
}
