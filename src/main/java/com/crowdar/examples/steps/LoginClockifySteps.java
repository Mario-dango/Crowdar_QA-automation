package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.LoginClockifyService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;

public class LoginClockifySteps extends PageSteps {

    @Given("Tener instalado la aplicación en el dispositivo")
    public void isHomePageVisible() {
        //LoginClockifyService.isViewLoaded("Loginheadline");
    }

    @When ("El usuario ingrese con sus credenciales: '(.*)', '(.*)'$")
    public void toDoLogin(String correo, String contrasena) {
        LoginClockifyService.doLogin(correo, contrasena);
    }

    @Then("Se muestra el dashboard correspondiente a la cuenta")
    public void isDashBoardVisible() {
        LoginClockifyService.isViewLoaded("Add time entry");
    }

}
