
public class ContactData {
   
    private String email;
    private String nr_telefonu;
    
    
    
    
    public void set_tel(String nr_telefonu){
        this.nr_telefonu = nr_telefonu;
    }
    public String get_tel(){
        return nr_telefonu;
    }
    public void set_email(String email){
        this.email = email;
    }
    public String get_email(){
        return email;
    }
}
