Feature: Applicaiton Login

Scenario: Home Page default login
Given User is on landing page
When User login into application with username "test" and password "password"
Then Home page is populated
And Cards are displayed

Scenario: Home Page default login 2
Given User is on landing page
When User login into application with username "dev" and password "password"
Then Home page is populated
And Cards are displayed

Scenario Outline: Parameterizing Login
Given User is on landing page
When User login into application with username: <username> and password: <password>
Then Home page is populated
And Cards are displayed

Examples:
|username|password|
|test1|password1|
|test2|password2|
|test3|password3|