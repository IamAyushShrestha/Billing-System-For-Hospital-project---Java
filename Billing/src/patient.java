public class patient extends person {
    private int id;
    private String physician;
    private String dob;
    private String admitted;
    private String discharge;
    private int age;

    public patient(){
    }
    public void setId(int id){
        this.id= id;
    }

    public int getId(){
        return this.id;
    }



    public void setPhysician(String first , String last){
        this.physician= physician;
    }

    public String getPhysician(){
        return this.physician;
    }



    public void setAge(int age){
        this.age= age;
    }

    public int getAge(){
        return this.age;
    }



    public void setDob(int a,int b, int c){
        date date= new date(a,b,c);
        this.dob=date.toString();
    }

    public String getDob(){
        return this.dob;
    }




    public void setAdmitted(int a, int b , int c){
        date d= new date(a,b,c);
        this.admitted=d.toString();
    }

    public String getAdmitted(){
        return this.admitted;
    }


    public void setDischarge(int a, int b, int c){
        date dd= new date(a,b,c);
        this.discharge=dd.toString();
    }

    public String getDischarge(){
        return this.discharge;
    }

    public String toString(){
        return "Patient's Name:"+super.getFirstAndLast()+ "id: "+getId()+"\nPhysician's name:"+getPhysician()+"\nDOb:" +getDob()+"\nAdmitted date: "
                + getAdmitted()+"\nDischarge Date: "+getDischarge()+"\nAge: "+getAge();
    }



}
