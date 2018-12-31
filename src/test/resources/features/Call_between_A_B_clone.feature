@desktop @UserA @UserB
Feature: Verify that User A and User B logs in and make a call.	

  Scenario: Call between A and B
   Given UserA logs into kandy with "userA.kandy.name" "userA.kandy.auth" "userA.kandy.pass"
      And UserA logs into skype with "userA.skype.name" "userA.skype.pass"
     When UserA clicks "contacts.credentialssaveno"
      And UserA waits for "3000" seconds
  Given UserA logs into kandy with "userB.kandy.name" "userB.kandy.auth" "userB.kandy.pass"
      And UserA logs into skype with "userB.skype.name" "userB.skype.pass"
     When UserB clicks "contacts.credentialssaveno"
      And UserB waits for "3000" seconds 
      And UserB clicks "calls.tab"
      And UserB clicks "calls.dialbutton"
      And UserB clicks "calls.dialpadinput"
      And UserB waits for "2000" seconds
      And UserB enters "011902165222512@172.28.247.41" to "calls.dialpadinput"
      And UserB waits for "3000" seconds
      And UserB clicks "calls.dialpadcall.button"
      And UserA clicks "calls.tab"
      And UserA clicks "calls.answer.button"
      And UserA waits for "6000" seconds
      And UserA clicks "calls.actions.callend.button"
      And UserA waits for "3000" seconds
      And UserA clicks "settings.tab"
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
     
      
     