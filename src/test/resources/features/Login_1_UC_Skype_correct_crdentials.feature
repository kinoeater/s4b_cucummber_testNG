@desktop @UserA 
Feature: Verify that User A can login to UC and Skype successfully with correct credentials.	

  Scenario: Login to UC and Skype
    Given UserA is launched 
      And UserA enters "011902165222512@172.28.247.41" to "login.kandyUserAname"
      And UserA enters "myol" to "login.kandyauthname"
      And UserA enters "3456" to "login.kandypassword" 
     When UserA clicks "login.kandysubmit"
      And UserA enters "myol@gbsolutions.work" to "login.skypeUserAname"
      And UserA enters "Lkjh1234" to "login.skypepassword"
     When UserA clicks "login.skypesubmit" 
     When UserA clicks "contacts.credentialssaveno" 
     Then UserA can see "CREATE GROUP" on "contacts.creategroup" location
      And UserA clicks "settings.tab"
      And UserA clicks "settings.logoutbutton"
      And UserA clicks "settings.popuplogout"
     Then UserA can see "Unified Communications" on "login.carusel" location
      And UserA exits client
      
   
  
  
  