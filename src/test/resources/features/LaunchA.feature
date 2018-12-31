@desktop @UserA
Feature: Verify User A can search and view the details of a contact.

  Scenario: User can search a contact from the search bar
    Given UserA logs into kandy with "userA.kandy.name" "userA.kandy.auth" "userA.kandy.pass"
      And UserA logs into skype with "userA.skype.name" "userA.skype.pass"
     When UserA clicks "contacts.credentialssaveno"
   
    
  
