package Controllers.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import Controllers.Utils.Shows;
import Models.Book;
import Models.CardsBorrowBook;
import Models.CardsLibrary;
import Shareds.Constans;

public class Read_File {
    private static String FileNameBook = "books.dat";
    private static String FileNameCardLibrary = "members.dat";

    private static String FileNameCardBorrowBook = "loans.dat";

    public static ArrayList<Book> ReadFileBook() throws IOException {
        ArrayList<Book> arr_book = new ArrayList<Book>();
        File file_check = new File(FileNameBook);
        if (!file_check.exists()) {
            file_check.createNewFile();
        } else {
            FileInputStream file = new FileInputStream(FileNameBook);
            ObjectInputStream oIS = null;

            try {
                oIS = new ObjectInputStream(file);
                arr_book = (ArrayList<Book>) oIS.readObject();

            }

            catch (

            Exception ex) {
                System.out
                        .println("Lỗi tại method ReadFileBook ở class Read_File :" + Constans.err_note + ex.toString());
            } finally {

                oIS.close();
                file.close();

            }
        }

        return arr_book;

    }

    public static ArrayList<CardsLibrary> ReadFileCardLibrary() throws IOException {
        ArrayList<CardsLibrary> arr_card = new ArrayList<CardsLibrary>();
        File file_check = new File(FileNameCardLibrary);
        if (!file_check.exists()) {
            file_check.createNewFile();
        } else {
            FileInputStream file = new FileInputStream(FileNameCardLibrary);
            ObjectInputStream oIS = null;
            oIS = new ObjectInputStream(file);
            try {
                arr_card = (ArrayList<CardsLibrary>) oIS.readObject();

            } catch (Exception ex) {
                System.out.println(
                        "Lỗi tại method ReadFileCardLibrary ở class Read_File :" + Constans.err_note + ex.toString());
            } finally {

                oIS.close();
                file.close();

            }
        }
        return arr_card;

    }

    public static ArrayList<CardsBorrowBook> ReadFileCardBorrowBook() throws IOException {
        ArrayList<CardsBorrowBook> arr_card = new ArrayList<CardsBorrowBook>();

        File file_check = new File(FileNameCardBorrowBook);
        if (!file_check.exists()) {
            file_check.createNewFile();
        } else {
            FileInputStream file = new FileInputStream(FileNameCardBorrowBook);
            ObjectInputStream oIS = null;
            try {
                oIS = new ObjectInputStream(file);
                arr_card = (ArrayList<CardsBorrowBook>) oIS.readObject();

            } catch (Exception ex) {
                System.out
                        .println("Lỗi tại method ReadFileBook ở class Read_File :" + Constans.err_note + ex.toString());
            } finally {
                oIS.close();
                file.close();
            }
        }

        return arr_card;
    }
}