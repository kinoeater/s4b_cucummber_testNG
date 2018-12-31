@desktop @UserA
Feature: Verify User A can perform basic actions on contacts.

  Scenario: User can search a contact from the search bar
    Given UserA logs into kandy with "011902165222512@172.28.247.41" "myol" "3456"
      And UserA logs into skype with "myol@gbsolutions.work" "Lkjh1234"
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
      
  Scenario: User can add contact, then add it to favorites, remove from favorites and remove from contacts   
    Given UserA can see "Create Group" on "contacts.creategroup.button" location 
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA waits for "2000" seconds
      And UserA clicks "contact.add.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA waits for "2000" seconds
      And UserA clicks "contact.add.favorite"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA waits for "3000" seconds
      And UserA clicks "contact.remove.from.favorite"
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA clicks "contact.remove.contact"
      And UserA waits for "3000" seconds
 
 
 
 
 Scenario: User can add  contacts and then create a group.   
    Given UserA can see "Create Group" on "contacts.creategroup.button" location 
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.search.button"
      And UserA enters "Semra Boyaci" to "contacts.search.input"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA clicks "contact.add.contact" 
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.button"
      And UserA enters "Ecem Yilmaz" to "contacts.search.input"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Ecem.Yilmaz" 
      And UserA clicks "contact.add.contact" 
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.button"
      And UserA enters "Murat Cinar" to "contacts.search.input"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Murat.cinar" 
      And UserA clicks "contact.add.contact" 
      And UserA waits for "2000" seconds
          
      
      
      
    #  And UserA clicks "settings.tab"
    #  And UserA clicks "settings.tab"
    # And UserA clicks "settings.logout.button" 
    # And UserA clicks "settings.popuplogout"
    #  And UserA waits for "3000" seconds
    # And UserA exits client
      
      