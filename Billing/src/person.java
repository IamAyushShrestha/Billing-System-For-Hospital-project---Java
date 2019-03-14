public class person {
    private String first,last;

    public person(){

    }

    public person(String first,String last){
        this.first=first;
        this.last = last;
    }

    public String getFirstAndLast(){
        return first+" "+last;
    }

    public void setFirstAndLast(String first , String last){
        this.first= first;
        this.last= last;
    }



    }


