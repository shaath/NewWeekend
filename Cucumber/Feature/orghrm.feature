Feature: Checking Login and Logout Functionslities

	Scenario: Login Test
		Given launch the browser and navigated to url
		When tester enters username and password
		And clicks on login
		Then welcome message displayed
		
	Scenario: Logout Test
		When Tester clicks on WelcomeAdmin link
		And also click on logout
		Then login page displayed	
