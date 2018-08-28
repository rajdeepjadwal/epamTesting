Feature: Test clear trip

  @testClearTrip
  Scenario Outline: check and verify availblity of flight on clear trip
    Given user navigate to clear trip URL
    When user select multi-city radio button on clear trip home page
    When user enter value in "From1" text box
    When user enter value in "To1" text box
    #When user select date from  "1stCal" depart on calendar option
    When user enter value in "From2" text box
    When user enter value in "To2" text box
    #When user select date from  "2ndCal" depart on calendar option
    When user enter value in "From3" text box
    When user enter value in "To3" text box
    #When user select date from  "3rdCal" depart on calendar option
    When user select adults from drop down
    When user select class of travel from drop down
    When user click on search flight button


    Examples:
      | name  | value | status  |
      | name1 |     5 | success |