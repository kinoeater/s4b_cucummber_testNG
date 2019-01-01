@desktop @UserA
Feature: User should run the basic sanity test cases

  Scenario: User can search a contact from the search bar
    Given UserA logs into kandy with "userA.kandy.name" "userA.kandy.auth" "userA.kandy.pass"
      And UserA logs into skype with "userA.skype.name" "userA.skype.pass"
     When UserA clicks "contacts.credentialssaveno"
      And UserA waits for "3000" seconds
      And UserA can see "Create Group" on "contacts.creategroup.button" location
  	  And UserA clicks "contacts.search.button"
      And UserA enters "Semra Boyaci" to "contacts.search.input"
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "3000" seconds
   
      
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
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "3000" seconds
      
  Scenario: User can add contact, then add it to favorites, remove from favorites and remove from contacts   
    Given UserA can see "Create Group" on "contacts.creategroup.button" location 
      And UserA clicks "contacts.search.button"
      And UserA enters "Semra Boyaci" to "contacts.search.input"
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA waits for "2000" seconds
      And UserA clicks "contact.add.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "2000" seconds

Scenario: User can add contact, then add it to favorites, remove from favorites and remove from contacts   
    Given UserA can see "Create Group" on "contacts.creategroup.button" location        
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA waits for "2000" seconds
      And UserA clicks "contact.add.favorite"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA waits for "3000" seconds
      And UserA clicks "contact.remove.from.favorite"
      And UserA waits for "2000" seconds
      
      
 Scenario: User can remove a contact from the contacts
    Given UserA can see "Create Group" on "contacts.creategroup.button" location             
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA waits for "2000" seconds
      And UserA clicks "contact.remove.contact"
      And UserA waits for "3000" seconds

Scenario: Add contacts, create group, delete group.
    Given UserA can see "Create Group" on "contacts.creategroup.button" location 
      And UserA clicks "contacts.search.button"
      And UserA enters "Ecem Yilmaz" to "contacts.search.input"
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Ecem.Yilmaz" 
      And UserA clicks "contact.add.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.button"
      And UserA enters "Murat Cinar" to "contacts.search.input"
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Murat.Cinar" 
      And UserA clicks "contact.add.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA can see "Create Group" on "contacts.creategroup.button" location
      And UserA clicks "contacts.creategroup.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.creategroup.name.input"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.creategroup.name.cancel"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.creategroup.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.creategroup.name.input"
      And UserA waits for "2000" seconds
      And UserA enters "NewGroup" to "contacts.creategroup.name.input"
      And UserA waits for "4000" seconds
      And UserA clicks "contacts.creategroup.name.save"
      And UserA waits for "5000" seconds
      And UserA clicks "contacts.NewGroup.more.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contact.group.modify"
      And UserA waits for "2000" seconds
      And UserA clicks "Contact.Murat.Cinar.Group"
      And UserA waits for "2000" seconds
      And UserA clicks "Contact.Ecem.Yilmaz.Group"
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
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Murat.Cinar" 
      And UserA clicks "contact.remove.contact" 
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Ecem.Yilmaz" 
      And UserA clicks "contact.remove.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "settings.tab"
      And UserA clicks "settings.logout.button" 
      And UserA clicks "settings.popuplogout"
      And UserA waits for "3000" seconds
      And UserA exits client
       
    
  
      
      
                