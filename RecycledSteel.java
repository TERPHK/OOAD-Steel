public class RecycledSteel {
    static int steel_id;
    static String steel_type;
    static String steel_name;
    static float steel_weight;
    static float steel_price;
                                        //Id /type                 /name              /price/weigh
    static String dataRecylSteel[][] = {{"0","Hot rolled steel","Solid square steel","15","15"},
                                        {"1","Hot rolled steel","I-Beam steel","15","15"},
                                        {"2","Hot rolled steel","H-Beam steel","15","15"},
                                        {"3","Hot rolled steel","angle iron","15","5"},
                                        {"4","Hot rolled steel","steel gutter","15","15"},
                                        {"5","Cold Formed Steel","Carbon Steel Round Pipe","15","15"},
                                        {"6","Cold Formed Steel","galvanized steel pipe","15","15"},
                                        {"7","Cold Formed Steel","C shape steel","15","15"},
                                        {"8","Cold Formed Steel","square steel box","15","15"},
                                        {"9","Cold Formed Steel","flat steel box","15","15"},
                                        {"10","Cold Formed Steel","Cold Formed Channel","15","15"},
                                        {"11","Cold Formed Steel","Total Steel","15","15"}};

    RecycledSteel(int id){
        String[] array = dataRecylSteel[id];
        this.steel_id = Integer.parseInt(array[0]);
        this.steel_type = array[1];
        this.steel_name = array[2];
        this.steel_weight = Float.parseFloat(array[3]);
        this.steel_price = Float.parseFloat(array[4]);

    }

    RecycledSteel(){

    }

    public static void addSteel(String[] newRecord){
        int nextId = 1;
        if (newRecord.length != 5) {
            System.out.println("Invalid data format. Please provide an array with 5 elements.");
            return;
        }

        String[] formattedRecord = new String[5];
        formattedRecord[0] = String.valueOf(nextId++);
        for (int i = 1; i < 5; i++) {
            formattedRecord[i] = newRecord[i - 1];
        }

        // Create a new array to accommodate the additional record
        String[][] newData = new String[dataRecylSteel.length + 1][];
        for (int i = 0; i < dataRecylSteel.length; i++) {
            newData[i] = dataRecylSteel[i];
        }
        newData[dataRecylSteel.length] = formattedRecord;

        dataRecylSteel = newData;
    }


    public static void displayInfoSteel(){
        for (int i = 0; i < dataRecylSteel.length; i++) {
            System.out.println("ID :"+dataRecylSteel[i][0]+" , Steel Type :"+dataRecylSteel[i][1]+"Steel Name :"+dataRecylSteel[i][2]+" , Price :"+dataRecylSteel[i][3]);
        }
    }
    

    
}
