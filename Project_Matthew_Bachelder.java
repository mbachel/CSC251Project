import java.util.Scanner;

public class Project_Matthew_Bachelder
{
   public static void main(String[] args)
   {
      //variable declarations
      Scanner keyboard = new Scanner(System.in);
      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      byte holderAge;
      String smokeStatus;
      double holderHeight;
      double holderWeight;
      
      //setting all values with inputs
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      keyboard.nextLine(); //eating \n from int for strings to input correctly
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Last name: ");
      lastName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Age: ");
      holderAge = keyboard.nextByte();
      keyboard.nextLine(); //eating \n
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokeStatus = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      holderHeight = keyboard.nextDouble();
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      holderWeight = keyboard.nextDouble();
      
      //submitting all of the input info in as a new policy
      Policy policy1 = new Policy();
      policy1.argPolicy(policyNumber,providerName,firstName,lastName,holderAge,smokeStatus,holderHeight,holderWeight);
      
      //output
      System.out.println("Policy Number: " + policy1.getPolicyNum());
      System.out.println("Provider Name: " + policy1.getProviderName());
      System.out.println("Policyholder's First Name: " + policy1.getHolderFirst());
      System.out.println("Policyholder's Last Name: " + policy1.getHolderLast());
      System.out.println("Policyholder's Age: " + policy1.getHolderAge());
      System.out.println("Policyholder's Smoking Status: " + policy1.getSmokeStatus());
      System.out.println("Policyholder's Height: " + policy1.getHolderHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy1.getHolderWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f \n", policy1.calculateBMI());
      System.out.printf("Policy Price: $%.2f \n", policy1.calculatePrice());
   }
}