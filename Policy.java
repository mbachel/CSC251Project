public class Policy
{
   //Variable declarations
   private int policyNum;
   private String providerName;

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
      @param holdFirst The policy holder's first name.
      @param holdLast The policy holder's last name.
      @param holdAge The policy holder's age.
      @param smokeStatus Whether the policy holder is a smoker or non-smoker.
      @param holdHeight The policy holder's height.
      @param holdWeight The policy holder's weight.
   */
   public Policy(int polNum,String provName)
   { 
      policyNum = polNum;
      providerName = provName;
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
}//end class