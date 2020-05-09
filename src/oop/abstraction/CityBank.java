package oop.abstraction;

public class CityBank extends Finance implements Bank  {



    public void interest(){

        System.out.println("there is interest for all the banking finances ");

    }

    public void getBusinessFinance(){

        System.out.println("the bank finance businesses ");}




    public void createAccount() {
        System.out.println( " create account");

    }

    public void getDebitCard() {
        System.out.println("debit cards");
    }

    public void getCreditCard() {
        System.out.println("credit card");

    }

    public void TransferMoney() {
        System.out.println("can transfer money");

    }

    public void deposit() {
        System.out.println("can make deposit");

    }

    public void getCash() {
        System.out.println("can get cash");

    }

    public void getEducation() {
        System.out.println("can get education loan");

    }
}
