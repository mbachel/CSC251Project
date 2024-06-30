public class Policy
{
   //Variable declarations
   private int policyNum;
   private String providerName;
   private static int policyCount = 0;
   private PolicyHolder holder;

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
      @param holderObject The policy holder object for class collaboration.
   */
   public Policy(int polNum,String provName,PolicyHolder holderObject)
   { 
      policyNum = polNum;
      providerName = provName;
      holder = new PolicyHolder(holderObject);
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
   /**
      The setPolicyHolder method sets the policy holder object.
      @param policyHolder The object.
   */
   public void setPolicyHolder(PolicyHolder policyHolder)
   {
      holder = new PolicyHolder(policyHolder);
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
   /**
      The getPolicyHolder method gets the policy holder information.
      @return The policy holder.
   */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(holder);
   }
   
   //Special methods
   /**
      The toString method returns a string that represents policy.
      @return A string with the information of the policy.
   */
   public String toString()
   {
      return String.format("Policy Number: " + policyNum +
                           "\nProvider Name: " + providerName +
                           "\n" + holder.toString());
   }  
}//end class