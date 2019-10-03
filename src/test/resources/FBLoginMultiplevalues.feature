
@tag
Feature: Title of your feature
  I want to use this template for my feature file


  @tag2
  Scenario Outline: Title of your scenario outline
    Given The user is in FB  login page
    When The user enters the username and password "<name>","<Password>"
    And The user clicks the login button
    Then The user navigates into home page


    Examples: 
      | name  | Password|
      | Renu@gmail.com |   renu213          | 
      | Pavi12@gmail.com |     pavi122344   | 
