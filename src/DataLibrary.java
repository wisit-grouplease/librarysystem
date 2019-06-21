import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DataLibrary {
    private ArrayList<Book> BookList = new ArrayList<Book>();
    private ArrayList<Book> SearchList = new ArrayList<Book>();
    private Book bk1,bk2,bk3,bk4,bk5,bk6,bk7,bk8,bk9,bk10,bk11,bk12,bk13,bk14,bk15,bk16,bk17,bk18,bk19,bk20;

    private ArrayList<Customer> CusList = new ArrayList<Customer>();
    private Customer cus1,cus2,cus3;

    private ArrayList<Employee> EmpList = new ArrayList<Employee>();
    private Employee emp1,emp2,emp3;

    public DataLibrary(){
        bk1 = new Book(1,"001","ONE","Wisit","A", Book.BStat.Active, Book.BCategory.General,"","",null,null);
        bk2 = new Book(2,"002","TWO","Wisoot","A", Book.BStat.Active, Book.BCategory.General,"","",null,null);
        bk3 = new Book(3,"003","THREE","Wisit","A", Book.BStat.Active, Book.BCategory.General,"","",null,null);
        bk4 = new Book(4,"004","FOUR","Sek","A", Book.BStat.Active, Book.BCategory.General,"","",null,null);
        bk5 = new Book(5,"005","FIVE","Sek","A", Book.BStat.Active, Book.BCategory.General,"","",null,null);
        bk6 = new Book(6,"006","SIX","Bank","B", Book.BStat.Active, Book.BCategory.Entertainment,"","",null,null);
        bk7 = new Book(7,"007","SEVEN","Wisit","B", Book.BStat.Active, Book.BCategory.Entertainment,"","",null,null);
        bk8 = new Book(8,"008","EIGHT","BEE","B", Book.BStat.Active, Book.BCategory.Entertainment,"","",null,null);
        bk9 = new Book(9,"009","NINE","NINE","B", Book.BStat.Active, Book.BCategory.Entertainment,"","",null,null);
        bk10 = new Book(10,"010","TEN","Sek","B", Book.BStat.Active, Book.BCategory.Entertainment,"","",null,null);
        bk11 = new Book(11,"011","ONE ONE","Bank","C", Book.BStat.Active, Book.BCategory.Documentary,"","",null,null);
        bk12 = new Book(12,"012","ONE TWO","Wisoot","C", Book.BStat.Active, Book.BCategory.Documentary,"","",null,null);
        bk13 = new Book(13,"013","ONE THREE","ONE","C", Book.BStat.Active, Book.BCategory.Documentary,"","",null,null);
        bk14 = new Book(14,"014","ONE FOUR","Wisoot","C", Book.BStat.Active, Book.BCategory.Documentary,"","",null,null);
        bk15 = new Book(15,"015","ONE FIVE","Wisit","C", Book.BStat.Active, Book.BCategory.Documentary,"","",null,null);
        bk16 = new Book(16,"016","ONE SIX","Sek","E", Book.BStat.Active, Book.BCategory.General,"","",null,null);
        bk17 = new Book(17,"017","ONE SEVEN","Wisoot","E", Book.BStat.Active, Book.BCategory.General,"","",null,null);
        bk18 = new Book(18,"018","ONE EIGHT","BEE","F", Book.BStat.Active, Book.BCategory.Documentary,"","",null,null);
        bk19 = new Book(19,"019","ONE NINE","Bank","G", Book.BStat.Active, Book.BCategory.Entertainment,"","",null,null);
        bk20 = new Book(20,"020","ONE TEN","Sek","H", Book.BStat.Active, Book.BCategory.Documentary,"","",null,null);
        BookList.add(bk1);
        BookList.add(bk2);
        BookList.add(bk3);
        BookList.add(bk4);
        BookList.add(bk5);
        BookList.add(bk6);
        BookList.add(bk7);
        BookList.add(bk8);
        BookList.add(bk9);
        BookList.add(bk10);
        BookList.add(bk11);
        BookList.add(bk12);
        BookList.add(bk13);
        BookList.add(bk14);
        BookList.add(bk15);
        BookList.add(bk16);
        BookList.add(bk17);
        BookList.add(bk18);
        BookList.add(bk19);
        BookList.add(bk20);

        cus1 = new Customer(1,"AAA");
        cus2 = new Customer(2,"BBB");
        cus3= new Customer(3,"CCC");
        CusList.add(cus1);
        CusList.add(cus2);
        CusList.add(cus3);

        emp1 = new Employee(1,"EMP1");
        emp2 = new Employee(2,"EMP2");
        emp3= new Employee(3,"EMP3");
        EmpList.add(emp1);
        EmpList.add(emp2);
        EmpList.add(emp3);

    }

    public ArrayList<Book> getBookAll(){
        return BookList;
    }
    public ArrayList<Customer> getCusAll(){
        return CusList;
    }
    public ArrayList<Employee> getEmpAll(){
        return EmpList;
    }

    public ArrayList<Book> SearchName(String BookName){
        SearchList.clear();
        for (Book data :BookList ) {
            if (!BookName.equals("") && BookName.equals(data.getBkName())){
                SearchList.add(data);
            }
        }
        return SearchList;
    }

    public ArrayList<Book> SearchCategory(Book.BCategory Category){
        SearchList.clear();
        for (Book data :BookList ) {
            if (Category != Book.BCategory.NA && Category == data.getBkCategory()){
                SearchList.add(data);
            }
        }
        return SearchList;
    }

    public ArrayList<Book> SearchCode(String Code){
        SearchList.clear();
        for (Book data :BookList ) {
            if (!Code.equals("")  && Code.equals(data.getBkCode())) {
                SearchList.add(data);
            }
        }
        return SearchList;
    }

    public ArrayList<Book> SearchShelf(String Shelf){
        SearchList.clear();
        for (Book data :BookList ) {
            if (!Shelf.equals("") && Shelf.equals(data.getBkShelf())) {
                SearchList.add(data);
            }
        }
        return SearchList;
    }

    public ArrayList<Book> SearchAuthor(String Author){
        SearchList.clear();
        for (Book data :BookList ) {
            if (!Author.equals("") && Author.equals(data.getBkAuthor())) {
                SearchList.add(data);
            }
        }
        return SearchList;
    }

    public ArrayList<Book> SearchStat(Book.BStat Stat){
        SearchList.clear();
        for (Book data :BookList ) {
            if (Stat != Book.BStat.All && Stat == data.getBkStat()) {
                SearchList.add(data);
            }
        }
        return SearchList;
    }

    public ArrayList<Book> getPending(){
        SearchList.clear();
        for (Book data :BookList ) {
            if (Book.BStat.Pending == data.getBkStat()) {
                SearchList.add(data);
            }
        }
        return SearchList;
    }


    public ArrayList<Book> getSearchList() {
        return SearchList;
    }

    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }

    // pad with " " to the left to the given length (n)
    public static String padLeft(String s, int n) {
            return String.format("%1$" + n + "s", s);

    }

    public void ShowBookLis(ArrayList<Book> list){
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("มีหนังสือ" + list.size() + " เล่ม");
        System.out.print(padRight("รหัส",10));
        System.out.print(padRight("ชื่อหนังสือ",16));
        System.out.print(padRight("ชั้นวาง",17));
        System.out.print(padRight("ผู้แต่ง",35));
        System.out.print(padRight("สถานะ",10));
        System.out.print(padRight("ผู้ยืม",13));
        System.out.print(padRight("ผู้อนมัติยืม",20));
        System.out.print(padRight("วันที่ยืม",20));
        System.out.print(padRight("วันที่คืน",20));
        System.out.println();
        System.out.println("============================================================================================================================");
        for (Book data : list) {
            System.out.print(padRight(data.getBkCode(),10));
            System.out.print(padRight(data.getBkName(),10));
            System.out.print(padRight(data.getBkShelf(),10));
            System.out.print(padRight(data.getBkAuthor(),30));
            System.out.print(padRight(data.getBkStat().toString(),10));
            System.out.print(padRight(data.getBkBorrower(),10));
            System.out.print(padRight(data.getBkLibrarian(),10));
            if (data.getBkBorrowedDate() != null){
                String sDate = DATE_FORMAT.format(data.getBkBorrowedDate());
                System.out.print(padRight(sDate,20));
            }else { System.out.print(padRight("",20));  }

            if (data.getBkRetrunDate() != null){
                String sDate = DATE_FORMAT.format(data.getBkRetrunDate());
                System.out.print(padRight(sDate,20));
            }else { System.out.print(padRight("",20));  }
            System.out.println();
        }
        System.out.println("============================================================================================================================");
        System.out.println();
    }

    public void lendBookLis(ArrayList<Book> list, Customer cus,Date BorrowedDate){
        for (Book data : list) {
            data.lendBook(cus,BorrowedDate);
        }
    }

    public void ApproveBookLis(ArrayList<Book> list, Employee emp){
        for (Book data : list) {
            data.Approve(emp);
        }
    }

    public void returnBookLis(ArrayList<Book> list, Date returnDate){
        for (Book data : list) {
            data.returnBook(returnDate);
        }
    }

}
