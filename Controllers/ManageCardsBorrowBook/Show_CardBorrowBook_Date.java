package Controllers.ManageCardsBorrowBook;

import java.util.ArrayList;

import Controllers.Files.Read_File;
import Controllers.Utils.Checks;
import Controllers.Utils.Shows;
import Models.CardsBorrowBook;
import Shareds.Constans;
import Shareds.Utils;

public class Show_CardBorrowBook_Date {
    private static String str_inputday;
    public static void ShowCard() {
        ArrayList<CardsBorrowBook> arr_card = new ArrayList<CardsBorrowBook>();
        
        System.out.println("========================== Thẻ mượn sách trong ngày ============================");
        System.out.println("");
        Constans.is_wrong_type = true;
        while (Constans.is_wrong_type) {
            System.out.println("-- Lưu ý : Nhập theo định dạng : dd/mm/yyyy ");
            System.out.print("- Nhập ngày : ");
            str_inputday = Utils.ChooseInput();
            try {
                int n = Checks.CheckInputDayBorrowBook(str_inputday);
                if (n == 0) {
                    Constans.is_wrong_type = false;
                } else {
                    System.out.println("Ngày mượn sách không đúng.Vui lòng nhập lại!!!");
                }
            } catch (Exception ex) {
                System.out.println(" Lỗi Show_CardBorrowBook : " + Constans.err_note + ex.toString());
            }

        }

        System.out.println("");

        System.out.println("=================================================================================");
        System.out.println("");
        System.out.println("Mã thẻ   | Mã thẻ thư viện  | Giờ tạo   | Giờ trả   | Tên sách                   ");
        System.out.println("");
        System.out.println("=================================================================================");
        try {
            arr_card.addAll(Checks.CheckDay_AndGetObjCardBorrowBook(str_inputday));
            for (CardsBorrowBook card : arr_card) {
                Shows.ShowListCardBorrowBook(card);
            }
        } catch (Exception ex) {
            System.out.println(" Lỗi Show_CardBorrowBook : " + Constans.err_note + ex.toString());
        }
        System.out.println("=================================================================================");

    }
}