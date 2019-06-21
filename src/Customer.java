public class Customer {
    private int cusID;
    private String cusName;

    public Customer(){
        cusID = 0;
        cusName = "New Employee";
    }

    public Customer(int ID,String Name){
        cusID = ID;
        cusName = Name;
    }

    public int getCusID() {       return cusID;   }
    public String getCusName() {       return cusName;   }

    public void setCusID(int cusID) {       this.cusID = cusID;   }
    public void setCusName(String cusName) {       this.cusName = cusName;   }
}
