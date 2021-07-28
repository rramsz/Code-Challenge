@SmokeTest
Feature: Smoke Test

@TC1 
Scenario: To check if user is able to navigate to 'CREATE AN ACCOUNT' screen with valid email ID
Given URL is launched in the chrome browser
When user clicks SignIn button on the home page
And user enters valid emailID 'sample3@gmail.com'
And user clicks Create an account button 
Then user should be navigated to CREATE AN ACCOUNT screen

# Change email ID for TC2, TC3 & TC4 before test execution
@TC2 
Scenario: To check if user can provide his details to register as Automation Practise customer
Given URL is launched in the chrome browser
When user clicks SignIn button on the home page
And user enters valid emailID 'samp7@gmail.com'
And user clicks Create an account button
And user selects title
And user enters first name as 'Ravi'
And user enters last name
And user clicks on email field to confirm the entered email address
And user enters password
And user enters DOB
And user clicks checkbox to subscribe for newsletter
And user clicks checkbox to receive special offers from partners
And user enters address line1
And user enters the name of the city
And user selects a state from the dropdown
And user enters the poscode
And user enters mobile number
And user enters alias information
And user clicks submit in registration page
Then user sees his name in the header on accounts page 'Ravi'
@End
  Scenario: Logout

@TC3
Scenario: User logs in with valid user credentials
Given URL is launched in the chrome browser
When user clicks SignIn button on the home page
And user enters user ID in email field2 'samp7@gmail.com'
And user enters password in the password field 'abc123'
And user clicks SignIn button
Then user sees his name in the header on accounts page 'Ravi'
@End
  Scenario: Logout

@TC4
Scenario: User selects articles and makes payment by Bank Wire
Given URL is launched in the chrome browser
When user clicks SignIn button on the home page
And user enters user ID in email field2 'samp7@gmail.com'
And user enters password in the password field 'abc123'
And user clicks SignIn button
And user navigates to Women menu
And user chooses Causal Dresses
And user clicks Add to Cart
And user clicks continue shopping
And user navigates to Dresses
And user selects Evening dresses
And user clicks Add to Cart
And user clicks continue shopping
And user clicks Proceed to Checkout
And user clicks Proceed to checkout on Cart page
And user clicks Proceed to checkout on Address page
And user checks the Terms and conditions checkbox
And user Clicks Proceed to checkout on Shipping(career) page
And user choses pay by bank wire option
And user clicks I confirm my order button
Then user verifies price of his order
@End
  Scenario: Logout