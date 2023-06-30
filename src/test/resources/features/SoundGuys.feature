Feature: Sound Guys Testing the reject cookies method
  Scenario: The user can close the pop-up banner for the cookies
    Given The user is on the main page for sound guys
    When The user clicks on the 'more options' button
    And The user clicks on reject all
    And The user clicks on 'save and exit' button
    And The user clicks the 'here' button
    Then The user is redirected to