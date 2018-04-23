Feature: Create a Lead with FirstName, LastName and CompanyName
@smoke @regression
Scenario Outline: Create a Lead with mandatory fields

#Given open the browser
#And Load url, maximize and wait
And Enter user name as <uName>
And Enter password as <password>
And click on submit button
And click on CRM/SFA
And click Leads link
And click Create Lead
And Enter Company Name as <Cname>
And Enter First Name as <Fname>
And Enter Last Name as <Lname>
When Click on Create Lead button
Then Verify First Name as <Fname>
Examples:
|uName|password|Cname|Fname|Lname|
|DemoSalesManager|crmsfa|HCL|sathis|kannan|

@regression
Scenario Outline: Create a Lead with mandatory fields

#Given open the browser
#And Load url, maximize and wait
And Enter user name as <uName>
And Enter password as <password>
And click on submit button
And click on CRM/SFA
And click Leads link
And click Create Lead
And Enter Company Name as <Cname>
And Enter First Name as <Fname>
And Enter Last Name as <Lname>
When Click on Create Lead button
Then Verify First Name as <Fname>
Examples:
|uName|password|Cname|Fname|Lname|
|DemoSalesManager|crmsfa|HCL|sathis|kannan|