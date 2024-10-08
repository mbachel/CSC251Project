import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Project_Matthew_Bachelder
{
   public static void main(String[] args) throws IOException
   {
      //variable declarations
      File policyInfo = new File("PolicyInformation.txt");
      Scanner input = new Scanner(policyInfo);
      char continueProg = 'Y';
      var list = new ArrayList<Policy>();
      
      while (continueProg == 'Y')
      {
         //variable declarations to be reset each loop.
         int policyNumber;
         String providerName;
         String firstName;
         String lastName;
         byte holderAge;
         String smokeStatus;
         double holderHeight;
         double holderWeight;
         
         //setting all values with inputs
         //System.out.print("Please enter the Policy Number: ");
         policyNumber = input.nextInt();
         input.nextLine(); //eating \n from int for strings to input correctly
         //System.out.print("Please enter the Provider Name: ");
         providerName = input.nextLine();
         //System.out.print("Please enter the Policyholder's First Name: ");
         firstName = input.nextLine();
         //System.out.print("Please enter the Policyholder's Last name: ");
         lastName = input.nextLine();
         //System.out.print("Please enter the Policyholder's Age: ");
         holderAge = input.nextByte();
         input.nextLine(); //eating \n
         //System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         smokeStatus = input.nextLine();
         //System.out.print("Please enter the Policyholder's Height (in inches): ");
         holderHeight = input.nextDouble();
         //System.out.print("Please enter the Policyholder's Weight (in pounds): ");
         holderWeight = input.nextDouble();
         
         //Creating a PolicyHolder object
         PolicyHolder holderInfo = new PolicyHolder(firstName,lastName,holderAge,smokeStatus,holderHeight,holderWeight);
         
         list.add(new Policy(policyNumber, providerName, holderInfo)); //Passing holderInfo object into the constructor
         if (input.hasNext())
         {
            continueProg = 'Y';
         }
         else 
         {
            continueProg = 'N';
         }
      }//end while loop
      
      //output
      int smokers = 0;
      int nonsmokers = 0;
      int policyCount = 0;
      for(int index = 0; index < list.size(); index ++)
      {
         Policy policy = list.get(index);
         PolicyHolder holderInfo = policy.getPolicyHolder();
         System.out.println(policy.toString());
         /**
         System.out.println("Policy Number: " + policy.getPolicyNum());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getHolderFirst());
         System.out.println("Policyholder's Last Name: " + policy.getHolderLast());
         System.out.println("Policyholder's Age: " + policy.getHolderAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getSmokeStatus());
         System.out.println("Policyholder's Height: " + policy.getHolderHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getHolderWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f \n", policy.calculateBMI());
         System.out.printf("Policy Price: $%.2f \n", policy.calculatePrice());
         */
         System.out.println("");
         if (holderInfo.getSmokeStatus().equals("smoker"))
         {
            smokers ++;
         }
         else if (holderInfo.getSmokeStatus().equals("non-smoker"))
         {
            nonsmokers ++;
         }
         policyCount = policy.getPolicyCount();
      }//end for loop
      System.out.printf("There were %d Policy objects created.\n",policyCount);
      System.out.println("The number of policies with a smoker is: " + smokers);
      System.out.println("The number of policies with a non-smoker is: " + nonsmokers);
   }//end main method
}//end class