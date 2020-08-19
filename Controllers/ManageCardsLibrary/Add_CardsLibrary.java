package Controllers.ManageCardsLibrary;

import java.util.ArrayList;
import Controllers.Files.Write_File;
import Controllers.Utils.Inputs;
import Models.CardsLibrary;
import Shareds.Constans;
import Shareds.Utils;

public class Add_CardsLibrary {
    public static void AddCard() {
        ArrayList<CardsLibrary> arr_card = new ArrayList<CardsLibrary>();
        System.out.println("======== Thêm mới một thẻ thư viện ========");

        System.out.println("");
        Constans.is_continue_addcardlibrary = true;
        while (Constans.is_continue_addcardlibrary) {
            try {

                arr_card.add(Inputs.InputCardLibrary());
                Write_File.WriteCardLibraryFile(arr_card);
                System.out.println("");
                System.out.println("Thêm mới thành công!!!");
                Constans.is_wrong_type = true;
                while (Constans.is_wrong_type) {
                    System.out.print(Constans.ques_continue);
                    String choice = Utils.ChooseInput();
                    switch (choice) {
                        case "Y":
                        case "y":
                            Constans.is_continue_addcardlibrary = true;
                            Constans.is_wrong_type = false;
                            break;
                        case "N":
                        case "n":
                            Constans.is_continue_addcardlibrary = false;
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