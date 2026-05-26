Feature: login to saucedemo in m8
	
#	Background:
#		Given browser is opened for tazeen
	
	@smoke
  Scenario: Login with valid creds for m8
    When tazeen enters un and pwd
    And tazeen clicks on loginBtn
    Then she should redirect to homepage
    

	@reg
  Scenario: Login with invalid creds for m8
		When tazeen enters invalid un and pwd
    And tazeen clicks on loginBtn
    Then she should not redirect to homepage
    