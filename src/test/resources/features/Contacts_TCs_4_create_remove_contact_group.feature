@desktop @UserA
Feature: Verify UserA can search and add contacts then create a group, then add members to group and delete the group.

  Scenario: Add contacts, create group, delete group.
      And UserA can see "Create Group" on "contacts.creategroup.button" location 
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.search.button"
      And UserA enters "Damla Seker" to "contacts.search.input"
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Damla.Seker" 
      And UserA clicks "contact.add.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.button"
      And UserA enters "Mehmet Usanmaz" to "contacts.search.input"
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Mehmet.Usanmaz" 
      And UserA clicks "contact.add.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.search.close.button"
      And UserA can see "Create Group" on "contacts.creategroup.button" location
      And UserA clicks "contacts.creategroup.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.group.name.input"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.new.group.name.cancel"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.creategroup.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.group.name.input"
      And UserA waits for "2000" seconds
      And UserA enters "NewGroup" to "contacts.group.name.input"
      And UserA waits for "4000" seconds
      And UserA clicks "contacts.new.group.name.save"
      And UserA waits for "5000" seconds
      And UserA clicks "contacts.NewGroup.more.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contact.group.modify"
      And UserA waits for "2000" seconds
      And UserA clicks "Contact.Mehmet.Usanmaz.Group"
      And UserA waits for "2000" seconds
      And UserA clicks "Contact.Damla.Seker.Group"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.group.modify.add.contact.save"
      And UserA waits for "3000" seconds
      And UserA clicks "contacts.NewGroup.more.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contact.group.remove"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.group.delete.cancel.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.NewGroup.more.button"
      And UserA waits for "2000" seconds
      And UserA clicks "contact.group.remove"
      And UserA waits for "2000" seconds
      And UserA clicks "contacts.group.delete.button"
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Mehmet.Usanmaz" 
      And UserA clicks "contact.remove.contact" 
      And UserA waits for "2000" seconds
      And UserA right clicks on "Contact.Damla.Seker" 
      And UserA clicks "contact.remove.contact" 
      And UserA waits for "2000" seconds
      And UserA clicks "settings.tab"
      And UserA clicks "settings.logout.button" 
      And UserA clicks "settings.popuplogout"
      And UserA waits for "3000" seconds
      And UserA exits client
      And UserA waits for "3000" seconds