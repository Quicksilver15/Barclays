package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SubCategoryPage {
    BaseFunc baseFunc;
    private final By APPLICANTS = By.xpath(".//label[contains(@for, 'Applicants')]");
    private final By INCOME_1_AMOUNT = By.xpath(".//input[contains(@id, 'Income-1')]");
    private final By INCOME_1_TERM = By.xpath(".//select[contains(@id, 'IncomeFrequency-1')]");
    private final By INCOME_2_AMOUNT = By.xpath(".//input[contains(@id, 'Income-2')]");
    private final By INCOME_2_TERM = By.xpath(".//select[contains(@id, 'IncomeFrequency-2')]");
    private final By INCOME_3_AMOUNT = By.xpath(".//input[contains(@id, 'Income-3')]");
    private final By INCOME_3_TERM = By.xpath(".//select[contains(@id, 'IncomeFrequency-3')]");
    private final By INCOME_4_AMOUNT = By.xpath(".//input[contains(@id, 'Income-4')]");
    private final By INCOME_4_TERM = By.xpath(".//select[contains(@id, 'IncomeFrequency-4')]");
    private final By SPENDING_AMOUNT = By.xpath(".//input[contains(@id, 'Spending')]");
    private final By SPENDING_TERM = By.xpath(".//select[contains(@id, 'Spending')]");
    private final By REASON = By.xpath(".//select[contains(@id, 'Reason')]");
    private final By DEPOSIT = By.xpath(".//input[contains(@id, 'Deposit')]");
    private final By CALCULATE = By.xpath(".//button[contains(@class, 'btn-calculate')]");

    public SubCategoryPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectNumberOfApplicants(int id) {
        baseFunc.getElements(APPLICANTS).get(id).click();
    }

    public void enterIncome1Amount(String income) {
        baseFunc.getElement(INCOME_1_AMOUNT).sendKeys(income);
    }

    public void selectIncome1Term(String term) {
        Select drpDown = new Select(baseFunc.getElement(INCOME_1_TERM));
        drpDown.selectByVisibleText(term);
    }

    public void enterIncome2Amount(String income) {
        baseFunc.getElement(INCOME_2_AMOUNT).sendKeys(income);
    }

    public void selectIncome2Term(String term) {
        Select drpDown = new Select(baseFunc.getElement(INCOME_2_TERM));
        drpDown.selectByVisibleText(term);
    }

    public void enterIncome3Amount(String income) {
        baseFunc.getElement(INCOME_3_AMOUNT).sendKeys(income);
    }

    public void selectIncome3Term(String term) {
        Select drpDown = new Select(baseFunc.getElement(INCOME_3_TERM));
        drpDown.selectByVisibleText(term);
    }

    public void enterIncome4Amount(String income) {
        baseFunc.getElement(INCOME_4_AMOUNT).sendKeys(income);
    }

    public void selectIncome4Term(String term) {
        Select drpDown = new Select(baseFunc.getElement(INCOME_4_TERM));
        drpDown.selectByVisibleText(term);
    }

    public void enterSpendingAmount(String amount) {
        baseFunc.getElement(SPENDING_AMOUNT).sendKeys(amount);
    }

    public void selectSpendingTerm(String term) {
        Select drpDown = new Select(baseFunc.getElement(SPENDING_TERM));
        drpDown.selectByVisibleText(term);
    }

    public void selectReason(String reason) {
        Select drpDown = new Select(baseFunc.getElement(REASON));
        drpDown.selectByVisibleText(reason);
    }

    public void enterDeposit(String deposit) {
        baseFunc.getElement(DEPOSIT).sendKeys(deposit);
    }

    public ResultPage calculateAmount() {
        for (int i = 0; i < 2; i++) {
            baseFunc.getElement(CALCULATE).click();
        }
        return new ResultPage(baseFunc);
    }
}
