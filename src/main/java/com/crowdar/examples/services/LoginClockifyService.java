package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginClockifyContants;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginClockifyService {

    public static void doLogin(String email, String password){
        MobileActionManager.setInput(LoginClockifyContants.EMAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput(LoginClockifyContants.PASSWORD_INPUT_LOCATOR, password);
        MobileActionManager.click(LoginClockifyContants.LOGIN_BUTTON_LOCATOR);
    }

    public static void isViewLoaded(String Locator){
        MobileActionManager.waitVisibility(LoginClockifyContants.LABEL, Locator);
    }

}
