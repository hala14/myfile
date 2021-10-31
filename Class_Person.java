/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_person;


public class Class_Person {

   
    public static void main(String[] args) {
        person p=new person("person");
        Student s=new Student("student");
        Employee e=new Employee("programmer", "3000","employee");
        Faculty f=new Faculty("faculty");
        Staff st=new Staff("staff");
        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(st.toString());
        
       
    }
    
}
