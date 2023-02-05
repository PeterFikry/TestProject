package class19;

public class bankTest {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.accountNumber = 734957399;
        ba.money = 1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        //ba.transfer();   methods defined inside child class not available to the parent class

        System.out.println("--- Creating an object of Checking account --- ");

        Checking check = new Checking();
        //features from parent
        check.accountNumber = 34545;
        check.money = 780;
        //feature from checking class itself
        check.interest = 0;

        check.deposit();        //from parent
        check.transfer();       //from child

        System.out.println("--- Creating an object of Savings account --- ");

        Savings save=new Savings();
        save.accountNumber=657345235;
        save.money=5435;
        save.profit=100;
        //save.interest=0;      siblings features are not available

        save.deposit();     //from parent
        save.takeProfit();  //from savings
        //save.transfer(); not available

        //finish creating SuperSavings object and see which features available to that class
        SuperSavings superSave=new SuperSavings();
        superSave.accountNumber=34543536;
        superSave.money=8453;
        superSave.savings=3356;
        superSave.profit=224;
        superSave.superSaving();
    }
}

