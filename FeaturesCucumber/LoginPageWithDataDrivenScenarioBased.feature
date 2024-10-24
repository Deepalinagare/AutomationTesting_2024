Feature: LOGIN

  Scenario Outline: Verify the fucntionbality of login Page.
    Given Lauch Chrome Browser And open saucedemo site in chrome browser.
    When Enter "<username>" in username field And Enter Password "<password>" And click on sumbmit button.
    Then I verify the user is login by checking the url site.

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
