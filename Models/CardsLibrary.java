package Models;

import java.io.Serializable;

public class CardsLibrary implements Serializable{
    private String IDCard,NameUserCard,DateCreate;
    private int CMND;
    
    public String getIDCard(){
        return IDCard;
    }
    public String getNameUserCard(){
        return NameUserCard;
    }
    public int getCMND(){
        return CMND;
    }
    public String getDateCreate(){
        return DateCreate;
    }
   
    public void setID(String str){
        IDCard=str;
    }
    public void setNameUserCard(String str){
        NameUserCard=str;
    }
    public void setCMND(int str){
        CMND=str;
    }
   
    public void setDateCreate(String str){
        DateCreate=str;
    }
    public CardsLibrary(){}
}