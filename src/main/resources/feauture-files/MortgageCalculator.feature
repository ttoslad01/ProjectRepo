Feature: As a User I want to be able to check the rate of Mortgages available to me
#@Dev
  Scenario Outline:
    Given I am on the Mortgage Calculator Home page
    When I enter valid details as "<Home_Value>", "<DownPayment>", "<LoanAmount>", "<InterestRate>", "<LoanTerm>", "<StartMonth>" and "<StartYear>"
    And I click Calculate Button
    Then "<Monthly_Repayment>", "<Down_Payment>", "<MonthlyTax>" and "<MonthlyHomeInsurance>" are correctly dispalyed
    Examples:
    |Home_Value|DownPayment|LoanAmount|InterestRate|LoanTerm|StartMonth|StartYear|Monthly_Repayment|Down_Payment|MonthlyTax|MonthlyHomeInsurance|
    |200000    |40000      |160000    |6           |15      |Oct       |2019     |$1,633.50        |$40,000.00  |$200.00   |$83.33              |