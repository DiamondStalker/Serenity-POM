package org.diamondstalker.steps;

import net.thucydides.core.annotations.Step;
import org.diamondstalker.pageObject.SingUpPage;
import org.fluentlenium.core.annotation.Page;

import java.util.ArrayList;
import java.util.Map;
import java.io.IOException;

import org.diamondstalker.utils.*;


public class SignUpStep {
    @Page
    SingUpPage singUpPage;
    ArrayList<Map<String, String>> data;

    @Step("Ingresar usuario y contra")
    public void insertarDatos() {
        //Utils.llenarTxt(singUpPage,singUpPage.getInputUserName(),"Diamanteeee");
        //singUpPage.getDriver().findElement(singUpPage.getInputUserName()).sendKeys("Diamanteeee");

        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Datos.xlsx", "datos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        singUpPage.getDriver().findElement(singUpPage.getInputUserName()).sendKeys(data.get(0).get("Usuario"));
    }
}
