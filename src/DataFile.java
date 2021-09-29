import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DataFile {
	
	 private final String path = "Your_path";
	 private final String name_file = "kontakt.dat";

	public void save(ArrayList<FullData> lista_dane) {
		 
		try{ 
             
             FileOutputStream f = new FileOutputStream(path + name_file);
             ObjectOutputStream o = new ObjectOutputStream(f);
             o.writeObject(lista_dane);
             o.close();
             f.close();
             System.out.printf("Udalo sie zapisac \nilosc zapisanych danych: " + lista_dane.size());
             } catch (IOException ex) {
                     ex.printStackTrace();
             }
	}
	public void read(){
    	
        try{
        		
               ObjectInputStream oi = new ObjectInputStream(new FileInputStream(path + name_file));
               @SuppressWarnings("unchecked")
               ArrayList<FullData> lista_dane = (ArrayList<FullData>)oi.readObject();
               System.out.println("Ilosc wczytanych kontaktow: " + lista_dane.size()+ "\n");
               oi.close();
            
        }catch (IOException | ClassNotFoundException ex){
            
        		ex.printStackTrace();
            
        }        
    }
}
	


