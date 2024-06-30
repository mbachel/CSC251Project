public class Policy
{
   //Variable declarations
   private int policyNum;
   private String providerName;
   private static int policyCount = 0;

   //The noArgPolicy method is a constructor method that does not receive arguments, but sets default values to a policy.
   public void noArgPolicy()
   {
      policyNum = 0;
      providerName = "";
   }   
   
   /**
      The Policy method is a constructor method that receives arguments for an entire policy.
         
      @param polNum The policy number.
      @param provName The name of the insurance provider company.
   */
   public Policy(int polNum,String provName)
   { 
      policyNum = polNum;
      providerName = provName;
      policyCount++;
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
      The getPolicyCount method gets the number of policies that have been created.
      @return The amount of policies created.
   */
   public int getPolicyCount()
   {
      return policyCount;
   }
   
   //Special methods
   /**
      The toString method returns a string that represents policy.
      @return A string with the information of the policy.
   */
   public String toString()
   {
      String str = "Policy Number: " + policyNum +
                   "\nProvider Name: " + providerName;
      return str;
   }  
}//end class