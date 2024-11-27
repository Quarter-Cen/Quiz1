public class room {
    public int calculateElec(int curr_elec, int last_elec){
        if (curr_elec < last_elec) {
            return 0;
        }
        int result = (curr_elec - last_elec) * 6;
        return result;
    }

    public int calculateWater(int curr_water, int last_water){
        if (curr_water < last_water) {
            return 0;
        }
        int result = (curr_water - last_water) * 5; 
        return result;
    }

    public int BillSumation(String roomtype,int curr_water, int last_water,int curr_elec, int last_elec){
        int roomprice = 0;
        if (roomtype.equals("Single Bed")){
            roomprice = 1500;
        } else if (
            roomtype.equals("Double Bed")
        ){
            roomprice = 2000;
        }
        int elec = calculateElec(curr_elec,last_elec);
        int water = calculateWater(curr_water,last_water);

        int result = roomprice + water + elec;
        System.out.println("ElectUnit " + (curr_elec - last_elec) + " Unit");
        System.out.println("Elect " + elec + " Baht");
        System.out.println("WaterUnit " + (curr_water - last_water) + " Unit");
        System.out.println("Water " + water + " Baht");
        System.out.println("Room Type " + roomtype);
        System.out.println("Total amount " + result + " Baht");
        return result;
    }

    public static void main(String[] args) {
        room objroom = new room();

        objroom.BillSumation("Double Bed", 15, 10, 20, 15);
    }
}

