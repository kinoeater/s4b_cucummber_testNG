@desktop @UserA
Feature: Verify UserA can search and add contacts then create a group, then add members to group and delete the group.

  Scenario: Add contacts, create group, delete group.
    Given UserA logs into kandy with "011902165222512@172.28.247.41" "myol" "3456"
      And UserA logs into skype with "myol@gbsolutions.work" "Lkjh1234"
     When UserA clicks "contacts.credentialssaveno"
      And UserA can see "Create Group" on "contacts.creategroup.button" location 
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.search.button"
      And UserA enters "Semra Boyaci" to "contacts.search.input"
      And UserA waits for "3000" seconds
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA clicks "contact.add.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "2000" seconds
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
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Murat.Cinar" 
      And UserA clicks "contact.remove.contact" 
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Semra.Boyaci" 
      And UserA clicks "contact.remove.contact" 
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Ecem.Yilmaz" 
      And UserA clicks "contact.remove.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "settings.tab"
      And UserA clicks "settings.tab"
      And UserA clicks "settings.logout.button" 
      And UserA clicks "settings.popuplogout"
      And UserA waits for "3000" seconds
      And UserA exits client
       
    
  
      
      
          
  
      
      