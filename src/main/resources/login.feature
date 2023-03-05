#Author: Bruno Carvalho


@general
Feature: Login
  I would like to do a login

  @login-valid
  Scenario: Login
    Given I am on the home page
    When  I would like to do a login
    Then  It was successfully logged
   
  @login-invalid-email
  Scenario: Login with invalid email format
    Given I am on the home page
    When  I would like to do a login with "brunocarvalho" and "@adaf12345"
    Then  It was not a successfully logged "Sorry, dit is geen geldig e-mailadres"
    