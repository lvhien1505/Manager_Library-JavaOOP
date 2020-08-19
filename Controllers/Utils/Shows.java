package Controllers.Utils;

import Models.Book;
import Models.CardsBorrowBook;
import Models.CardsLibrary;

public class Shows {
    public static void ShowListBook(Book show_book){
        System.out.printf("%-9s", show_book.getIDBook());
        System.out.printf("%-23s",show_book.getNameBook());
        System.out.printf("%-20s",show_book.getAuthorBook());
        System.out.printf("%-11d",show_book.getAmountBook());
        System.out.printf("%-18s",show_book.getCategoryBook());
        System.out.println("");
    }
    public static void ShowListCardLibrary(CardsLibrary show_card) {
        System.out.printf("%-9s", show_card.getIDCard());
        System.out.printf("%-28s",show_card.getNameUserCard());
        System.out.printf("%-16d",show_card.getCMND());
        System.out.printf("%-28s",show_card.getDateCreate());
        System.out.println("");
    }
    public static void ShowListCardBorrowBook(CardsBorrowBook show_card){
        System.out.printf("%-10s",show_card.getIDCardBorrow());
        System.out.printf("%-19s",show_card.getIDCardLibarary());
        System.out.printf("%-12s",show_card.getHourBorrow());
        System.out.printf("%-12s",show_card.getHourPay());
        System.out.printf("%-28s",show_card.getNameBookBorrow());
        System.out.println("");
    }
    public static void ShowListCardBorrowUser(CardsBorrowBook show_card){
        System.out.printf("%-14s",show_card.getHourBorrow());
        System.out.printf("%-14s",show_card.getHourPay());
        System.out.printf("%-41s",show_card.getNameBookBorrow());
        System.out.println("");
    }
}