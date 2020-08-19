package Controllers.Utils;

import java.io.IOException;
import java.util.ArrayList;

import Controllers.Files.Read_File;
import Models.Book;
import Models.CardsBorrowBook;
import Models.CardsLibrary;
import Shareds.Constans;

public class Checks {
    public static int CheckInputIDBook(String str_check) throws IOException {
        ArrayList<Book> arr_book = new ArrayList<Book>();
        try {
            arr_book.addAll(Read_File.ReadFileBook());
            for (Book book : arr_book) {
                if (book.getIDBook().equals(str_check)) {
                    return 0;
                }
            }

        } catch (

        Exception ex) {
            System.out.println("Lỗi tại CheckInputIDBook tại class Checks  : " + Constans.err_note + ex.toString());
        }
        return 1;
    }

    public static ArrayList<Book> CheckIDUpdateBook(String str_check) throws IOException {
        ArrayList<Book> arr_book = new ArrayList<Book>();
        ArrayList<Book> new_arrbook = new ArrayList<Book>();
        try {
            arr_book.addAll(Read_File.ReadFileBook());
            for (Book book : arr_book) {
                if (book.getIDBook().equals(str_check)) {

                } else {
                    new_arrbook.add(book);
                }

            }

        } catch (Exception ex) {
            System.out.println("Lỗi tại CheckIDUpdateBook tại class Checks  : " + Constans.err_note + ex.toString());
        }
        return new_arrbook;
    }

    public static int CheckInputIDAndNameBook(String str_namecheck, String str_idcheck) throws IOException {
        ArrayList<Book> arr_book = new ArrayList<Book>();
        try {
            arr_book.addAll(Read_File.ReadFileBook());
            for (Book book : arr_book) {
                if (book.getNameBook().equals(str_namecheck) && book.getIDBook().equals(str_idcheck)) {
                    return 0;
                }
            }

        } catch (

        Exception ex) {
            System.out.println("Lỗi tại CheckInputIDBook tại class Checks  : " + Constans.err_note + ex.toString());
        }
        return 1;
    }

    public static int CheckInputIDCardLisbrary(String str_check) throws IOException {
        ArrayList<CardsLibrary> arr_card = new ArrayList<CardsLibrary>();
        try {
            arr_card.addAll(Read_File.ReadFileCardLibrary());
            for (CardsLibrary card : arr_card) {
                if (card.getIDCard().equals(str_check)) {
                    return 0;
                }
            }

        } catch (

        Exception ex) {
            System.out.println(
                    "Lỗi tại CheckInputIDCardLibrary tại class Checks  : " + Constans.err_note + ex.toString());
        }
        return 1;
    }

    public static ArrayList<CardsLibrary> CheckIDUpdateCardLibrary(String str_check) throws IOException {
        ArrayList<CardsLibrary> arr_card = new ArrayList<CardsLibrary>();
        ArrayList<CardsLibrary> new_arrcard = new ArrayList<CardsLibrary>();
        try {
            arr_card.addAll(Read_File.ReadFileCardLibrary());
            for (CardsLibrary card : arr_card) {
                if (card.getIDCard().equals(str_check)) {

                } else {
                    new_arrcard.add(card);
                }

            }

        } catch (Exception ex) {
            System.out.println("Lỗi tại CheckIDUpdateBook tại class Checks  : " + Constans.err_note + ex.toString());
        }
        return new_arrcard;
    }

    public static int CheckInputIDBorrowBook(String str_check) throws IOException {
        ArrayList<CardsBorrowBook> arr_card = new ArrayList<CardsBorrowBook>();
        try {
            arr_card.addAll(Read_File.ReadFileCardBorrowBook());
            for (CardsBorrowBook card : arr_card) {
                if (card.getIDCardBorrow().equals(str_check)) {
                    return 0;
                }
            }

        } catch (Exception ex) {
            System.out.println("Lỗi tại CheckIDUpdateBook tại class Checks  : " + Constans.err_note + ex.toString());
        }
        return 1;
    }

    public static ArrayList<Book> Check_AndGetObjBook(String str_namecheck, String str_idcheck) throws IOException {
        ArrayList<Book> arr_book = new ArrayList<Book>();
        ArrayList<Book> new_arrbook = new ArrayList<Book>();
        try {
            arr_book.addAll(Read_File.ReadFileBook());
            for (Book book : arr_book) {
                if (book.getNameBook().equals(str_namecheck) && book.getIDBook().equals(str_idcheck)) {
                    new_arrbook.add(book);
                }

            }

        } catch (Exception ex) {
            System.out.println("Lỗi tại Check_AndGetObjBook tại class Checks  : " + Constans.err_note + ex.toString());
        }
        return new_arrbook;
    }

