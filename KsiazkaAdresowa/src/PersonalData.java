
import java.io.Serializable;

public class PersonalData extends ContactData implements Serializable{
    
    
    

	private static final long serialVersionUID = 1L;
	private String imie;
    private String nazwisko;
   
   
    public void set_imie(String imie){
        this.imie = imie;
    }
    public String get_imie(){
        return imie;
    }
    public void set_nazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }
    public String get_nazwisko(){
        return nazwisko;
    }
       @Override
    public String toString() 
    {
        return String.format(
                "           Osoba:"
                + "\n Imie: %s"
                + "\n Nazwisko: %s"
                , imie, nazwisko);
    }
}    
    