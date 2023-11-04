import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    int person_id;
    static String person_name;
    static String person_tel;
    static String person_address;
    


    public Person(String[] dataPerson) {
        this.person_id =Integer.parseInt(dataPerson[0]);
        this.person_name = dataPerson[1];
        this.person_tel = dataPerson[2];
        this.person_address = dataPerson[3];
        
    }

    public int getIdPerson() {
        return this.person_id;
    }

     public String getNamePerson() {
        return person_name;
    }
    
   
}
