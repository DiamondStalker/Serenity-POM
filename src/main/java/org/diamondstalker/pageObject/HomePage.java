package org.diamondstalker.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    private By btnSignUp = By.id("signin2");

    public By getBtnSignUp() {
        return btnSignUp;
    }
}
