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

    @Given("A {string} is {int} kr")
    public void aIsKr(String type, int coffeePrice) {
        serve = new ServeCoffee();
        serve.coffeeType(type);
        serve.insertPrice(coffeePrice);
    }


    @And("I have deposited {int} kr")
    public void iHaveDepositedMoneyKr(int money) {
        serve.depositMoney(money);
    }

    @When("I select {int} {string}")
    public void iSelectCupCup(int cup,String type) {
        serve.selectCup(cup);
        serve.coffeeType(type);
    }

    @And("I press the coffee {string}")
    public void iPressYes(String button) {
        serve.pressButton(button);
    }


    @Then("My order is {string}")
    public void myOrderIsFailed(String expected) {
        String actual=serve.getOrder();
        assertEquals(expected,actual);
    }


    @And("I get my {string}")
    public void iGetMy(String expected) {
        String actual=serve.myReceipt();
        assertEquals(expected,actual);

    }


}
