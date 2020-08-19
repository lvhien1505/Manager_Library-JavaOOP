package Controllers.ManageCardsLibrary;

import java.util.ArrayList;

import Controllers.Files.Read_File;
import Controllers.Utils.Shows;
import Models.CardsLibrary;
import Shareds.Constans;

public class Show_CardsLibrary {
    public static void ShowCard() {
        ArrayList<CardsLibrary> arr_card = new ArrayList<CardsLibrary>();
        System.out.println("=================================================================================");
        System.out.println("");
        System.out.println("Danh sách thẻ thư viện");
        System.out.println("");
        System.out.println("=================================================================================");
        System.out.println("");
        System.out.println("Mã thẻ  | Tên chủ thẻ               | CMND          | Ngày tạo                   ");
        System.out.println("");
        System.out.println("=================================================================================");

        try {
            arr_card.addAll(Read_File.ReadFileCardLibrary());
            for (CardsLibrary card : arr_card) {
                Shows.ShowListCardLibrary(card);
            }
        } catch (Exception ex) {
            System.out.println("Lỗi tại class Show_class : " + Constans.err_note + ex.toString());
        }

        System.out.println("=================================================================================");
    }
}