import java.util.Scanner;
import java.util.*;
public class Test {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to view patient's informations:");
        System.out.println("Enter 2 to exit:");
        int choice = sc.nextInt();
        if(choice==2 ){
            System.exit(1);
        }

        else if (choice!=1){
            System.out.println("Invalid input...Try again!!!");
            menu();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        menu();
            System.out.println("Enter patient's First and last name (hit enter after each input):");
            String pFirst = sc.nextLine();
            String pLast = sc.nextLine();
            System.out.println("");

            System.out.println("Enter patient's age: ");
            int age = sc.nextInt();
            System.out.println("Enter patient's id (Maximum of 6 Numbers on your Receipt): ");
            int id = sc.nextInt();
            System.out.println("Enter patient's DOB mm, day, year (hit enter after each input): ");
            int mm = sc.nextInt();
            int day = sc.nextInt();
            int year = sc.nextInt();

            System.out.println("Enter assigned physician's First and Last name: ");
            String physicianFirst = sc.nextLine();
            String physicianLast = sc.nextLine();

            System.out.println("Enter physician's specialty: ");
            String specialty = sc.nextLine();
            System.out.println("Admitted date mm, day and year (hit enter after each input): ");
            int Amm = sc.nextInt();
            int Aday = sc.nextInt();
            int Ayear = sc.nextInt();
            System.out.println("Discharge date mm, day and year (hit enter after each input): ");
            int Dmm = sc.nextInt();
            int Dday = sc.nextInt();
            int Dyear = sc.nextInt();


            System.out.println("Enter medicine charges: ");
            double charges = sc.nextDouble();
            System.out.println("Enter Doctor's fee amount:");
            double fee = sc.nextDouble();
            System.out.println("Enter Room Charges amount: ");
            double roomFee = sc.nextDouble();


            patient pa = new patient();
            pa.setAge(age);
            pa.setAdmitted(Aday, Amm, Ayear);
            pa.setDischarge(Dday, Dmm, Dyear);
            pa.setDob(day, mm, year);
            pa.setPhysician(physicianFirst, physicianLast);
            pa.setId(id);

            person person = new person(pFirst, pLast);
            doctor doc = new doctor(physicianFirst, physicianLast, specialty);
            Bill bill = new Bill(id, charges, fee, roomFee);

            System.out.println("\n\nPatient's Name: " + person.getFirstAndLast() +
                    "\nId: " + pa.getId() +

                    "\nDOb:    " + pa.getDob() +
                    doc.toString() +
                    "\nAdmitted date:  " + pa.getAdmitted() +
                    "\nDischarge Date:  " + pa.getDischarge() +
                    "\nAge: " + pa.getAge() + bill.toString());


        }

    }






