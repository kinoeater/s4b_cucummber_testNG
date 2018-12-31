@desktop @UserA
Feature: Verify User A can search and view the details of a contact.

  Scenario: User can search a contact from the search bar
    Given UserA logs into kandy with "011902165222512@172.28.247.41" "myol" "3456"
      And UserA logs into skype with "myol@gbsolutions.work" "Lkjh1234"
     When UserA clicks "contacts.credentialssaveno"
      And UserA waits for "5000" seconds
      And UserA clicks "contacts.NewGroup.more.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contact.group.modify"
      And UserA waits for "2000" seconds
      And UserA clicks "Contact.Murat.Cinar.Group"
      And UserA waits for "2000" seconds
      And UserA clicks "Contact.Semra.Boyaci.Group"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.creategroup.name.save"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.NewGroup.more.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contact.group.remove"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.creategroup.delete.cancel.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.NewGroup.more.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contact.group.remove"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.creategroup.delete.button"
      
    
  
