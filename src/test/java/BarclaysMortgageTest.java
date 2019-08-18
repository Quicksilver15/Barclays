import org.junit.Test;
import pages.*;

public class BarclaysMortgageTest {
    private BaseFunc baseFunc = new BaseFunc();
    private final String HOME_PAGE = "barclays.co.uk";

    @Test
    public void amountCheck() {
        baseFunc.goToPage(HOME_PAGE);
        HomePage homePage = new HomePage(baseFunc);

        CategoryPage categoryPage = homePage.goToCategory(12);
        SubCategoryPage subCategoryPage = categoryPage.goToSubCategory(5);

        subCategoryPage.selectNumberOfApplicants(1);

        subCategoryPage.enterIncome1Amount("3500");
        subCategoryPage.selectIncome1Term("Monthly");

        subCategoryPage.enterIncome2Amount("2800");
        subCategoryPage.selectIncome2Term("Monthly");

        //subCategoryPage.enterIncome3Amount("");
        //subCategoryPage.selectIncome3Term("");

        //subCategoryPage.enterIncome4Amount("");
        //subCategoryPage.selectIncome4Term("");

        subCategoryPage.enterSpendingAmount("3000");
        subCategoryPage.selectSpendingTerm("Monthly");

        subCategoryPage.selectReason("Buy a first home");

        subCategoryPage.enterDeposit("20000");

        ResultPage resultPage = subCategoryPage.calculateAmount();

        resultPage.verifyResult();

        baseFunc.closeBrowser();
    }
}
