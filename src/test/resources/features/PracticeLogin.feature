@loginPage
Feature: Login Page Form Component Checks
  Login Page works as expected for positive and negative scenarios
  	
  @negative
  Scenario Outline: Login form shows error on incorrect data entry
    When I attempt to login as user "<username>" and password "<password>"
    Then I see the error message "<error>"
 
    Examples:
      | username	| password		| error							|	
      |				|				| Your username is invalid!		|
	  | tomsmith	| xxxxx			| Your password is invalid!		|				
   
  @positive
  Scenario: User is logged in successfully when using valid credentials
  	When I login as a valid user
  	Then I am able to view my account page
        