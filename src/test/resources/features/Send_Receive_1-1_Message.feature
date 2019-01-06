@desktop @UserA @UserB
Feature: Verify that User A sends Message to User B, and User B receives it.	

  Scenario: Messaging between A and B.
      And UserA choose "Murat Cinar" to send message 
      And UserA waits for "3000" seconds 
      And UserA enters "hello" to "messages.newmessage"
      And UserA waits for "2000" seconds 
      And UserA clicks "messages.sendkey"
      And UserA waits for "3000" seconds 
      And UserB checks if the message from "Mustafa Yol" received is "hello"   
      And UserA waits for "3000" seconds
      And UserB choose "Mustafa Yol" to send message 
      And UserB waits for "3000" seconds 
      And UserB enters "merhaba" to "messages.newmessage"
      And UserB waits for "2000" seconds 
      And UserB clicks "messages.sendkey"
      And UserB waits for "3000" seconds 
      And UserA checks if the message from "Murat Cinar" received is "merhaba"   
      And UserB waits for "3000" seconds
      And UserA clicks "settings.tab"
      And UserA clicks "settings.logout.button" 
      And UserA clicks "settings.popuplogout"
      And UserA waits for "3000" seconds
      And UserA exits client
      And UserB clicks "settings.tab"
      And UserB clicks "settings.tab"
      And UserB clicks "settings.logout.button" 
      And UserB clicks "settings.popuplogout"
      And UserB waits for "3000" seconds
      And UserB exits client
     
      
     