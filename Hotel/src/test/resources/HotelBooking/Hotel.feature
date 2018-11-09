#Author: your.email@your.domain.com
Feature: Hotel Booking

Scenario: Verify title of page
Given User is on booking page
Then check the heading of page

Scenario: Verify first and last names for null inputs
Given User is on booking page
When User does not enter firstname , lastname
Then prompt user to fill in details

Scenario: Verify email in correct format
Given User is on booking page
When User does not enter email in correct format
Then prompt user to write input correctly

Scenario: Verify mobile number for null input
Given User is on booking page
When User does not enter mobile number
Then prompt user to enter mobile number

Scenario: Verify valid mobile number
Given User is on booking page
When User enters mobile number that doesnt start with 6,7,8 or 9 and is not 10-digits
|778556693|
|2312321232|
|1202321233|
|9685741230|
| |
Then prompt user to enter valid contact details

Scenario Outline: Verify number of people for null inputs
Given User is on booking page
When uer enters <numberOfGuests>
Then for <numberOfGuests> number of guests, allocate <numberOfRooms> number of rooms
Examples:
|numberOfGuests|numberOfRooms|
|2|1|
|6|2|
|9|3|

Scenario: Verify address for null inputs
Given User is on booking page
When User does not address
Then prompt user to fill in the address

Scenario: Verify first and last names for null inputs
Given User is on booking page
When User does not enter firstname , lastname
Then prompt user to fill in details

Scenario: Verify city for null inputs
Given User is on booking page
When User does not select city
Then prompt user to select city

Scenario: Verify state for null inputs
Given User is on booking page
When User does not select state
Then prompt user to select state

Scenario: Verify card holder name for null inputs
Given User is on booking page
When User does not enter card holder name
Then prompt user to fill in card holder name

Scenario: Verify debit card number for null inputs
Given User is on booking page
When User does not enter debit card number
Then prompt user to enter debit card number

Scenario: Verify card expiration month for null inputs
Given User is on booking page
When User does not enter card expiration month
Then prompt user to enter card expiration month

Scenario: Verify card expiration year for null inputs
Given User is on booking page
When User does not enter card expiration year
Then prompt user to enter card expiration year

Scenario: Verify Confirm booking button
Given User is on booking page
When User clicks on confirm booking button
Then navigate to booking successfu