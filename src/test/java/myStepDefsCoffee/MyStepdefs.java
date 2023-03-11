package myStepDefsCoffee;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import serveCoffee.ServeCoffee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyStepdefs {

    ServeCoffee serve;

    @Given("A ([^\"]*) is {int} kr")
    public void aCoffeeTypeIsPriceKr(String coffee, int coffeePrice) {
        serve = new ServeCoffee();
        serve.getSort(coffee);
        serve.getPrice(coffeePrice);
    }

    @And("I have deposited {int} kr")
    public void iHaveDepositedMoney(int money) {
        serve.putMoney(money);
    }

    @When("I select {int} ([^\"]*)")
    public void iSelectCupCoffeeType(int cup, String coffee) {
        serve.getCup(cup);
        serve.getSort(coffee);
    }

    @When("I press the Yes")
    public void iPressYes(String button) {
        serve.pressButton(button);
    }

    @When("I press the No")
    public void iPressNo(String button) {
        serve.pressButton(button);
    }

    @Then("My order is ([^\"]*)")
    public void myOrderIsOrder(String expected) {
        String actual = serve.myOrder();
        assertEquals(expected, actual);
    }


}
