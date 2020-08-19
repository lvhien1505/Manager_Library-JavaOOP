package Controllers.ManageBook;

import java.util.ArrayList;

import Controllers.Files.Write_File;
import Controllers.Utils.Inputs;
import Models.Book;
import Shareds.Constans;
import Shareds.Utils;

public class Add_Book {
    public static void AddBook() {
        ArrayList<Book> arr_book=new ArrayList<Book>();

        System.out.println("========= Thêm mới một quyển sách =========");
        System.out.println("");
        Constans.is_continue_addbook = true;
        while (Constans.is_continue_addbook) {
            try {
                
                arr_book.add(Inputs.InputBook());
                Write_File.WriteBookFile(arr_book);
                System.out.println("");
                System.out.println("Thêm mới thành công!!!");
                Constans.is_wrong_type = true;
                while (Constans.is_wrong_type) {
                    System.out.print(Constans.ques_continue);
                    String choice = Utils.ChooseInput();
                    switch (choice) {
                        case "Y":
                        case "y":
                            Constans.is_continue_addbook = true;
                            Constans.is_wrong_type = false;
                            break;
                        case "N":
                        case "n":

                            Constans.is_continue_addbook = false;
                            Constans.is_wrong_type = false;
                            break;
                        default:
                            System.out.println(Constans.input_Err);
                            break;
                    }
                }

            } catch (Exception ex) {
                System.out.println(" Lỗi tại class Add_Book :" + Constans.err_note + ex.toString());
            }

        }

    }
}