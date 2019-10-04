package pages;

public interface MortgageCalcInterface {
    public void enterHomeValue(String homeValue);
    public void enterDownPayment(String downPayment);
    public void enterLoanAmt(String loanAmt);
    public void enterInterstRate(String interstRate);
    public void enterLoanTerm(String loanTerm);
    public void selectMonth(String month);
    public void enterYear(String year);
    public void clickOnCalculateButton();
    public String getMonthlyRepayment();
    public String getDownPayment();
    public String getMonthlyTax();
    public String getMonthlyHomeInsurance();

}
