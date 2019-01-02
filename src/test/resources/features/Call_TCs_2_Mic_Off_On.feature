@desktop @UserA @UserB
Feature: Verify that User A and User B logs in and make a call, then mute-unmute the call.	

  Scenario: Mute-Unmute the call
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
      And UserA can see "mic" on "calls.actions.microphone.button.icon" location
      And UserA clicks "calls.actions.microphone.button"
      And UserA waits for "7000" seconds
      And UserA can see "mic_off" on "calls.actions.microphone.button.icon" location
      And UserA clicks "calls.actions.microphone.button"
      And UserA waits for "3000" seconds
      And UserA can see "mic" on "calls.actions.microphone.button.icon" location
      And UserA waits for "3000" seconds
      And UserA clicks "calls.actions.callend.button"
      And UserA waits for "3000" seconds
  
      
     