package Controllers.ManageCardsLibrary;

import java.util.ArrayList;

import Controllers.Files.Write_File;
import Controllers.Utils.Checks;
import Controllers.Utils.Convert_Date;
import Models.CardsLibrary;
import Shareds.Constans;
import Shareds.Utils;

public class Update_CardsLibrary {
    public static void UpdateCard() {
        ArrayList<CardsLibrary> arr_card = new ArrayList<CardsLibrary>();
        CardsLibrary new_card = new CardsLibrary();
        System.out.println("========= Cập nhật thông tin sách =========");
        System.out.println("");
        Constans.is_continue_updatecardlibrary = true;
        while (Constans.is_continue_updatecardlibrary) {
            Constans.is_wrong_type = true;
            while (Constans.is_wrong_type) {
                System.out.print("- Nhập mã thẻ     : ");
                String str_id = Utils.ChooseInput();
                try {
                    int n = Checks.CheckInputIDCardLisbrary(str_id);
                    if (n == 0) {
                        arr_card.addAll(Checks.CheckIDUpdateCardLibrary(str_id));
                        new_card.setID(str_id);
                        Constans.is_wrong_type = false;
                    } else {
                        System.out.println(Constans.err_id_input);
                    }

                } catch (Exception ex) {
                    System.out.println("Lỗi tại class Update_CardLibrary :" + Constans.err_note + ex.toString());
                }
            }
            System.out.print("- Sửa tên chủ thẻ : ");
            new_card.setNameUserCard(Utils.ChooseInput());
            System.out.print("- Sửa số CMND     : ");
            new_card.setCMND(Integer.parseInt(Utils.ChooseInput()));
            new_card.setDateCreate(Convert_Date.DateToString());
            arr_card.add(new_card);
            Constans.is_wrong_type = true;
            while (Constans.is_wrong_type)

            {
                System.out.print(Constans.ques_continue_update);
                String choice = Utils.ChooseInput();
                switch (choice) {
                    case "Y":
                    case "y":
                        try {
                            Write_File.WriteCardLibraryFile(arr_card);
                        } catch (Exception ex) {
                            System.out
                                    .println("Lỗi tại class Update_CardLibrary :" + Constans.err_note + ex.toString());
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
                        Constans.is_continue_updatecardlibrary = true;
                        Constans.is_wrong_type = false;
                        break;
                    case "N":
                    case "n":
                        Constans.is_continue_updatecardlibrary = false;
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