@desktop @UserA
Feature: User can view the details of a contact
      
  Scenario: User can view the details of a contact
    Given UserA can see "Create Group" on "contacts.creategroup.button" location 
      And UserA clicks "contacts.search.button"
      And UserA enters "Semra Boyaci" to "contacts.search.input"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA clicks "contact.view.contact.info" 
      And UserA waits for "2000" seconds
      And UserA can see "close" on "contact.details.right.panel.close.button.text.area" location
      And UserA clicks "contact.details.right.panel.close.button"
      And UserA waits for "3000" seconds
      