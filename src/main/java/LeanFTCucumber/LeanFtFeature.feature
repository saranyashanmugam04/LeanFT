Feature: TestMe Login Test

  Scenario: Login Valid Test
  Given user opens testme application
  When user enter valid username
  When user enter valid password
  When user clicks login
  Then verify login success