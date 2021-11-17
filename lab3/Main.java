package lab3;
import lab3.Lab3.Patient;
import lab3.Lab3.Hospital;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String args[]){
        Hospital h=new Hospital();
        Patient p1=new Patient.Builder()
                .setBloodGroup("00")
                .setSocialGroup("")
                .setAddress("address1")
                .setAge(70)
                .setFirstName("PatientFN1")
                .setLastName("PatientLN1")
                .setMiddleName("PatientLM1")
                .setId(1)
                .build();
        Patient p2=new Patient.Builder()
                .setBloodGroup("00")
                .setSocialGroup("")
                .setAddress("address2")
                .setAge(30)
                .setFirstName("PatientFN2")
                .setLastName("PatientLN2")
                .setMiddleName("PatientLM2")
                .setId(2)
                .build();
        Patient p3=new Patient.Builder()
                .setBloodGroup("00")
                .setSocialGroup("")
                .setAddress("address3")
                .setAge(75)
                .setFirstName("PatientFN3")
                .setLastName("PatientLN3")
                .setMiddleName("PatientLM3")
                .setId(3)
                .build();
        Patient p4=new Patient.Builder()
                .setBloodGroup("AA")
                .setSocialGroup("")
                .setAddress("address4")
                .setAge(30)
                .setFirstName("PatientFN1")
                .setLastName("PatientLN4")
                .setMiddleName("PatientLM4")
                .setId(4)
                .build();
        Patient p5=new Patient.Builder()
                .setBloodGroup("A0")
                .setSocialGroup("")
                .setAddress("address5")
                .setAge(30)
                .setFirstName("PatientFN5")
                .setLastName("PatientLN5")
                .setMiddleName("PatientLM5")
                .setId(5)
                .build();
        h.add_patient(p1);
        h.add_patient(p2);
        h.add_patient(p3);
        h.add_patient(p4);
//        h.add_patient(p5);
//        h.print();
//        h.sort_p();
//        for(Patient p:h.filter_s("PatientFN1")) {
//            System.out.println(p.toString());
//        }
        h.update(70);
        h.print();
    }
}
