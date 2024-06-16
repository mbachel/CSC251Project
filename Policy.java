public class Policy
{
   //Variable declarations
   private int policyNum;
   private String providerName;
   private String holderFirst;
   private String holderLast;
   private byte holderAge;
   private String holderSmokeStatus;
   private double holderHeight;
   private double holderWeight;
   private double bmi = 0;

   //The noArgPolicy method is a constructor method that does not receive arguments, but sets default values to a policy.
   public void noArgPolicy()
   {
      policyNum = 0;
      providerName = "";
      holderFirst = "";
      holderLast = "";
      holderAge = 0;
      holderSmokeStatus = "";
      holderHeight = 0;
      holderWeight = 0;
   }   
   
   /**
      The argPolicy method is a constructor method that receives arguments for an entire policy.
         
      @param polNum The policy number.
      @param provName The name of the insurance provider company.
      @param holdFirst The policy holder's first name.
      @param holdLast The policy holder's last name.
      @param holdAge The policy holder's age.
      @param smokeStatus Whether the policy holder is a smoker or non-smoker.
      @param holdHeight The policy holder's height.
      @param holdWeight The policy holder's weight.
   */
   public void argPolicy(int polNum,String provName,String holdFirst,String holdLast,byte holdAge,String smokeStatus,double holdHeight,double holdWeight)
   { 
      policyNum = polNum;
      providerName = provName;
      holderFirst = holdFirst;
      holderLast = holdLast;
      holderAge = holdAge;
      holderSmokeStatus = smokeStatus;
      holderHeight = holdHeight;
      holderWeight = holdWeight;
   }
   
   //Mutator methods.
   /**
      The setPolicyNum method sets the policy number to the given integer.
      
      @param polNum The policy number.
   */
   public void setPolicyNum(int polNum)
   {
      policyNum = polNum;
   }
   /**
      The setProviderName method sets the provider name to the given string.
      
      @param provName The name of the insurance provider company.
   */
   public void setProviderName(String provName)
   {
      providerName = provName;
   }
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
   
   //Accessor methods.
   /**
      The getPolicyNum method gets the policy number.
      
      @return The policy number.
   */
   public int getPolicyNum()
   {
      return policyNum;
   }
   /**
      The getProviderName method gets the name of the insurance provider company.
      
      @return The name of the insurance provider company.
   */
   public String getProviderName()
   {
      return providerName;
   }
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
      bmi = (holderWeight * 703) / (holderHeight * holderHeight);
      return bmi;
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
      if (holderSmokeStatus == "smoker") //if holder is a smoker, additional fee of 100.
      {
         additionalFees += 100.0;
      }
      if (bmi > 35.0) //if BMI is greater than 35, add given calculation to additional fees.
      {
         additionalFees += ((bmi - 35) * 20);
      }
      return baseFee + additionalFees;
   }//end calculatePrice
}//end class