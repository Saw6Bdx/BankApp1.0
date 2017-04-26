package projetJava;

public class Category {
    public Category(String label){
        if(label == null){
            throw new NullPointerException("label can't be null");
        }
        this.label = label;
    }
    
    public String getCategory(){
        return this.label;
    }
    
    /*public createCategory(){ 
        // Add in Bdd !!!
    }*/
    
    private String label;
}
