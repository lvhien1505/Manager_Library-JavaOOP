package Controllers.ManageBook;

import java.util.ArrayList;

import Controllers.Files.Read_File;
import Controllers.Utils.Shows;
import Models.Book;
import Shareds.Constans;

public class Show_Book {
    public static void ShowBook() {
        ArrayList<Book> arr_book= new ArrayList<Book>();
        System.out.println("=================================================================================");
        System.out.println("");
        System.out.println("Danh sách sách");
        System.out.println("");
        System.out.println("=================================================================================");
        System.out.println("");
        System.out.println("Mã sách | Tên sách             | Tên tác giả       | Số lượng | Danh mục         ");
        System.out.println("");
        System.out.println("=================================================================================");
        
        try {
            
            arr_book.addAll(Read_File.ReadFileBook());
            for (Book book : arr_book) {
                Shows.ShowListBook(book);
            }

        } catch (Exception ex) {
            System.out.println("Lỗi show : " + Constans.err_note + ex.toString());
        }

        System.out.println("=================================================================================");
    }

}