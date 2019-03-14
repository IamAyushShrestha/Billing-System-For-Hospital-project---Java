public class doctor extends person {
    private String specialty;

    public doctor(String first, String last, String specialty){
        super(first,last);
        this.specialty= specialty;

    }

    public String toString(){
        return "\nDoctor's first and last name:"+super.getFirstAndLast()+"\nSpecialty: "+this.specialty;
    }



}
