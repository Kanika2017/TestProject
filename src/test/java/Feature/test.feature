Feature: Test Cases

Scenario: Test Case 1

Given I am on Jupiter Home Page
Then I navigate to "Contact" page from the navigation bar
Then I click on submit button on contact page
Then I validate the forename error is displayed "true"
Then I validate the email error is displayed "true"
Then I validate the message error is displayed "true"
Then I enter data into field "forename"
Then I enter data into field "email"
Then I enter data into field "message"
Then I validate the forename error is displayed "false"
Then I validate the email error is displayed "false"
Then I validate the message error is displayed "false"
Then I close the browser

Scenario: Test Case 2

Given I am on Jupiter Home Page
Then I navigate to "Contact" page from the navigation bar
Then I enter data into field "forename"
Then I enter data into field "email"
Then I enter data into field "message"
Then I click on submit button on contact page
Then I validate the success message is displayed "true"
Then I close the browser


Scenario: Test Case 3

Given I am on Jupiter Home Page
Then I navigate to "Contact" page from the navigation bar
Then I enter incorrect data into email field
Then I validate the email error is displayed "true"
Then I close the browser



Scenario: Test Case 4

Given I am on Jupiter Home Page
Then I navigate to "Shop" page from the navigation bar
Then I click on buy button of "Funny Cow" number of times 2
Then I click on buy button of "Fluffy Bunny" number of times 1
Then I navigate to "Cart" page from the navigation bar
Then I verify products added to the cart are 2
Then I verify Row number 1 contains "Funny Cow" having quantity "2"
Then I verify Row number 2 contains "Fluffy Bunny" having quantity "1"
Then I close the browser








