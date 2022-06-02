Feature: Admin login functionality of opencart 
@sanity,@Regression
Scenario: succesfully login with valid credentials 
	Given user launch a chrome browser 
	When user open an url "http://localhost/opencart/upload/admin/" 
	And user enter username as "admin" and password as "admin" 
	And click on login button 
	Then tital should be "Dashboard" 
	When user click on logout button 
	Then tital should be "Administration" 
	And close browser 
	
#Scenario Outline: Login Data Driven 
	#Given user launch a chrome browser 
	#When user open an url "http://localhost/opencart/upload/admin/" 
#	And user enter username as "<user>" and password as "<password>" 
#	And click on login button 
#	Then tital should be "Dashboard" 
#	When user click on logout button 
#	Then tital should be "Administration" 
#	And close browser 
#	
#	Examples: 
#		| user  | password |
#		| admin | admi    |
#		| admin | admin    |