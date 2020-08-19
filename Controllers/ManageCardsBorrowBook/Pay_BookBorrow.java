package Controllers.ManageCardsBorrowBook;

import java.util.ArrayList;

import Controllers.Files.Write_File;
import Controllers.Utils.Checks;
import Controllers.Utils.Convert_Date;
import Models.CardsBorrowBook;
import Shareds.Constans;
import Shareds.Utils;

public class Pay_BookBorrow {
    public static void PayBook() {
        ArrayList<CardsBorrowBook> arr_card = new ArrayList<CardsBorrowBook>();
        ArrayList<CardsBorrowBook> new_arrcard = new ArrayList<CardsBorrowBook>();
        System.out.println("================== Trả sách ==================");
        Constans.is_wrong_type = true;
        while (Constans.is_wrong_type) {
            try {
                System.out.println("");
                System.out.print("- Nhập mã thẻ mượn :");
                String str_inputid = Utils.ChooseInput();
                int n = Checks.CheckInputIDBorrowBook(str_inputid);
                if (n == 0) {
                    arr_card.addAll(Checks.Check_AndGetObjCardBorrowBook(str_inputid));
                    Constans.is_wrong_type = false;
                } else {
                    System.out.println(Constans.err_id_input);
                }
                new_arrcard.addAll(Checks.Check_AndGetObjCardBorrowBook_Flush(str_inputid));
            } catch (Exception ex) {
                System.out.println("Lỗi tại Pay_BookBorrow : " + Constans.err_note + ex.toString());
            }

        }

        System.out.println("");
        System.out.println("==============================================");
        try {
            for (CardsBorrowBook card : arr_card) {
                System.out.println("Mã thẻ thư viện : " + card.getIDCardLibarary());
                System.out.println("Tên chủ thẻ     : " + card.getNameUserCardBorrow());
                System.out.println("Tên sách mượn   : " + card.getNameBookBorrow());
                card.setHourPay(Convert_Date.HourToString());
            }
            
            new_arrcard.addAll(arr_card);
            Constans.is_wrong_type = true;
            while (Constans.is_wrong_type) {
                System.out.print("Bạn có muốn trả sách ?(Y/N) : ");
                String choice = Utils.ChooseInput();
                switch (choice) {
                    case "Y":
                    case "y":
                        Write_File.WriteCardBorrowBookFile(new_arrcard);
                        Constans.is_wrong_type = false;
                        break;
                    case "N":
                    case "n":
                        Constans.is_wrong_type = false;
                        break;

                    default:
                        System.out.println(Constans.input_Err);
                        break;
                }
            }

        } catch (Exception ex) {
            System.out.println("Lỗi tại Pay_BookBorrow : " + Constans.err_note + ex.toString());
        }

    }
}