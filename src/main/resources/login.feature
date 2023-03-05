#Author: Bruno Carvalho


@general
Feature: Login
  I would like to do a login

  @login-valid
  Scenario: Login
    Given I am on the home page
    When  I would like to do a login
    Then  It was successfully logged
   
  @login-invalid
  Scenario: Login
    Given I am on the home page
    When  I would like to do a login
    Then  It was successfully logged