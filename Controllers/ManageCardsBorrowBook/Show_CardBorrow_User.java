package Controllers.ManageCardsBorrowBook;

import java.util.ArrayList;

import Controllers.Utils.Checks;
import Controllers.Utils.Shows;
import Models.CardsBorrowBook;
import Shareds.Constans;
import Shareds.Utils;

public class Show_CardBorrow_User {
    public static void ShowCard() {
        ArrayList<CardsBorrowBook> arr_card = new ArrayList<CardsBorrowBook>();
        System.out.println("===================== Thẻ mượn sách của bạn đọc =====================");

        try {
            Constans.is_wrong_type = true;
            while (Constans.is_wrong_type) {
                System.out.print("- Nhập mã thẻ thư viện : ");
                String str_inputid = Utils.ChooseInput();
                System.out.print("- Nhập tên người mượn  : ");
                String str_inputname = Utils.ChooseInput();
                int n = Checks.CheckInputIDAndNameCardLibraryOnBorrow(str_inputid, str_inputname);
                if (n == 0) {
                    arr_card.addAll(Checks.CheckIDAndUser_AndGetObjCardBorrowBook(str_inputid, str_inputname));
                    Constans.is_wrong_type = false;

                } else {
                    System.out.println("Mã thẻ thư viện hoặc tên người mượn không tồn tại.Vui lòng nhập lại!!!");
                }
            }
        } catch (Exception ex) {
            System.out.println(" Lỗi Show_CardBorrowBook_User : " + Constans.err_note + ex.toString());
        }
        System.out.println("=====================================================================");
        System.out.println("");
        System.out.println("Giờ mượn     | Giờ trả     |  Tên sách                               ");
        System.out.println("");
        System.out.println("=====================================================================");
        System.err.println("");
        for (CardsBorrowBook card : arr_card) {
            Shows.ShowListCardBorrowUser(card);
        }
        System.out.println("");
        System.out.println("=====================================================================");

    }
}