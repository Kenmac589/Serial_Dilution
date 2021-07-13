import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Plaque_Assay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("What question type is being done ?(virus/bacteria): "); 
        String questionType = in.nextLine();

        if (questionType.equals("virus")) {
            System.out.print("Dilution Factor as an exponent (10^x): ");
            double dilutionFactor = in.nextDouble();
            System.out.print("Volume diluted (mL): ");
            double volumeDiluted = in.nextDouble();
            System.out.print("Average number of plaques: ");
            double averagePlaques = in.nextDouble();

            double viable = averagePlaques / ((Math.pow(10, dilutionFactor) * volumeDiluted));

            System.out.println("There are " + viable + " PFU/mL viable virus present.");
        } 
        else if (questionType.equals("bacteria")) {
            System.out.print("Dilution Factor as an exponent (10^x): ");
            double dilutionFactor = in.nextDouble();
            System.out.print("Volume Plated (mL): ");
            double volumeDiluted = in.nextDouble();
            System.out.print("Colonies Counted: ");
            double averagePlaques = in.nextDouble();

            double viable = averagePlaques * (1 / (Math.pow(10, dilutionFactor)) * (1 / volumeDiluted));

            System.out.println("There are " + viable + " cfu/mL of original culture.");

        } 
        else {
            System.out.println("Error, try again");
        }
    }
}
