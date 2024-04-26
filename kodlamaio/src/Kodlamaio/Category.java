package Kodlamaio;

public class Category {

    private int categoryId;
    private String categoryName;


    public int getCategoryId(){
        return this.categoryId;
    }

    public void setCategoryId(int newCategoryId){
        this.categoryId = newCategoryId;
    }

    public String getCategoryName(){
        return this.categoryName;
    }

    public void setCategoryName(String newCategoryName){
        this.categoryName = newCategoryName;
    }

    public Category(int id,String name){
        this.categoryId = id;
        this.categoryName = name;
    }

    public Category(){

    }

}
