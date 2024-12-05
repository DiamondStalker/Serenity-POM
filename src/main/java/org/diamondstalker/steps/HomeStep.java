package org.diamondstalker.steps;

import net.thucydides.core.annotations.Step;
import org.diamondstalker.pageObject.HomePage;
import org.fluentlenium.core.annotation.Page;

public class HomeStep {
    @Page
    HomePage homePage;

    @Step("Abrir Navegador")
    public void abrirNavegador(){
        homePage.openUrl("https://www.demoblaze.com/index.html");
    }

    @Step("Boton Sign UP")
    public void clickSingUp(){
        homePage.getDriver().findElement(homePage.getBtnSignUp()).click();
    }
}
