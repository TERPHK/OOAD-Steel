import java.util.Arrays;

public class RecycledSteelFactory {
    int factoryowner_id;
    String factoryownwer_name;
    String factoryowner_address;
    static String[][] dataArraySteel = { { "0", "Pittaya", "kamphaeng phet"} };

    RecycledSteelFactory() {

    }

    RecycledSteelFactory(int steelId) {
        String[] dataSteel = dataArraySteel[steelId];
        this.factoryowner_id = Integer.parseInt(dataSteel[0]);
        this.factoryownwer_name = dataSteel[1];
        this.factoryowner_address = dataSteel[2];
        
    }

    public static void displaySteelList(){
        for (int i = 0; i < dataArraySteel.length; i++) {
            System.out.println("ID: "+dataArraySteel[i][0]+" , Factory Name :"+dataArraySteel[i][1]+" , Address Name :"+dataArraySteel[i][2]);
        }
    }

}
