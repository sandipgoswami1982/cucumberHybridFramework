Feature: Adding new Customer in opencart application 
Background: Below steps are common 
	Given user launch a chrome browser 
	When user open an url "http://localhost/opencart/upload/admin/" 
	And user enter username as "admin" and password as "admin" 
	And click on login button 
	Then user can view Dashboard 
@Regression	
Scenario: Adding new Customer 

	When user click on Customers menu 
	And click on Customer menu item 
	And click on add new button 
	Then user can view Add Customer page 
	When user enter new customer info 
	And click on save button 
	Then user can view confirmation message 
	And close the browser 
@sanity	
Scenario: customer search by email 
	When user click on Customers menu 
	And click on Customer menu item 
	And enter customer email 
	When click on filter button 
	Then user should found email in the search table 
	And close the browser 
	