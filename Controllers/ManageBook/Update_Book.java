package Controllers.ManageBook;

import java.util.ArrayList;
import Controllers.Files.Write_File;
import Controllers.Utils.Checks;
import Models.Book;
import Shareds.Constans;
import Shareds.Utils;

public class Update_Book {
    public static void UpdateBook() {
        ArrayList<Book> arr_book = new ArrayList<Book>();
        Book new_book = new Book();
        System.out.println("========= Cập nhật thông tin sách =========");
        System.out.println("");
        Constans.is_continue_updatebook = true;
        while (Constans.is_continue_updatebook) {
            Constans.is_wrong_type = true;
            while (Constans.is_wrong_type) {
                System.out.print("- Nhập mã sách    : ");
                String str_id = Utils.ChooseInput();
                try {
                    int n = Checks.CheckInputIDBook(str_id);
                    if (n == 0) {
                        arr_book.addAll(Checks.CheckIDUpdateBook(str_id));
                        new_book.setID(str_id);
                        Constans.is_wrong_type = false;
                    } else {
                        System.out.println(Constans.err_id_input);
                    }

                } catch (Exception ex) {
                    System.out.println("Lỗi tại class Update_Book :" + Constans.err_note + ex.toString());
                }
            }

            System.out.print("- Sửa tên sách    : ");
            new_book.setNameBook(Utils.ChooseInput());
            System.out.print("- Sửa tên tác giả : ");
            new_book.setAuthorBook(Utils.ChooseInput());
            System.out.print("- Sửa số lượng    : ");
            new_book.setAmountBook(Integer.parseInt(Utils.ChooseInput()));
            System.out.print("- Sửa danh mục    : ");
            new_book.setCategoryBook(Utils.ChooseInput());
            arr_book.add(new_book);
            Constans.is_wrong_type = true;
            while (Constans.is_wrong_type) {
                System.out.print(Constans.ques_continue_update);
                String choice = Utils.ChooseInput();
                switch (choice) {
                    case "Y":
                    case "y":
                        try {
                            Write_File.WriteBookFile(arr_book);
                        } catch (Exception ex) {
                            System.out.println("Lỗi tại class Update_Book :" + Constans.err_note + ex.toString());
                        }
                        System.out.println("");
                        System.out.println(Constans.success_update);
                        Constans.is_wrong_type = false;
                        break;
                    case "N":
                    case "n":
                        Constans.is_wrong_type = false;
                        break;
                    default:
                        System.out.println(Constans.input_Err);
                        Constans.is_wrong_type = true;
                        break;
                }
            }
            Constans.is_wrong_type = true;
            while (Constans.is_wrong_type) {
                System.out.print(Constans.ques_continue);
                String choice = Utils.ChooseInput();
                switch (choice) {
                    case "Y":
                    case "y":
                        Constans.is_continue_updatebook = true;
                        Constans.is_wrong_type = false;
                        break;
                    case "N":
                    case "n":
                        Constans.is_continue_updatebook = false;
                        Constans.is_wrong_type = false;
                        break;
                    default:
                        System.out.println(Constans.input_Err);
                        break;
                }
            }

        }
    }

}