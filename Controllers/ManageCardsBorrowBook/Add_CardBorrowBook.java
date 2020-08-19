package Controllers.ManageCardsBorrowBook;

import java.util.ArrayList;

import Controllers.Files.Write_File;
import Controllers.Utils.Inputs;
import Models.CardsBorrowBook;
import Shareds.Constans;
import Shareds.Utils;

public class Add_CardBorrowBook {
    public static void AddCard() {
        ArrayList<CardsBorrowBook> arr_card = new ArrayList<CardsBorrowBook>();
        System.out.println("===== Tạo mới thẻ mượn sách trong ngày =====");
        System.out.println("");

        Constans.is_continue_addcard_borrowbook = true;
        while (Constans.is_continue_addcard_borrowbook) {
            try {
                arr_card.add(Inputs.InputCardBorrowBook());
                Write_File.WriteCardBorrowBookFile(arr_card);
                System.out.println("");
                System.out.println("Thêm mới thành công!!!");
                Constans.is_wrong_type = true;
                while (Constans.is_wrong_type) {
                    System.out.println(Constans.ques_continue);
                    String choice = Utils.ChooseInput();
                    switch (choice) {
                        case "Y":
                        case "y":
                            Constans.is_continue_addcard_borrowbook = true;
                            Constans.is_wrong_type = false;
                            break;
                        case "N":
                        case "n":

                            Constans.is_continue_addcard_borrowbook = false;
                            Constans.is_wrong_type = false;
                            break;
                        default:
                            System.out.println(Constans.input_Err);
                            break;
                    }
                }

            } catch (Exception ex) {
                System.out.println(" Lỗi tại class Add_BookBorrow :" + Constans.err_note + ex.toString());
            }

        }

    }
}