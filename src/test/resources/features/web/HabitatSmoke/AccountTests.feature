@HabitatSmoke
  Feature:AccountTests
    testAccountContent - Test to navigate to login page, navigates to my account page, verifies if Account information link works as expected,
    verfies if change password works, checks if the defaults are correct on account dashboard for addresses,
    subscription and account information
    testAddressBook - Test to navigate to login page, navigates to my account page, goes to My address page, changes the address and saves it.
    It then verifies if the address has been successfully changed
    testMyAccountLoggedIn - Navigates to login page, enters credentials and verifies if the user is on My Account page on logging in.

 Scenario Outline: testAccountContent - Account Information Field Validation
    Given Habitat Home Page
    When User Click Account Head
    And Enter emailaddress "<emailaddress>" and password "<password>"
    Then User "<registereduser>" Successfully Access My Account
    When User Click Account Information
    Then User Can Edit Account Fields title "<title>" firstname "<firstname>" lastname "<lastname>" mobile "<mobile>"

    Examples:
      | emailaddress | password | registereduser | title | firstname | lastname | mobile |
      | regauto1001@salmon.com | salmon01 | regauto1001 | Mr | regauto1001 | Salmon | 01001001001 |
      #| regauto1002@salmon.com | salmon02 | regauto1002 | Miss | regauto1002 | Salmon | 01002001002 |
      #| regauto1003@salmon.com | salmon03 | regauto1003 | Mrs | regauto1003 | Salmon | 01003001003 |

 Scenario Outline: testAccountContent - Verify if change password works
    Given Habitat Home Page
    When User Click Account Head
    And Enter emailaddress "<emailaddress>" and password "<password>"
    Then User "<registereduser>" Successfully Access My Account
    When User Click Account Information
    Then User Successfully Change Current Password "<password>" to New Password "<newpassword>"

    Examples:
      | emailaddress | password | registereduser | newpassword |
      | regauto1001@salmon.com | salmon01 | regauto1001 | salmon123 |
      #| regauto1002@salmon.com | salmon02 | regauto1002 | salmon123 |
      #| regauto1003@salmon.com | salmon03 | regauto1003 | salmon123 |

 Scenario Outline: testMyAccountLoggedIn - Check Defaults for Account Dashboard
    Given Habitat Home Page
    When User Click Account Head
    And Enter emailaddress "<emailaddress>" and password "<password>"
    Then User "<registereduser>" Successfully Access My Account
    And User "<fullname>" Can View Defaults on Account Dashboard "<emailaddress>"

    Examples:
      | emailaddress | password | registereduser | fullname |
      | regauto1001@salmon.com | salmon01 | regauto1001 | regauto1001 Salmon |

 Scenario Outline: testAddressBook - Verify Add Address
  Given Habitat Home Page
  When User Click Account Head
  And Enter emailaddress "<emailaddress>" and password "<password>"
  Then User "<registereduser>" Successfully Access My Account
  When New User Click Address Book
  Then User Can Add Address Mobile "<mobile>" Telephone "<telephone>" Address "<address>"

  Examples:
    | emailaddress | password | registereduser | mobile | telephone | address |
    | regauto1001@salmon.com | salmon01 | regauto1001 | 0111111111 | 44010111111 | Glasgow |
    #| regauto1002@salmon.com | salmon02 | regauto1002 | 0222222222 | 44020222222 | Watford |

 Scenario Outline: testAddressBook - Verify Change Address
      Given Habitat Home Page
      When User Click Account Head
      And Enter emailaddress "<emailaddress>" and password "<password>"
      Then User "<registereduser>" Successfully Access My Account
      When User Click Address Book
      Then User Can Change Current Address "<address>" to New Address "<newaddress>"

      Examples:
        | emailaddress | password | registereduser | address | newaddress |
        | regauto1001@salmon.com | salmon01 | regauto1001 | Glasgow | Liverpool |


