public class Notification extends Purchasing {
    // Attributes
    int notification_id;

    static String[][] dataPurchase = { { "0", "0", "0", "5", "jakrit", "0871913872", "kamphaeng phet. Mueang Kamphaeng Phet District. ", "Wait", "2023-10-10" } };

    // Constructor
    public Notification(int id) {
        
        super(dataPurchase[id]);
        this.notification_id = Integer.parseInt(dataPurchase[id][0]);

    }

    public static void confirmOrder(int id){
        dataPurchase[id][dataPurchase[id].length-2] = "Finished";
    }

    public static void fetchNotification(int select) {
        if (select == 1) {
            for (int i = 0; i < dataPurchase.length; i++) {
                if (dataPurchase[i][dataPurchase[i].length - 2].equals("Wait")) {
                    System.out.println("*****************************************************************************");
                    Notification notifi = new Notification(i);
                    String[] resteel = dataPurchase[i][2].split(":");

                    float sumprice = 0;
                    System.out.println("Purchase ID : " + dataPurchase[i][0]);
                    for (int j = 0; j < resteel.length; j++) {
                        RecycledSteel noti = new RecycledSteel(Integer.parseInt(dataPurchase[i][0]));
                        float priceSteel = Integer.parseInt(dataPurchase[j][3]) * noti.steel_price;
                        sumprice += priceSteel;
                        System.out.println("Steel Type : " + noti.steel_type + " | Steel Name : " + noti.steel_name
                                + "     " + " | Weight:" + dataPurchase[i][3] + " | Price:" + priceSteel);
                    }
                    System.out.println("Name : " + notifi.customer_name);
                    System.out.println("Address : " + notifi.customer_address);
                    System.out.println("Tel : " + notifi.customer_tel);
                    System.out.println("*****************************************************************************");
                }
            }
        } else if (select == 2) {
            for (int i = 0; i < dataPurchase.length; i++) {
                if (dataPurchase[i][dataPurchase[i].length - 2].equals("Finished")) {
                    System.out.println("*****************************************************************************");
                    Notification notifi = new Notification(i);
                    String[] resteel = dataPurchase[i][2].split(":");

                    float sumprice = 0;
                    System.out.println("Purchase ID : " + dataPurchase[i][0]);
                    for (int j = 0; j < resteel.length; j++) {
                        RecycledSteel noti = new RecycledSteel(Integer.parseInt(dataPurchase[i][0]));
                        float priceSteel = Integer.parseInt(dataPurchase[j][3]) * noti.steel_price;
                        sumprice += priceSteel;
                        System.out.println("Steel Type : " + noti.steel_type + " | Steel Name : " + noti.steel_name
                                + "     " + " | Weight:" + dataPurchase[i][3] + " | Price:" + priceSteel);
                    }
                    System.out.println("Name : " + notifi.customer_name);
                    System.out.println("Address : " + notifi.customer_address);
                    System.out.println("Tel : " + notifi.customer_tel);
                    System.out.println("*****************************************************************************");
                }
            }
        }
    }

    public static void addRow(String[] newRow) {
        String[][] newData = new String[dataPurchase.length + 1][];

        for (int i = 0; i < dataPurchase.length; i++) {
            newData[i] = dataPurchase[i];
        }

        newData[dataPurchase.length] = newRow;
        dataPurchase = newData;
    }

}