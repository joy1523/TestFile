#Author: your.email@your.domain.com
@tag
Feature: To test new customer functionali
	  Given The user is in guru home page
    @tag
  Scenario Outline: To add new customersn
    Given The user in guru home page 
    When The user logged in as manager with "<mngrID>" and "<mngrpass>"
    And  The user enters add customer page
    And  The user enters the customer details "<CustName>","<Gender>","<DOB>","<Address>","<city>","<state>","<PIN>","<Phnum>","<email>" and "<pass>"
    And  The user clicks submit button
    Then The user is successfully registered
  

    Examples: 
      | CustName | Gender | DOB        | Address        | city    | state | PIN    | Phnum      | email                | pass     | mngrID     | mngrpass |
      | Joy    | female | 12-12-1987 | Sundaram Nagar | chennai | TN    | 601203 | 9884514231 | joybenezer@gmail.com | Hello123 | mngr154050 | zamynEs  |
          @tag
    Scenario:  To Edit customers
      When The user clicks Edit Customer option and enter custid
      When The user clicks submit button
      Then The user can edit the details
         
    Scenario: To Delete a customer
         When The user clicks delete customer option and enter custid
         When The user clicks submit button
         Then The user details can be deleted
         
       