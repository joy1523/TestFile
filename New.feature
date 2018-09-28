#Author: your.email@your.domain.com
@tag
Feature: To Test Amazon book catalog

  @tag1
  Scenario: To test the functionality of Amazon book catalog
    Given The user is in Amazon home page
    When The user select dropdown list and choose book option
    And The user search data catalog 
    And The user selects the first book displayed
    Then The user prints the details of the book

  