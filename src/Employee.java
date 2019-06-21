public class Employee {
    private int emID;
    private String emName;

    public Employee(){
        emID = 0;
        emName = "New Employee";
    }

    public Employee(int ID,String Name){
        emID = ID;
        emName = Name;
    }

    public int getEmID() {       return emID;    }
    public String getEmName() {       return emName;   }

    public void setEmID(int emID) {       this.emID = emID;   }
    public void setEmName(String emName) {       this.emName = emName;   }
}
