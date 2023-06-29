Feature: Login Tests - this feature contains all Login tests

  Background:
    Given the user opens the Login application

  Scenario Outline: The user can successfully log in
    When the user enters a username "<username>"
    And the user enters a valid password "<password>"
    And the user clicks on the Login button
    Then the user receives the following message <popUpMessage>
    Examples:
      |username     | password            | popUpMessage                      |
      |tomsmith     | SuperSecretPassword!|"You logged into a secure area!\n×"|



  Scenario Outline: The user logs in with invalid username
    When the user enters a username "<username>"
    And the user enters a valid password "<password>"
    And the user clicks on the Login button
    Then the user receives the following message <popUpMessage>

    Examples:
      |username     | password            | popUpMessage                 |
      |cevaceva     | SuperSecretPassword!|"Your username is invalid!\n×" |

  Scenario Outline: The user logs in with invalid password
    When the user enters a username "<username>"
    And the user enters a valid password "<password>"
    And the user clicks on the Login button
    Then the user receives the following message <popUpMessage>


    Examples:
    |username     | password            | popUpMessage                |
    |tomsmith     | SuperParolaGresita  |"Your password is invalid!\n×" |