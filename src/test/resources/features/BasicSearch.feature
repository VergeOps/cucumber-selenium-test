@search
Feature: Home Page Search Form Functionality
  Search works as expected for positive and negative scenarios
  
  Background:
  	Given I am on the home page	
   
  Scenario Outline: Search page displays results when items match search term and doesn't display results when items don't match the search term
  	When I search for "<item>"
  	Then I see that <numItems> results have been found
       
    @positive 
    Examples:
      | item			| numItems	|
      |	dresses		|	9					|
	  	| chiffon		| 2					|
	  	
	  @negative
	  Examples:
      | item			| numItems	|
      |	bob				|	0					|
	  	| sue				| 0					|