    public static ArrayList<CardsLibrary> Check_AndGetObjCardLibrary(String str_check) throws IOException {
        ArrayList<CardsLibrary> arr_card = new ArrayList<CardsLibrary>();
        ArrayList<CardsLibrary> new_arrcard = new ArrayList<CardsLibrary>();
        try {
            arr_card.addAll(Read_File.ReadFileCardLibrary());
            for (CardsLibrary card : arr_card) {
                if (card.getIDCard().equals(str_check)) {
                    new_arrcard.add(card);
                }

            }

        } catch (Exception ex) {
            System.out.println("Lỗi tại CheckIDUpdateBook tại class Checks  : " + Constans.err_note + ex.toString());
        }
        return new_arrcard;
    }

    public static ArrayList<CardsBorrowBook> Check_AndGetObjCardBorrowBook(String str_check) throws IOException {
        ArrayList<CardsBorrowBook> arr_card = new ArrayList<CardsBorrowBook>();
        ArrayList<CardsBorrowBook> new_arrcard = new ArrayList<CardsBorrowBook>();
        try {
            arr_card.addAll(Read_File.ReadFileCardBorrowBook());
            for (CardsBorrowBook card : arr_card) {
                if (card.getIDCardBorrow().equals(str_check)) {
                    new_arrcard.add(card);
                }

            }

        } catch (Exception ex) {
            System.out.println("Lỗi tại  Check_AndGetObjCardBorrowBook  : " + Constans.err_note + ex.toString());
        }
        return new_arrcard;
    }
    public static ArrayList<CardsBorrowBook> Check_AndGetObjCardBorrowBook_Flush(String str_check) throws IOException {
        ArrayList<CardsBorrowBook> arr_card = new ArrayList<CardsBorrowBook>();
        ArrayList<CardsBorrowBook> new_arrcard = new ArrayList<CardsBorrowBook>();
        try {
            arr_card.addAll(Read_File.ReadFileCardBorrowBook());
            for (CardsBorrowBook card : arr_card) {
                if (card.getIDCardBorrow().equals(str_check)) {
                    
                }
                else{
                    new_arrcard.add(card);
                }

            }

        } catch (Exception ex) {
            System.out.println("Lỗi tại  Check_AndGetObjCardBorrowBook  : " + Constans.err_note + ex.toString());
        }
        return new_arrcard;
    }

    public static int CheckInputDayBorrowBook(String str_check) throws IOException {
        ArrayList<CardsBorrowBook> arr_card = new ArrayList<CardsBorrowBook>();
        try {
            arr_card.addAll(Read_File.ReadFileCardBorrowBook());
            for (CardsBorrowBook card : arr_card) {
                if (card.getDateCreateBorrow().equals(str_check)) {
                    return 0;
                }
            }

        } catch (Exception ex) {
            System.out.println("Lỗi tại CheckIDUpdateBook tại class Checks  : " + Constans.err_note + ex.toString());
        }
        return 1;
    }

    public static ArrayList<CardsBorrowBook> CheckDay_AndGetObjCardBorrowBook(String str_check) throws IOException {
        ArrayList<CardsBorrowBook> arr_card = new ArrayList<CardsBorrowBook>();
        ArrayList<CardsBorrowBook> new_arrcard = new ArrayList<CardsBorrowBook>();
        try {
            arr_card.addAll(Read_File.ReadFileCardBorrowBook());
            for (CardsBorrowBook card : arr_card) {
                if (card.getDateCreateBorrow().equals(str_check)) {
                    new_arrcard.add(card);
                }

            }

        } catch (Exception ex) {
            System.out.println("Lỗi tại  Check_AndGetObjCardBorrowBook  : " + Constans.err_note + ex.toString());
        }
        return new_arrcard;
    }

    public static ArrayList<CardsBorrowBook> CheckIDAndUser_AndGetObjCardBorrowBook(String str_idcheck,
            String str_namecheck) throws IOException {
        ArrayList<CardsBorrowBook> arr_card = new ArrayList<CardsBorrowBook>();
        ArrayList<CardsBorrowBook> new_arrcard = new ArrayList<CardsBorrowBook>();
        try {
            arr_card.addAll(Read_File.ReadFileCardBorrowBook());
            for (CardsBorrowBook card : arr_card) {
                if (card.getIDCardLibarary().equals(str_idcheck)
                        && card.getNameUserCardBorrow().equals(str_namecheck)) {
                    new_arrcard.add(card);
                }

            }

        } catch (Exception ex) {
            System.out.println("Lỗi tại  Check_AndGetObjCardBorrowBook  : " + Constans.err_note + ex.toString());
        }
        return new_arrcard;
    }

    public static int CheckInputIDAndNameCardLibraryOnBorrow(String str_idcheck, String str_namecheck)
            throws IOException {
        ArrayList<CardsBorrowBook> arr_card = new ArrayList<CardsBorrowBook>();
        try {
            arr_card.addAll(Read_File.ReadFileCardBorrowBook());
            for (CardsBorrowBook card : arr_card) {
                if (card.getIDCardLibarary().equals(str_idcheck)
                        && card.getNameUserCardBorrow().equals(str_namecheck)) {
                    return 0;
                }
            }

        } catch (

        Exception ex) {
            System.out.println("Lỗi tại CheckInputIDBook tại class Checks  : " + Constans.err_note + ex.toString());
        }
        return 1;
    }

}