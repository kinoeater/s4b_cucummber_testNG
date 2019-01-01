@desktop @UserA
Feature: User can search a contact from the search bar

  Scenario: User can search a contact from the search bar
      And UserA can see "Create Group" on "contacts.creategroup.button" location
  	  And UserA clicks "contacts.search.button"
      And UserA enters "Semra Boyaci" to "contacts.search.input"
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "3000" seconds
   