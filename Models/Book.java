package Models;

import java.io.Serializable;

public class Book implements Serializable{
    private String IDBook,NameBook,AuthorBook,CategoryBook;
    private int AmountBook;
    public String getIDBook(){
        return IDBook;
    }
    public String getNameBook(){
        return NameBook;
    }
    public String getAuthorBook(){
        return AuthorBook;
    }
    public Integer getAmountBook(){
        return AmountBook;
    }
    public String getCategoryBook(){
        return CategoryBook;
    }
    public void setID(String str){
        IDBook=str;
    }
    public void setNameBook(String str){
        NameBook=str;
    }
    public void setAuthorBook(String str){
        AuthorBook=str;
    }
    public void setAmountBook(int str){
        AmountBook=str;
    }
    public void setCategoryBook(String str){
        CategoryBook=str;
    }
    public Book(){}
}