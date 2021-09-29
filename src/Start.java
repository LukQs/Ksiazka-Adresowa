
public class Start {
    public static void main(String[] args){
       
       Option option =new Option();    
       Menu menu = new Menu();
       
       menu.showTitle();
       option.dataFile.read();
       
       for(;option.get_koniec();){
    	   
            menu.showOptions();
            option.choice();
            option.options(); 
       }      
    }   
}
           
