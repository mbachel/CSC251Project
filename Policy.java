public class Policy
{
   //Variable Declarations
   private int policyNum;
   private String providerName;
   private String holderFirst;
   private String holderLast;
   private byte holderAge;
   private String holderSmokeStatus;
   private double holderHeight;
   private double holderWeight;
   private double bmi = 0;
   
   public void noArgPolicy()
   { //No-arg constructor
      policyNum = 0;
      providerName = "";
      holderFirst = "";
      holderLast = "";
      holderAge = 0;
      holderSmokeStatus = "";
      holderHeight = 0;
      holderWeight = 0;
   }   
   
   public void argPolicy(int polNum,String polName,String holdFirst,String holdLast,byte holdAge,String smokeStatus,double holdHeight,double holdWeight)
   { //Constructor with arguments
      policyNum = polNum;
      providerName = polName;
      holderFirst = holdFirst;
      holderLast = holdLast;
      holderAge = holdAge;
      holderSmokeStatus = smokeStatus;
      holderHeight = holdHeight;
      holderWeight = holdWeight;
   }
   
   //Mutator methods
   public void setPolicyNum(int polNum)
   {
      policyNum = polNum;
   }
   public void setProviderName(String polName)
   {
      providerName = polName;
   }
   public void setHolderFirst(String holdFirst)
   {
      holderFirst = holdFirst;
   }
   public void setHolderLast(String holdLast)
   {
      holderLast = holdLast;
   }
   public void setHolderAge(byte holdAge)
   {
      holderAge = holdAge;
   }
   public void setSmokeStatus(String smokeStatus)
   {
      holderSmokeStatus = smokeStatus;
   }
   public void setHolderHeight(double holdHeight)
   {
      holderHeight = holdHeight;
   }
   public void setHolderWeight(double holdWeight)
   {
      holderWeight = holdWeight;
   }
   
   //Accessor methods
   public int getPolicyNum()
   {
      return policyNum;
   }
   public String getPolicyName()
   {
      return providerName;
   }
   public String getHolderFirst()
   {
      return holderFirst;
   }
   public String getHolderLast()
   {
      return holderLast;
   }
   public byte getHolderAge()
   {
      return holderAge;
   }
   public String getSmokeStatus()
   {
      return holderSmokeStatus;
   }
   public double getHolderHeight()
   {
      return holderHeight;
   }
   public double getHolderWeight()
   {
      return holderWeight;
   }
   
   //Calculator methods
   public double calculateBMI()
   {
      bmi = (holderWeight * 703) / (holderHeight * holderHeight);
      return bmi;
   }
   public double calculatePrice() //Calculates and returns the price of the policy based on additional fees.
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
   }
}