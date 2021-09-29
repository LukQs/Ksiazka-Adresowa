


import java.util.*;


public class Option implements IOption{
    
    private String str ;
    private  ArrayList<FullData> lista_dane = new ArrayList<FullData>();
    private boolean koniec = true;
    private char wybor;
    private final FullData dane_razem = new FullData();
    private char option;
   
    DataFile dataFile = new DataFile();
    Scanner odczyt = new Scanner(System.in);
    
    void set_option(char option){
        this.option = option;
    }  
    boolean get_koniec(){
        return koniec; 
    }   
    char get_wybor(){
        return wybor;  
    }  
    public ArrayList<FullData> get_dane(){
        return lista_dane;
    }
    @Override
    public void append() {
        
       
        
        System.out.print("Podaj imie:");
        str = odczyt.nextLine();
        dane_razem.osoba.set_imie(str);
        
        System.out.print("Podaj nazwisko:");
        str = odczyt.nextLine();
        dane_razem.osoba.set_nazwisko(str);
        
        System.out.print("Podaj email:");
        str = odczyt.nextLine();
        dane_razem.osoba.set_email(str);
        
        System.out.print("Podaj numer telefonu:");
        str = odczyt.nextLine();
        dane_razem.osoba.set_tel(str);
        
        System.out.print("Podaj ulice:");
        str = odczyt.nextLine();
        dane_razem.adres.set_ulica(str);
        
        System.out.print("Podaj nr domu:");
        str = odczyt.nextLine();
        dane_razem.adres.set_nr_domu(str);
        
        System.out.print("Podaj kod pocztowy:");
        str = odczyt.nextLine();
        dane_razem.adres.set_kod_pocztowy(str);
        
        System.out.print("Podaj miasto:");
        str = odczyt.nextLine();
        dane_razem.adres.set_miasto(str);
        
        System.out.print("Podaj panstwo:");
        str = odczyt.nextLine();
        dane_razem.adres.set_panstwo(str);
        
        lista_dane.add(dane_razem);
        
        System.out.print("\nNowy kontakt zostal dodany\n\n");
       
    }
    @Override
    public void edit() {
    	
        if (lista_dane.isEmpty()) {
                 System.out.println("Nie ma zadnych kontaktow do edycji\n" );
                
        }else{
           System.out.println("Edytuj kontakt:");
            System.out.print("Podaj nazwisko:");
            str = odczyt.nextLine();
         
            for(int i=0;i<lista_dane.size();i++){
            
                if (lista_dane.get(i).osoba.get_nazwisko().equals(str)) {
                	
                    append();
                   
                    System.out.print("Kontakt zostal zmieniony\n");
                 
                }else {
                	System.out.println("Nie znaleziono Kontaktu");
                }
            }  
        }
    }
    @Override
    public void delete() {
          if (lista_dane.isEmpty()) {
                 System.out.println("Nie ma zadnych kontaktow do usniecia\n");
                
        }else{
         System.out.println("Usun kontakt: ");
         System.out.print("Podaj nazwisko:");
         str = odczyt.nextLine();
         
            for(int i=0;i<lista_dane.size();i++){
            
                if (lista_dane.get(i).osoba.get_nazwisko().equals(str)) {
                	lista_dane.remove(i);
                    System.out.println("Kontakt zostal usuniety");
                } else {
                	System.out.println("Nie znaleziono Kontaktu do usuniecia");  
                }
            }
        }
    }
    @Override
    public void search() {
        if (lista_dane.isEmpty()) {
                 System.out.println("Nie ma zadnych kontaktow do wyszukania\n");
                 
        }else{
            System.out.println("Wyszukaj Kontaktu:\n");
            System.out.print("Podaj nazwisko:");
            str = odczyt.nextLine();
         
            for(int i=0;i<lista_dane.size();i++){
            
                if (lista_dane.get(i).osoba.get_nazwisko().equals(str)) {
                    System.out.println("Imie: " + lista_dane.get(i).osoba.get_imie());
                    System.out.println("Nazwisko:  " + lista_dane.get(i).osoba.get_nazwisko());
                    System.out.println("email: " + lista_dane.get(i).osoba.get_email());
                    System.out.println("Numer telefonu: " + lista_dane.get(i).osoba.get_tel()+"\n");
                    System.out.println("ADRES:     \n");
                    System.out.println("Ul. " + lista_dane.get(i).adres.get_ulica()+ " " + lista_dane.get(i).adres.get_nr_domu());
                    System.out.println(lista_dane.get(i).adres.get_kod_pocztowy() + " " + lista_dane.get(i).adres.get_miasto());
                    System.out.println(lista_dane.get(i).adres.get_panstwo());
                    
                 
                } else { 
                	
                	System.out.println("Nie znaleziono Kontaktu");
                	
                }
            }
        }
    }
    @Override
    public void exit(){
        
        char x;
        
        System.out.println("Czy napewno chcesz wyjsc z programu(t/n)?\n");
        x = odczyt.next().charAt(0);
        if (x == 't' || x== 'T') {
        	
            odczyt.close();     
            dataFile.save(lista_dane); 
            System.out.println("\nDowidzenia"); 
            koniec=false;
            
            }
    }
    public void choice() { 
    	 System.out.print("Twoj wybor: ");
         option = odczyt.nextLine().charAt(0);
         System.out.print("\n");
         
    }
    public void options(){
        switch (option) {
            case 'w':
            case 'W':
               search();
                break;

            case 'D':
            case 'd':
            	System.out.println("Dodaj nowa osobe:\n");
                append();
                break;
                
            case 'E':
            case 'e':
                edit();
                break;
            
            case 'U':
            case 'u':
                delete();
                break;
                
            case 'X':
            case 'x':
               exit();
                break;

                
            default: {
                System.out.println("Nie ma takiej opcji prosze wybrac jeszcze raz ");
            
            }
      }
    }   
}
