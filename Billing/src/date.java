public class date {
    private int month;
    private int day;
    private int year;

    public date(){

    }
    public date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String toString(){
        return this.month+"/"+this.day+"/"+this.year;
    }

}
