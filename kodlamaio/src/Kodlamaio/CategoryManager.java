package Kodlamaio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CategoryManager {

    private List<Category> categories;

    public CategoryManager(){
        categories = new ArrayList<Category>();
        categories.add(new Category(1,"Programlama"));
    }

    public List<Category> getAll(){
        return categories;
    }

    public void addCategory(Category addCategory){
        categories.add(addCategory);
    }

    public void deleteCategory(int categoryId){
        Iterator<Category> categoryIterator = categories.iterator();
        while (categoryIterator.hasNext()){
            Category category = categoryIterator.next();
            if (category.getCategoryId()==categoryId){
               categoryIterator.remove();
            }
        }
    }

    public void updateCategory(Category category){
        for (Category updateCategory:categories){
            if (updateCategory.getCategoryId() == category.getCategoryId()){
                updateCategory.setCategoryId(category.getCategoryId());
                updateCategory.setCategoryName(category.getCategoryName());
            }
        }
    }

    public Category getById(int id){
        for (Category category:categories){
            if (category.getCategoryId() == id){
                return category;
            }
        }
        return null;
    }

}
