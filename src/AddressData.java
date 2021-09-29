
import java.io.Serializable;

public class AddressData implements Serializable{
    
	private static final long serialVersionUID = 1L;
	private String ulica;
    private String nr_domu;
    private String kod_pocztowy;
    private String miasto;
    private String panstwo;
    
    public void set_ulica(String ulica){
        this.ulica = ulica;
    }
    public String get_ulica(){
        return ulica;
    }
    public void set_nr_domu(String nr_domu){
        this.nr_domu = nr_domu;
    }
    public String get_nr_domu(){
        return nr_domu;
    }
    public void set_kod_pocztowy(String kod_pocztowy){
        this.kod_pocztowy = kod_pocztowy;
    }
    public String get_kod_pocztowy(){
        return kod_pocztowy;
    }
    public void set_miasto(String miasto){
        this.miasto = miasto;
    }
    public String get_miasto(){
        return miasto;
    }
    public void set_panstwo(String panstwo){
        this.panstwo = panstwo;
    }
    public String get_panstwo(){
        return panstwo;
    }
        @Override
    public String toString() 
    {
        return String.format(
                "           Adres:"
                + "\n Ulica: %s"
                + " %s"
                + "\n Kod pocztowy: %s"
                + "\n Miasto: %s"
                + "\n Panstwo: %s"
                , ulica, nr_domu, kod_pocztowy, miasto, panstwo);
    }
}
