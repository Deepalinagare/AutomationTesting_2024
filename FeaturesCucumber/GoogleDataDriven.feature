Feature: Google with search fucntionality

  @tag2
  Scenario Outline: Title of your scenario outline
    Given Launch the Chrome Browser And Open Google Chrome.
    When Serach for "<Search>" value.
    Then check for title "<Title>"

    Examples: 
      | Search   | Title    |
      | Mobile   | Mobile   |
      | Tab      | Tab      |
      | Laptop   | Laptop   |
      | Keyboard | Keyboard |
