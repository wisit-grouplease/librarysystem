import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataLibrary dataList = new DataLibrary();
        ArrayList<String> menuSelect = new ArrayList<String>();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        Boolean isExit = Boolean.TRUE;
        String useMenu;

        while (isExit){
            switch (menuSelect.size()) {
                case 0:
                        System.out.println();
                        System.out.println("================");
                        System.out.println("1.บรรณารักษ์");
                        System.out.println("2.สมาชิก");
                        System.out.println("0.Exit");
                        System.out.print("Enter Menu :");
                        useMenu = myObj.nextLine();
                        if (useMenu.equals("1")||useMenu.equals("2")||useMenu.equals("0")) {
                            menuSelect.add(useMenu);
                        }else{
                            System.out.println("ไม่่มีเมนูที่คุณเลือก");
                        }
                    break;
                case 1:
                    if (menuSelect.get(0).equals("1")){
                        System.out.println();
                        System.out.println("================");
                        System.out.println("1.ค้นหา");
                        System.out.println("2.อนุมัติ");
                        System.out.println("3.คืน");
                        System.out.println("0.กลับเมนูหลัก");
                        System.out.print("Enter Menu :");
                        useMenu = myObj.nextLine();
                        if (useMenu.equals("1")||useMenu.equals("2")||useMenu.equals("3")||useMenu.equals("0")) {
                            menuSelect.add(useMenu);
                        }else{
                            System.out.println("ไม่่มีเมนูที่คุณเลือก");
                        }
                    }else if (menuSelect.get(0).equals("2")){
                        System.out.println();
                        System.out.println("================");
                        System.out.println("1.ค้นหาจากชื่อ");
                        System.out.println("2.ค้นหาจากผู้แต่ง");
                        System.out.println("3.ค้นหาจากชั้นวาง");
                        System.out.println("4.ทั้งหมด");
                        System.out.println("0.กลับเมนูหลัก");
                        System.out.print("Enter Menu :");
                        useMenu = myObj.nextLine();
                        if (useMenu.equals("1")||useMenu.equals("2")||useMenu.equals("3")||useMenu.equals("4")||useMenu.equals("0")) {
                            menuSelect.add(useMenu);
                        }else{
                            System.out.println("ไม่่มีเมนูที่คุณเลือก");
                        }
                    }else { isExit = Boolean.FALSE; }
                    break;
                case 2:
                    if (menuSelect.get(0).equals("1")){ //บรรณรักษ์
                        if (menuSelect.get(1).equals("0")){
                            menuSelect.clear();
                        }else if (menuSelect.get(1).equals("1")){
                            //ค้นหา ของบรรณรักษ์
                            System.out.println();
                            System.out.println("================");
                            System.out.println("1.ค้นหาจากชื่อ");
                            System.out.println("2.ค้นหาจากผู้แต่ง");
                            System.out.println("3.ค้นหาจากชั้นวาง");
                            System.out.println("4.ทั้งหมด");
                            System.out.println("0.กลับเมนูหลัก");
                            System.out.print("Enter Menu :");
                            useMenu = myObj.nextLine();
                            if (useMenu.equals("1")||useMenu.equals("2")||useMenu.equals("3")||useMenu.equals("4")||useMenu.equals("0")) {
                                menuSelect.add(useMenu);
                            }else{
                                System.out.println("ไม่่มีเมนูที่คุณเลือก");
                            }
                        }else if (menuSelect.get(1).equals("2")){
                            dataList.getPending();
                            dataList.ShowBookLis(dataList.getSearchList());
                            System.out.println();
                            System.out.println("================");
                            System.out.println("1.อนุมัติทั้งหมด");
                            System.out.println("0.กลับเมนูหลัก");
                            useMenu = myObj.nextLine();
                            if (useMenu.equals("1")) {
                                dataList.ApproveBookLis(dataList.getPending(),dataList.getEmpAll().get(0));
                                menuSelect.remove(1);
                            }else{
                                menuSelect.remove(1);
                            }
                        }else if (menuSelect.get(1).equals("3")) {
                            System.out.println();
                            dataList.ShowBookLis(dataList.SearchStat(Book.BStat.Borrowed));
                            if (dataList.getSearchList().size() > 0) {
                                System.out.println("1.รับคืนรายการค้นหาทั้งหมด");
                            }
                            System.out.println("0.ลับเมนูก่อนหน้าใส่ ฺ");
                            System.out.println("ใส่คำที่ต้องการค้นหา : ");
                            useMenu = myObj.nextLine();
                            if (useMenu.equals("1")) {
                                Date nowDate = new Date();
                                dataList.returnBookLis(dataList.getSearchList(), nowDate);
                                menuSelect.remove(1);
                            }else {
                                menuSelect.remove(1);
                            }

                        }
                    }else if (menuSelect.get(0).equals("2")) { //สมาชิก
                        if (menuSelect.get(1).equals("0")) {
                            menuSelect.clear();
                        } else if (menuSelect.get(1).equals("1") || menuSelect.get(1).equals("2") || menuSelect.get(1).equals("3")) {
                            System.out.println();
                            System.out.println("================");
                            if (menuSelect.get(1).equals("1")) {
                                System.out.println("ค้นหาจากชื่อ");
                            } else if (menuSelect.get(1).equals("2")) {
                                System.out.println("ค้นหาจากผู้แต่ง");
                            } else if (menuSelect.get(1).equals("3")) {
                                System.out.println("ค้นหาจากชั้นวาง");
                            }

                            if (dataList.getSearchList().size() > 0) {
                                System.out.println("1.ยืมรายการค้นหาทั้งหมด");
                            }

                            System.out.println("0.ลับเมนูก่อนหน้าใส่ ฺ");
                            System.out.println("ใส่คำที่ต้องการค้นหา : ");
                            useMenu = myObj.nextLine();
                            if (useMenu.equals("0")) {
                                menuSelect.remove(1);
                            } else if (useMenu.equals("1")) {
                                Date nowDate = new Date();
                                dataList.lendBookLis(dataList.getSearchList(), dataList.getCusAll().get(0), nowDate);
                                dataList.ShowBookLis(dataList.getSearchList());
                            } else {
                                if (menuSelect.get(1).equals("1")) {
                                    dataList.SearchName(useMenu);
                                } else if (menuSelect.get(1).equals("2")) {
                                    dataList.SearchAuthor(useMenu);
                                } else if (menuSelect.get(1).equals("3")) {
                                    dataList.SearchShelf(useMenu);
                                }
                                dataList.ShowBookLis(dataList.getSearchList());
                            }
                        }else if (menuSelect.get(1).equals("4")) {
                            System.out.println();
                            dataList.ShowBookLis(dataList.getBookAll());
                            menuSelect.remove(1);
                        } else {
                            menuSelect.clear();
                        }
                    }
                    else { menuSelect.clear();  }
                    break;
                case 3:
                    if (menuSelect.get(0).equals("1")){
                        if (menuSelect.get(1).equals("1")){
                            if (menuSelect.get(2).equals("1")||menuSelect.get(2).equals("2")||menuSelect.get(2).equals("3")){
                                System.out.println();
                                System.out.println("================");
                                if (menuSelect.get(2).equals("1")){    System.out.println("ค้นหาจากชื่อ");       }
                                else if (menuSelect.get(2).equals("2")){    System.out.println("ค้นหาจากผู้แต่ง");       }
                                else if (menuSelect.get(2).equals("3")){    System.out.println("ค้นหาจากชั้นวาง");       }
                                System.out.println("0.กลับเมนูก่อนหน้า");
                                System.out.println("ใส่คำที่ต้องการค้นหา : ");
                                useMenu = myObj.nextLine();
                                if (useMenu.equals("0")){
                                    menuSelect.remove(2);
                                }else{
                                    if (menuSelect.get(2).equals("1")){   dataList.SearchName(useMenu);       }
                                    else if (menuSelect.get(2).equals("2")){    dataList.SearchAuthor(useMenu);          }
                                    else if (menuSelect.get(2).equals("3")){    dataList.SearchShelf(useMenu);          }
                                    dataList.ShowBookLis(dataList.getSearchList());
                                }

                            }else if (menuSelect.get(2).equals("4")){
                                System.out.println();
                                dataList.ShowBookLis(dataList.getBookAll());
                                menuSelect.remove(2);
                            }else {
                                menuSelect.remove(2);
                                menuSelect.remove(1);
                            }
                        }
                    }
                    break;
            }
        }
        System.out.println("Goodbye!");


    }

}
