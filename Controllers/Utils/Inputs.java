package Controllers.Utils;

import java.util.ArrayList;

import Models.Book;
import Models.CardsBorrowBook;
import Models.CardsLibrary;
import Shareds.Constans;
import Shareds.Utils;

public class Inputs {
    public static Book InputBook() {
        Book new_book = new Book();
        Constans.is_wrong_type = true;

        while (Constans.is_wrong_type) {
            System.out.print("- Nhập mã sách     : ");
            new_book.setID(Utils.ChooseInput());
            try {
                int n = Checks.CheckInputIDBook(new_book.getIDBook());
                if (n == 1) {
                    Constans.is_wrong_type = false;
                } else {
                    System.out.println(Constans.err_id_input_exist);
                }
            } catch (Exception ex) {
                System.out.println("Lỗi tại InputBook  : " + Constans.err_note + ex.toString());
            }

        }

        System.out.print("- Nhập tên sách    : ");
        new_book.setNameBook(Utils.ChooseInput());
        System.out.print("- Nhập tên tác giả : ");
        new_book.setAuthorBook(Utils.ChooseInput());
        System.out.print("- Nhập số lượng    : ");
        new_book.setAmountBook(Integer.parseInt(Utils.ChooseInput()));
        System.out.print("- Nhập danh mục    : ");
        new_book.setCategoryBook(Utils.ChooseInput());
        return new_book;
    }

    public static CardsLibrary InputCardLibrary() {
        CardsLibrary new_card = new CardsLibrary();
        Constans.is_wrong_type = true;
        while (Constans.is_wrong_type) {
            System.out.print("- Nhập mã thẻ       : ");
            new_card.setID(Utils.ChooseInput());
            try {
                int n = Checks.CheckInputIDCardLisbrary(new_card.getIDCard());
                if (n == 1) {
                    Constans.is_wrong_type = false;
                } else {
                    System.out.println(Constans.err_id_input_exist);
                }
            } catch (Exception ex) {
                System.out.println("Lỗi tại InputCard  : " + Constans.err_note + ex.toString());
            }
        }
        System.out.print("- Nhập tên chủ thẻ  : ");
        new_card.setNameUserCard(Utils.ChooseInput());
        System.out.print("- Nhập số CMND      : ");
        new_card.setCMND(Integer.parseInt(Utils.ChooseInput()));
        new_card.setDateCreate(Convert_Date.DateToString());
        return new_card;
    }

    public static CardsBorrowBook InputCardBorrowBook() {
        CardsBorrowBook new_cardborrow = new CardsBorrowBook();
        ArrayList<Book> get_book = new ArrayList<Book>();
        ArrayList<CardsLibrary> get_cardlibrary = new ArrayList<CardsLibrary>();
        Constans.is_wrong_type = true;
        while (Constans.is_wrong_type) {
            System.out.print("- Nhập mã thẻ : ");
            String str_idborrowbook = Utils.ChooseInput();
            try {
                int n = Checks.CheckInputIDBorrowBook(str_idborrowbook);
                if (n == 1) {
                    new_cardborrow.setIDCardBorrow(str_idborrowbook);
                    Constans.is_wrong_type = false;
                } else {
                    System.out.println(Constans.err_id_input_exist);
                }
            } catch (Exception ex) {
                System.out.println("Lỗi tại InputCardBorrow 1  : " + Constans.err_note + ex.toString());
            }
        }

        Constans.is_wrong_type = true;
        while (Constans.is_wrong_type) {
            System.out.print("- Nhập mã thẻ thư viện : ");
            String str_idcardlibrary = Utils.ChooseInput();
            try {
                int n = Checks.CheckInputIDCardLisbrary(str_idcardlibrary);

                if (n == 0) {
                    get_cardlibrary.addAll(Checks.Check_AndGetObjCardLibrary(str_idcardlibrary));
                    for (CardsLibrary card : get_cardlibrary) {
                        new_cardborrow.setIDCardLibrary(card.getIDCard());
                        new_cardborrow.setNameUserCardBorrow(card.getNameUserCard());
                    }
                    Constans.is_wrong_type = false;
                } else {
                    System.out.println(Constans.err_id_input);
                }

            } catch (Exception ex) {
                System.out.println("Lỗi tại InputCardBorrow 2: " + Constans.err_note + ex.toString());
            }

        }
        Constans.is_wrong_type = true;
        while (Constans.is_wrong_type) {

            System.out.print("- Nhập tên sách mượn : ");
            String str_namebookborrow = Utils.ChooseInput();
            System.out.print("- Nhập mã sách       : ");
            String str_idbookborrow = Utils.ChooseInput();
            try {
                int n = Checks.CheckInputIDAndNameBook(str_namebookborrow, str_idbookborrow);
                if (n == 0) {
                    get_book.addAll(Checks.Check_AndGetObjBook(str_namebookborrow, str_idbookborrow));
                    for (Book book : get_book) {
                        new_cardborrow.setNameBookBorrow(book.getNameBook());
                        new_cardborrow.setIDBookBorrow(book.getIDBook());
                    }
                    Constans.is_wrong_type = false;
                } else {
                    System.out.println("Tên sách hoặc mã thẻ thư viện không tồn tại.Vui lòng nhập lại");
                }
            } catch (Exception ex) {
                System.out.println("Lỗi tại InputCardBorrowBook : " + Constans.err_note + ex.toString());
            }

        }

        new_cardborrow.setDateCreateBorrow(Convert_Date.DateToString());
        new_cardborrow.setHourBorrow(Convert_Date.HourToString());
        new_cardborrow.setHourPay("");

        return new_cardborrow;
    }
}