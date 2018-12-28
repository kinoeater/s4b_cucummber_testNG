@desktop @UserA
Feature: Verify User A can search and view the details of a contact.

  Scenario: View the details of a contact
    Given UserA logs into kandy with "011902165222512@172.28.247.41" "myol" "3456"
      And UserA logs into skype with "myol@gbsolutions.work" "Lkjh1234"
     When UserA clicks "contacts.credentialssaveno"
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.search.button"
      And UserA enters "Semra Boyaci" to "contacts.search.input"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA clicks "contact.view.contact.info" 
      And UserA waits for "2000" seconds
      And UserA can see "close" on "contact.details.right.panel.close.button.text.area" location
      And UserA clicks "contact.details.right.panel.close.button"
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA waits for "2000" seconds
      And UserA clicks "contact.add.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA waits for "2000" seconds
      And UserA clicks "contact.remove.contact"
      And UserA waits for "3000" seconds
      And UserA clicks "settings.tab"
      And UserA clicks "settings.tab"
      And UserA clicks "settings.logout.button" 
      And UserA clicks "settings.popuplogout"
      And UserA waits for "3000" seconds
      And UserA exits client
      
      