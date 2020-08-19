package Controllers.Files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Models.Book;
import Models.CardsBorrowBook;
import Models.CardsLibrary;
import Shareds.Constans;

public class Write_File {
    private static String FileNameBook = "books.dat";
    private static String FileNameCardLibrary = "members.dat";
    private static String FileNameCardBorrowBook = "loans.dat";

    public static void WriteBookFile(ArrayList<Book> arr_book) throws IOException {

        FileOutputStream file = new FileOutputStream(FileNameBook);

        ObjectOutputStream oOS = null;

        try {
            oOS = new ObjectOutputStream(file);
            oOS.writeObject(arr_book);
            oOS.flush();

        } catch (IOException ex) {
            System.out.println("Lỗi Write_FileBook  : " + Constans.err_note + ex.toString());
        } finally {
            if (oOS != null) {
                oOS.close();
                file.close();
            }
        }
    }

    public static void WriteCardLibraryFile(ArrayList<CardsLibrary> arr_card) throws IOException {

        FileOutputStream file = new FileOutputStream(FileNameCardLibrary);

        ObjectOutputStream oOS = null;

        try {
            oOS = new ObjectOutputStream(file);
            oOS.writeObject(arr_card);
            oOS.flush();

        } catch (IOException ex) {
            System.out.println("Lỗi Write_FileCardLibrary  : " + Constans.err_note + ex.toString());
        } finally {
            if (oOS != null) {
                oOS.close();
                file.close();
            }
        }
    }

    public static void WriteCardBorrowBookFile(ArrayList<CardsBorrowBook> arr_card) throws IOException {

        FileOutputStream file = new FileOutputStream(FileNameCardBorrowBook);

        ObjectOutputStream oOS = null;

        try {
            oOS = new ObjectOutputStream(file);
            oOS.writeObject(arr_card);
            oOS.flush();

        } catch (IOException ex) {
            System.out.println("Lỗi Write_FileCardBorrowBook  : " + Constans.err_note + ex.toString());
        } finally {
            if (oOS != null) {
                oOS.close();
                file.close();
            }
        }
    }
}