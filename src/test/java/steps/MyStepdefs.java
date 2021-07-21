package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
        @Given("i am on Ebay Home Page")
        public void i_am_on_ebay_home_page() {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("i am on Ebay Home Page");
        }
        @When("I click on advance Link")
        public void i_click_on_advance_link() {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("I click on advance Link");
        }
        @Then("I navigate to Advance search Page")
        public void i_navigate_to_advance_search_page() {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("I navigate to Advance search Page");
        }
//    }
}
