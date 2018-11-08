#Author: Shikhar
Feature: login
Description: This is related to login

Scenario: check the heading of the login page
		Given user is on the login page
		Then check the heading of the page

Scenario: Successful login on entering valid credentials
		Given Login page is displayed and user already has login credentials
		When User enters valid username and password and clicks on login button
		Then Welcome message is displayed

Scenario: Prompt user to enter the data when he leaves the login fields empty
		Given User is on login page
		When user does not enter either username or password
		And clicks the login Button
		Then display appropriate message
		
Scenario: UnSuccessful login due to incorrect username and password
		Given user is on the login page
		When user is on login page
		Then display login failed message