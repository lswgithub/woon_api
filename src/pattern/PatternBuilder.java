package pattern;

import java.util.*;

public class PatternBuilder {
    private String id;
    private String name;
    private String department;
    private String phone;
    private String mail;
    private String empNo;
    
    public PatternBuilder setId(String id){
        this.id = id;
        return this;
    }
    
    public PatternBuilder setName(String name){
        this.name = name;
        return this;
    }
    
    public PatternBuilder setDepartment(String department){
        this.department = department;
        return this;
    }
    
    public PatternBuilder setPhone(String phone){
        this.phone = phone;
        return this;
    }
    
    public PatternBuilder setMail(String mail){
        this.mail = mail;
        return this;
    }
    
    public PatternBuilder setEmpNo(String empNo){
        this.empNo = empNo;
        return this;
    }
    
    public Person build() {
        Person person = new Person(id, name, department, phone, mail, empNo);
        return person;
    }
    
    public static void main(String[] args) {
        PatternBuilder pb = new PatternBuilder();
        
        Person person = pb.setId("swlee.temp").build();
        System.out.println(person.toString());
    }
}

