Feature: Complete Web Form starting from homepage
  Scenario: The user can successfully fill the form
    Given The user is on the main page
    When The user clicks on 'complete web form button'
    When The user enters first name "Ciuciuca"
    When The user enters last name "Armand"
    When The user enters job title "QA Tester"
    When The user selects college
    When The user selects the sex option
    When The user selects years of experience
    When The user selects the date "05/22/2023"
    When The user clicks on the submit button
    Then The user receives submit message "The form was successfully submitted!"
