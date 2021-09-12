

import java.io.Serializable;

public class FullData implements Serializable{
    
    
	private static final long serialVersionUID = 1L;
	PersonalData osoba = new PersonalData();
    AddressData adres = new AddressData();
    
    public void daneRazem(PersonalData osoba, AddressData adres){
        
    this.osoba = osoba;
    this.adres = adres;
    }
}
