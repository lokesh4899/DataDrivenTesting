Feature: Creating an Account in Luma Ecommerce


  Scenario Outline: Register with Valid details
    Given Launch the url
    When user click on CreateAccount link
    And User enters "<FirstName>"and "<LastName>" 
    And User enters "<email>","<password>" and "<repeat_pwd>"
    Then user click on create account and validate the success message and logout

  
    Examples: 
      |FirstName|LastName |email|password|repeat_pwd|
      |		john  |	 prime  |johnprime@gmail.com|Role Description|Role Description|
      
   
     
