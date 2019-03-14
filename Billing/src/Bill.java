public class Bill  {
    private int id;
    private double charges;
    private double fee;
    private double roomFee;

    public Bill(int id, double charges , double fee, double roomFee){
        this.id= id;
        this.charges= charges;
        this.roomFee=roomFee;
        this.fee=fee;
    }



    public int getId(){
        return this.id;
    }


    public double getCharges(){
        return this.charges;
    }



    public double getFee(){
        return this.fee;
    }



    public double getRoomFee(){
        return this.roomFee;
    }


    public String toString(){
        return "\nMedicine Charges: "+getCharges()+"\nDoctor's fee: "+getFee()
                +"\nRoom charges: "+getRoomFee();
    }
}
