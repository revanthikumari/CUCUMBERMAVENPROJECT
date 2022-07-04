package com.facebook.step;

import com.facebook.pages.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefinatio extends Loginpage   {
	
	Loginpage Loginpage =new Loginpage();
	
		@Given("^User should be able to open facebook Application$")
		public void user_should_be_able_to_open_facebook_Application() throws Throwable {
			Loginpage.openUrl();
		}

		@When("^User enter Username $")
		public void user_enter_Username() throws Throwable {
			Loginpage.userName();
		}
			

		@When("^User enter Password $")
		public void user_enter_Password() throws Throwable {
			Loginpage.passWord();
		}

		@When("^User click on Login button$")
		public void user_click_on_Login_button() throws Throwable {
			Loginpage.loginButton();
		}

		@Then("^User should be able to login successfully$")
		public void user_should_be_able_to_login_successfully() throws Throwable {
			Loginpage.verifyLogin();
		}

		/*@When("^User click on create new account$")
		public void user_click_on_create_new_account() throws Throwable {
			
		}
		
		@Then("user Should be able to signup Sucessfully")
		public void user_should_be_able_to_signup_sucessfully()throws Throwable  {
		  
		}*/
	}

	
	
	
	
	
	
	
	

