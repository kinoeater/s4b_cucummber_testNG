@desktop @UserA @UserB
Feature: Verify that User can stop and start the video successfully	

  Scenario: Video Call stop and start (camera off-on feature)
    Given UserA can see "Calls" on "calls.tab.text" location
      And UserA clicks "calls.tab"
    Given UserB can see "Calls" on "calls.tab.text" location
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
      And UserA can see "videocam" on "calls.actions.camera.button.icon" location
      And UserA clicks "calls.actions.camera.button"
      And UserA waits for "3000" seconds
      And UserA can see "videocam_off" on "calls.actions.camera.button.icon" location
      And UserA clicks "calls.actions.camera.button"
      And UserA waits for "3000" seconds
      And UserA can see "videocam" on "calls.actions.camera.button.icon" location
      And UserA clicks "calls.actions.callend.button"
      And UserA waits for "3000" seconds
    
      
     