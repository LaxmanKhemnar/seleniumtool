Feature: Open multiple UI page links

  Scenario: Open links from Excel
    Given I open the browser
    When I read the links from "C:\Users\vivek.nityo\eclipse-workspace\HealthMonitoring\Daily MIS 2024 2 (version 2).xlsx"
    Then I open each link in the browser