/**
 * This program was built to do serial dilution and plaque assay questions in a microbiology class I was in for me.
 *
 * @author Kenzie MacKinnon
 * @version 1.0
 * @since 2021-06-21
 *
 */ 

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Plaque_Assay 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        // Determing what type of question will be done
        System.out.print("What question type is being done ?(virus/bacteria): "); 
        String questionType = in.nextLine();
        
        // Scheme for a plaque assay question (virus)
        if (questionType.equals("virus")) 
        {
            // Input 
            System.out.print("Dilution Factor as an exponent (10^x): ");
            double dilutionFactor = in.nextDouble();
            System.out.print("Volume diluted (mL): ");
            double volumeDiluted = in.nextDouble();
            System.out.print("Average number of plaques: ");
            double averagePlaques = in.nextDouble();

            // Calculation
            double viable = averagePlaques / ((Math.pow(10, dilutionFactor) * volumeDiluted));

            System.out.println("There are " + viable + " PFU/mL viable virus present.");
        } 

        // Scheme for serial dilution question (bacteria)
        else if (questionType.equals("bacteria")) 
        {
            // Input
            System.out.print("Dilution Factor as an exponent (10^x): ");
            double dilutionFactor = in.nextDouble();
            System.out.print("Volume Plated (mL): ");
            double volumeDiluted = in.nextDouble();
            System.out.print("Colonies Counted: ");
            double averagePlaques = in.nextDouble();
            
            // Calculation
            double viable = averagePlaques * (1 / (Math.pow(10, dilutionFactor)) * (1 / volumeDiluted));

            System.out.println("There are " + viable + " cfu/mL of original culture.");

        } 
        else 
        {
            System.out.println("Error, try again");
        }
    }
}
