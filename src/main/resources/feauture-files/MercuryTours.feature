@Dev
Feature: As a User I want to be able to sign up to the Mecury Tours website

  Scenario: 1.Sign up using valid details
    Given I am on the Mercury website
    When I click on the Register button
    And enter details as follows firstname as "Tosin", lastname as "Aladesoun", phone as "0123456789", addressA as "5 West Gate Close", addressB as "Shenley Lodge", city as "Milton Keynes", postalcode as "MK6 6PB", email as "ttoslad@yahoo.co.uk", country as "UNITED KINGDOM", username as "taladesoun" and password as "asdfgh"
    And click Submit
    Then "Tosin", "Aladesoun" and "taladesoun" are displayed

  #@Dev
  Scenario Outline: 1.Sign up using valid details
    Given I am on the Mercury Tours homepage
    When I click on the Register button
    And enter details as follows "<firstname>", "<lastname>", "<email>", "<country>", "<username>" and "<password>"
    And click Submit
    Then "<firstname>", "<lastname>" and "<username>" are displayed
    Examples:
    |firstname|lastname|email|country|username|password|
    |olu|lades|olulades@yahoo.com|UNITED KINGDOM|olulades|mypassword|
#    |oluA|ladesA|oluladesA@yahoo.com|UNITED KINGDOM|oluladesA|mypasswordA|
#    |oluB|ladesB|oluladesB@yahoo.com|UNITED KINGDOM|oluladesB|mypasswordB|


  #@Dev
  Scenario: 2.Sign on using valid details
    Given I am on the Mercury Tours homepage
    When I click on the Sign-On button
    And enter details as follows username as "taladesoun" and password as "asdfgh"
    And click SUBMIT
    Then "Flight Finder" page is displayed

  #@Dev
  Scenario: 3.Sign on using invalid login details
    Given I am on the Mercury Tours homepage
    When I click on the Sign-On button
    And enter invalid details as follows username as "talade" and password as "asdfgh"
    And click SUBMIT
    Then Sign On page is displayed

  #@Dev
  Scenario: Select flight details
    Given I am on the Mercury Tours homepage
    When I click on the Sign-On button
    And enter details as follows username as "taladesoun" and password as "asdfgh"
    And click SUBMIT
    And I click on the Continue button
    Then Flight options are displayed

  #@Dev
  Scenario: Select flight details
    Given I am on the Mercury Tours homepage
    When I click on the Sign-On button
    And enter details as follows username as "taladesoun" and password as "asdfgh"
    And click SUBMIT
    And I click on the Continue button
    And On the Flight Selection page I click on the Continue button
    Then Booking page is displayed

  #@Dev
  Scenario Outline: Book flight
    Given I am on the Mercury Tours homepage
    When I click on the Sign-On button
    And enter details as follows "<username>" and "<password>"
    And click SUBMIT
    Then "Flight Finder" page is displayed
    And select flight details as follows "<departFrom>", "<arriveIn>" and "<airline>"
    And I click on the Continue button
    Then Flight options are displayed
    And On the Flight Selection page I click on the Continue button
    And enter details as follows "<firstname>", "<lastname>" and "<cardNumber>"
    And I click on Secure Payment button
    Then Confirmation page is displayed
    And I click on Logout button
    Then Sign On page is displayed
    Examples:
      | firstname | lastname | cardNumber       |username|password|departFrom|arriveIn|airline|
      | Olu       | Lades    | 0123456789123456 |olulades|mypassword|London  |New York|Blue Skies Airlines|


