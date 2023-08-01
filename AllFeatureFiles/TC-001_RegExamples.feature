Feature: Implementing guru99 with sceanrio outlines

  Scenario Outline: create new user in guru99
    When user is on home page
    When user enter fname "<Fisrtname>" lname "<lastname>" MailID "<Emailid>" and Phone "<phone>"
    Then Enter Address "<Address>" and city "<city>"
    Then enter Username "<Username>" password  "<password>" and confirmPass "<ConfirmPassword>"
    And refresh page

    Examples: 
      | Fisrtname | lastname | Emailid         | phone      | Address  | city       | Username        | password  | ConfirmPassword |
      | Gauri     | Chawathe | gauri@gmail.com | 1212121212 | Pune     | Wakad      | gauri@gmail.com | gauri1234 | gauri1234       |
      | sssssriq  | qqqqqe   | wwwi@gmail.com  | 2212121212 | Pudsasfe | Wfdafadfaf | sssss@gmail.com | sssss1234 | sssss1234       |
