package org.diamondstalker.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SingUpPage extends PageObject {

    private By inputUserName = By.id("sign-username");
    private By inputContra = By.id("sign-password");

    public By getInputUserName() {
        return inputUserName;
    }

    public By getInputContra() {
        return inputContra;
    }
}
