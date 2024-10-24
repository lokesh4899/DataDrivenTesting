Feature: MyAccounts Features

Scenario: Edit Contact Information
Given user launches the url
When user logs in to the account
And user click on edit option 
And user edit the "<firstName>" and "<lastName"> and user click on save 
Then user shoul be able to see the success msg

Scenario: Change Email
Given user launches the url
When user logs in to the account
And user click on edit option and select the checkbox change email
And user changes the "<email>" and enters "<password>" and user click on save
Then use should be able to see the success msg

Scenario: Change Password
Given user launches the url
When user logs in to the account
And user click on change password
And user enters "<curent_pwd>" and "<new_pwd>"and "<rept_pwd>"
And click on save 
Then user should be able to see the success msg

Scenario: Manage Address
Given user launches the url
When user logs in to the account
And user Click on manage address and user enters "<phone>" and "Street_address>" and "<city>"
And user selects "<county>" and "<state>" and enters "<zipcode>" and click on save address
Then user should be able to see the success msg


