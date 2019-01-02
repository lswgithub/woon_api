package pattern;

import java.util.*;

class Person {
    private String id;
    private String name;
    private String department;
    private String phone;
    private String mail;
    private String empNo;
        
    public Person(String id, String name, String department, String phone, String mail, String empNo) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.phone = phone;
        this.mail = mail;
        this.empNo = empNo;
    }
    
    @Override
    public String toString() {
        return "person : " + id;
    }
    
}