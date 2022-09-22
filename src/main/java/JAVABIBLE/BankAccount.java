package JAVABIBLE;

public class BankAccount {
    private Integer id;
    private BANKSERVICES bankService;
    //an account need a name
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }


}
