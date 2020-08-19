package Controllers.Utils;

import Controllers.ManageBook.Add_Book;
import Controllers.ManageBook.Show_Book;
import Controllers.ManageBook.Update_Book;
import Controllers.ManageCardsBorrowBook.Add_CardBorrowBook;
import Controllers.ManageCardsBorrowBook.Pay_BookBorrow;
import Controllers.ManageCardsBorrowBook.Show_CardBorrowBook_Date;
import Controllers.ManageCardsBorrowBook.Show_CardBorrow_User;
import Controllers.ManageCardsLibrary.Add_CardsLibrary;
// import Controllers.ManageCardsBorrowBook.Add_CardBorrowBook;
import Controllers.ManageCardsLibrary.Show_CardsLibrary;
import Controllers.ManageCardsLibrary.Update_CardsLibrary;
import Shareds.Constans;
import Shareds.Utils;
import Views.Main_Menu;
import Views.ManageBook_Menu;
import Views.ManageCardsBorrowBook_Menu;
import Views.ManageCardsLibrary_Menu;

public class Program_Menu {
    public static void Program_MainMenu() {
        Constans.is_continue_main_menu = true;
        while (Constans.is_continue_main_menu) {
            Main_Menu.PrintMenu();
            String choice = Utils.ChooseInput();
            switch (choice) {
                case "1":
                    Program_Menu_1();
                    break;
                case "2":
                    Program_Menu_2();
                    break;
                case "3":
                    Program_Menu_3();
                    break;
                case "0":
                    Constans.is_continue_main_menu = false;
                    break;

                default:
                    System.out.println(Constans.input_Err);
                    break;
            }

        }

    }

    public static void Program_Menu_1() {
        Constans.is_continue_menu_1 = true;
        while (Constans.is_continue_menu_1) {
            ManageBook_Menu.PrintMenu();
            String choice_1 = Utils.ChooseInput();
            switch (choice_1) {
                case "1":
                    Show_Book.ShowBook();
                    break;
                case "2":
                    Update_Book.UpdateBook();
                    break;
                case "3":
                    Add_Book.AddBook();
                    break;
                case "0":
                    Constans.is_continue_menu_1 = false;
                    break;

                default:
                    System.out.println(Constans.input_Err);
                    break;
            }
        }
    }

    public static void Program_Menu_2() {
        Constans.is_continue_menu_2 = true;
        while (Constans.is_continue_menu_2) {
            ManageCardsLibrary_Menu.PrintMenu();
            String choice_2 = Utils.ChooseInput();
            switch (choice_2) {
                case "1":
                    Show_CardsLibrary.ShowCard();
                    break;
                case "2":
                    Update_CardsLibrary.UpdateCard();
                    break;
                case "3":
                    Add_CardsLibrary.AddCard();
                    break;
                case "0":
                    Constans.is_continue_menu_2 = false;
                    break;
                default:
                    System.out.println(Constans.input_Err);
                    break;
            }
        }
    }

    public static void Program_Menu_3() {
        Constans.is_continue_menu_3 = true;
        while (Constans.is_continue_menu_3) {
            ManageCardsBorrowBook_Menu.PrintMenu();
            String choice_3 = Utils.ChooseInput();
            switch (choice_3) {
                case "1":
                    Add_CardBorrowBook.AddCard();
                    break;
                case "2":
                    Pay_BookBorrow.PayBook();
                    break;
                case "3":
                    Show_CardBorrowBook_Date.ShowCard();
                    break;
                case "4":
                    Show_CardBorrow_User.ShowCard();
                    break;
                case "0":
                    Constans.is_continue_menu_3 = false;
                    break;
                default:
                    System.out.println(Constans.input_Err);
                    break;
            }
        }
    }
}