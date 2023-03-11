package serveCoffee;

public class ServeCoffee {
    int price;
    int money;
    int cup;
    String type;
    String button;
    String order;
    String receipt;

    public void coffeeType(String type) {
        this.type=type;
    }
    public void insertPrice(int price) {
        this.price = price;
    }

    public void depositMoney(int money) {
        this.money = money;
    }

    public void selectCup(int cup) {
        this.cup = cup;
    }

    public void pressButton(String button) {
        this.button = button;
    }

    public String getOrder() {
        if (money >= price * cup&& button.equals("Yes")) {
            order = "Succeeded";
        } else order = "Failed";
        return order;
    }


    public String myReceipt() {
        if(order=="Succeeded"){
            receipt=cup+" "+type;
        }else receipt="not order";
        System.out.println(receipt);
        return receipt;

    }
}