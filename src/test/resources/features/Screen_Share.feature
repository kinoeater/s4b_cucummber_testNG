@desktop @UserA @UserB
Feature: Verify that User A and User B logs in and make a call, then screen can be shared.

  Scenario: Screen Share
    Given UserA logs into kandy with "011902165222512@172.28.247.41" "myol" "3456"
      And UserA logs into skype with "myol@gbsolutions.work" "Lkjh1234"
     When UserA clicks "contacts.credentialssaveno"
      And UserA waits for "3000" seconds
    Given UserB logs into kandy with "011902165225323@172.28.247.41" "muratc" "3456"
      And UserB logs into skype with "muratc@gbsolutions.work" "Lkjh1234"
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
      And UserA waits for "3000" seconds
      And UserA can see "stop_screen_share" on "calls.actions.screenshare.button.icon" location
      And UserA clicks "calls.actions.screenshare.button"
      And UserA waits for "4000" seconds
      And UserA select "calls.actions.screenshare.chose_image" 
      And UserA waits for "2000" seconds
      And UserA clicks "calls.actions.screenshare.chosen_image_share"
      And UserA waits for "10000" seconds
      And UserA can see "screen_share" on "calls.actions.screenshare.button.icon" location
      And UserA clicks "calls.actions.screenshare.button"
      And UserA can see "stop_screen_share" on "calls.actions.screenshare.button.icon" location
      And UserA waits for "5000" seconds
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
     
      
     