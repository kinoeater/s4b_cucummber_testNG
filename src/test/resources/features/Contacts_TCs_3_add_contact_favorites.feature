@desktop @UserA
Feature: User can add contact, then add it to favorites, remove from favorites and remove from contacts   

  
  Scenario: Add contact, add it to favorites, remove from favorites and remove from contacts   
    Given UserA can see "Create Group" on "contacts.creategroup.button" location 
      And UserA clicks "contacts.search.button"
      And UserA enters "Baris Askin" to "contacts.search.input"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Baris.Askin" 
      And UserA waits for "2000" seconds
      And UserA clicks "contact.add.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Baris.Askin" 
      And UserA waits for "2000" seconds
      And UserA clicks "contact.add.favorite"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Baris.Askin" 
      And UserA waits for "3000" seconds
      And UserA clicks "contact.remove.from.favorite"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Baris.Askin" 
      And UserA clicks "contact.remove.contact"
      And UserA waits for "3000" seconds
 
 