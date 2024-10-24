Feature: Signin into Luma Ecommerce
  
  Scenario Outline: Sign In with valid Credentials
   Given Launch the url
   When user click on sign in link
   And user enters "<email>" and "<password>"and click on signin
   Then user able to sign in
   
   Examples:
   |email|password|
   |johnprime@gmail.com|Role Description|
   
   Scenario Outline: Forgot Password
   Given Launch the url
   When user click on signin link and click on forgot your password
   And user enters the "<email>" to reset and click on reset button
   Then user validate the msg 
   
   Examples: 
   |email|
   |johnsnow@gmail.com|
   