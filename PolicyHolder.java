public class PolicyHolder
{
   //Variable declarations
   private String holderFirst;
   private String holderLast;
   private byte holderAge;
   private String holderSmokeStatus;
   private double holderHeight;
   private double holderWeight;
   
   //Constructor methods
   //The noArgPolicyHolder method is a constructor method that does not receive arguments, but sets default values for a policy holder.
   public void noArgPolicyHolder()
   {
      holderFirst = "";
      holderLast = "";
      holderAge = 0;
      holderSmokeStatus = "";
      holderHeight = 0;
      holderWeight = 0;
   }
   
   /**
      The PolicyHolder method is a constructor method that receives arguments for an entire policy holder.
         
      @param holdFirst The policy holder's first name.
      @param holdLast The policy holder's last name.
      @param holdAge The policy holder's age.
      @param smokeStatus Whether the policy holder is a smoker or non-smoker.
      @param holdHeight The policy holder's height.
      @param holdWeight The policy holder's weight.
   */
   public PolicyHolder(String holdFirst,String holdLast,byte holdAge,String smokeStatus,double holdHeight,double holdWeight)
   {
      holderFirst = holdFirst;
      holderLast = holdLast;
      holderAge = holdAge;
      holderSmokeStatus = smokeStatus;
      holderHeight = holdHeight;
      holderWeight = holdWeight;
   }
   /**
      The copy constructor is used to avoid security holes.
      @param object2 The object to copy.
   */
   public PolicyHolder(PolicyHolder object2)
   {
      holderFirst = object2.holderFirst;
      holderLast = object2.holderLast;
      holderAge = object2.holderAge;
      holderSmokeStatus = object2.holderSmokeStatus;
      holderHeight = object2.holderHeight;
      holderWeight = object2.holderWeight;
   }  
   
   //Mutator methods
   /**
      The setHolderFirst method sets the policy holder's first name.
      
      @param holdFirst The policy holder's first name.
   */
   public void setHolderFirst(String holdFirst)
   {
      holderFirst = holdFirst;
   }
   /**
      The setHolderLast method sets the policy holder's last name.
      
      @param holdLast The policy holder's last name.
   */
   public void setHolderLast(String holdLast)
   {
      holderLast = holdLast;
   }
   /**
      The setHolderAge method sets the policy holder's age.
      
      @param holdAge The policy holder's age.
   */
   public void setHolderAge(byte holdAge)
   {
      holderAge = holdAge;
   }
   /**
      The setSmokeStatus method sets whether the policy holder is a smoker or non-smoker.
      
      @param smokeStatus The policy holder's smoking status (will be either smoker or non-smoker).
   */
   public void setSmokeStatus(String smokeStatus)
   {
      holderSmokeStatus = smokeStatus;
   }
   /**
      The setHolderHeight method sets the policy holder's height.
      
      @param holdHeight The policy holder's height.
   */
   public void setHolderHeight(double holdHeight)
   {
      holderHeight = holdHeight;
   }
   /**
      The setHolderWeight method sets the policy holder's weight.
      
      @param holdWeight The policy holder's weight.
   */
   public void setHolderWeight(double holdWeight)
   {
      holderWeight = holdWeight;
   }
   
   //Accessor methods
   /**
      The getHolderFirst method gets the policy holder's first name
      
      @return The first name of the policy holder.
   */
   public String getHolderFirst()
   {
      return holderFirst;
   }
   /**
      The getHolderLast method gets the policy holder's last name.
      
      @return The last name of the policy holder.
   */
   public String getHolderLast()
   {
      return holderLast;
   }
   /**
      The getHolderAge method gets the policy holder's age
      
      @return The age of the policy holder.
   */
   public byte getHolderAge()
   {
      return holderAge;
   }
   /**
      The getSmokeStatus method gets the policy holder's smoking status
      
      @return The smoking status of the policy holder.
   */
   public String getSmokeStatus()
   {
      return holderSmokeStatus;
   }
   /**
      The getHolderHeight method gets the policy holder's height.
      
      @return The height of the policy holder.
   */
   public double getHolderHeight()
   {
      return holderHeight;
   }
   /**
      The getHolderWeight method gets the policy holder's weight.
      
      @return The weight of the policy holder.
   */
   public double getHolderWeight()
   {
      return holderWeight;
   }
   
   //Calculator methods
   /**
      The calculateBMI method calculates the policy holder's BMI using the given height and weight.
      
      @return The BMI of the policy holder.
   */
   public double calculateBMI()
   {
      return (holderWeight * 703) / (holderHeight * holderHeight);
   }
   
   /**
      The calculatePrice method calculates and returns the price of the policy based on additional fees.
      
      @return The base fee plus any additional fees (such as smoker fees).
   */
   public double calculatePrice()
   {
      double baseFee = 600.0;
      double additionalFees = 0;
      
      if (holderAge >= 50) //if holder is more than 50 years old, additional fees of 75.
      {
         additionalFees += 75.0;
      }
      if (holderSmokeStatus.equals("smoker")) //if holder is a smoker, additional fee of 100.
      {
         additionalFees += 100.0;
      }
      if (calculateBMI() > 35.0) //if BMI is greater than 35, add given calculation to additional fees.
      {
         additionalFees += ((calculateBMI() - 35) * 20);
      }
      return baseFee + additionalFees;
   }//end calculatePrice
   /**
      The toString method returns a string that represents policy holder.
      @return A string with the information of the policy holder.
   */
   public String toString()
   {
      return String.format("Policyholder's First Name: " + holderFirst +
                           "\nPolicyholder's Last Name: " + holderLast +
                           "\nPolicyholder's Age: " + holderAge +
                           "\nPolicyholder's Smoking Status: " + holderSmokeStatus +
                           "\nPolicyholder's Height: " + holderHeight +
                           "\nPolicyholder's Weight: " + holderWeight +
                           "\nPolicyholder's BMI: %.2f" +
                           "\nPolicy Price: $%.2f",calculateBMI(),calculatePrice());
   }
}//end class