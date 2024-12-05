package org.diamondstalker.stepDefinitions;

import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;
import org.diamondstalker.steps.HomeStep;
import org.diamondstalker.steps.SignUpStep;

public class RegistrarUsuarioStepDefinitions {

    @Steps
    HomeStep homeStep;

    @Steps
    SignUpStep signUpStep;

    @Dado("que se abre el url de pagina, pulsa el boton mi cuenta")
    public void queSeAbreElUrlDePaginaPulsaElBotonMiCuenta() {
        homeStep.abrirNavegador();
    }
    @Cuando("ingresa el correo para validar, ingresa la información del usuario, dar click en registo")
    public void ingresaElCorreoParaValidarIngresaLaInformaciónDelUsuarioDarClickEnRegisto() {
        homeStep.clickSingUp();
        signUpStep.insertarDatos();
    }
    @Entonces("verá el panel del control de usuario")
    public void veráElPanelDelControlDeUsuario() {
    }

}
