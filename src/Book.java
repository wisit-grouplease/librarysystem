import java.util.Date;

public class Book{
    enum BStat{All,Active,Pending,Borrowed,Damaged}
    enum BCategory{NA,General,Documentary,Entertainment};

    private int bkID;
    private String bkCode;
    private String bkName;
    private String bkAuthor;
    private String bkShelf;
    private BStat bkStat;
    private BCategory bkCategory;
    private String bkLibrarian;
    private String bkBorrower;
    private Date bkBorrowedDate;
    private Date bkRetrunDate;

    public Book(){
        bkID = 0;
        bkCode = "0";
        bkName = "NewBook";
        bkAuthor = "N/A";
        bkShelf = "N/A";
        bkStat = BStat.Active;
        bkCategory = BCategory.General;
        bkLibrarian = "";
        bkBorrower = "";
        bkBorrowedDate = null;
        bkRetrunDate = null;
    }

    public Book(int ID,String Code,String Name,String Author,String Shelf,BStat Stat,BCategory Category,
                String Librarian,String Borrower,Date BorrowedDate,Date reDate){
        this.bkID = ID;
        this.bkCode = Code;
        this.bkName = Name;
        this.bkAuthor = Author;
        this.bkShelf = Shelf;
        this.bkStat = Stat;
        this.bkCategory = Category;
        this.bkLibrarian = Librarian;
        this.bkBorrower = Borrower;
        this.bkBorrowedDate = BorrowedDate;
        this.bkRetrunDate = reDate;
    }

    public int getBkID() {        return bkID;    }
    public String getBkAuthor() {        return bkAuthor;    }
    public String getBkCode() {        return bkCode;    }
    public String getBkName() {        return bkName;    }
    public Date getBkBorrowedDate() {        return bkBorrowedDate;    }
    public Date getBkRetrunDate() {        return bkRetrunDate;    }
    public String getBkShelf() {        return bkShelf;    }
    public String getBkBorrower() {        return bkBorrower;    }
    public BStat getBkStat() {        return bkStat;    }
    public String getBkLibrarian() {        return bkLibrarian;    }
    public BCategory getBkCategory() {        return bkCategory;    }

    public void lendBook(Customer cus,Date BorrowedDate){
        this.bkBorrower = cus.getCusName();
        this.bkBorrowedDate = BorrowedDate;
        this.bkStat = BStat.Pending;
    }

    public void Approve(Employee emp){
        this.bkLibrarian = emp.getEmName();
        this.bkStat = BStat.Borrowed;
    }

    public void returnBook(Date returnDate){
        this.bkRetrunDate = returnDate;
        this.bkStat = BStat.Active;
    }

}
