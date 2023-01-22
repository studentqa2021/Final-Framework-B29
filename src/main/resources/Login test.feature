@Smoke
Feature: Login function test
#description: credential must be valid
#Backgroud:Given: common steps
@Positive @S29-10
Scenario: As a citi bank Luma application user, login should success with valid credentials
Given go to application URL
When click the login button
And put user
And put password
And click sign in button
Then validation login status 







































  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
