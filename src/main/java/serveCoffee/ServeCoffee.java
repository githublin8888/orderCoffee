package serveCoffee;

public class ServeCoffee {
    String type;
    int price;
    int money;
    int cup;
    boolean isPress;
    String button;
    String order;

    public void getSort(String type) {
        this.type=type;
    }

    public void getPrice(int price) {
        this.price=price;
    }

    public void putMoney(int money) {
        this.money=money;
    }

    public void getCup(int cup) {
        this.cup=cup;
    }

    public void pressButton(String button) {
        this.button=button;
    }

    public String myOrder() {
        if(cup>0 && money>price*cup && type!=null && button=="Yes"){
            order="Succeeded";
        }else order="Failed";
        return order;
    }
}
/*
if(button.equals("Yes")){
            isPress=true;
        } else if (button.equals("No")) {
            isPress=false;

        }
 */