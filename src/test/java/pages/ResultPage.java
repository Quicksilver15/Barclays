package pages;

import org.openqa.selenium.By;

public class ResultPage {
    BaseFunc basefunc;
    private final By RESULT = By.xpath(".//h2[contains(@class, 'BorrowResults')]");

    public ResultPage(BaseFunc basefunc) {
        this.basefunc = basefunc;
    }

    public void verifyResult() {
        if (basefunc.getElement(RESULT) != null) {
            System.out.println("Borrow result is present");
        }
        else {
            System.out.println("Borrow result is absent");
        }
    }
}
