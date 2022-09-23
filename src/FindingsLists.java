import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsLists {

    public FindingsLists() throws InterruptedException{
        //ArrayList of rocks: takes least memory
        Thread.sleep(500);
        System.out.println("Welcome back from your expedition. Time to catalog everything you found,");
        ArrayList<String> rockList = new ArrayList<String>();
        System.out.println("Rock data downloaded.");
        rockList.add("rock, weird rock, smooth rock, not rock");
        System.out.println(rockList);
        rockList.remove("not rock");
        System.out.println(rockList);
        System.out.println("Perfect");

        //HashMap works faster than HashSet. Used to map keys to values.
        Thread.sleep(500);
        //allows each element to have 2 attributes like name and description
        HashMap<String, String> fossilDirectory = new HashMap<>();
        System.out.println("Fossil data downloaded");
        fossilDirectory.put("Bird Fossil","The fossil has wings implying it was capable of flight.");
        fossilDirectory.put("Fish Fossil","The fossil is vaguely fish shaped implies there was once water.");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil.");
        System.out.println("Which of the fossils would you like to learn more about? (Spelling and Spacing is important)");
        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();
        if(fossilChoice.equalsIgnoreCase("Bird Fossil")){
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish Fossil")){
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")){
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        //HashSet used if we have to access elements randomly, accessed using hashcodes, cannot contain duplicates
        Thread.sleep(500);
        HashSet<String> suppliesBrought = new HashSet<>();
        HashSet<String> suppliesUsed = new HashSet<>();
        suppliesBrought.add("Food");
        suppliesBrought.add("Water");
        suppliesBrought.add("Medicine");
        suppliesUsed.add("Food");
        suppliesUsed.add("Water");
        System.out.println("Medicine");

    }
}
