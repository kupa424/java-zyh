import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Person p1=new Person(1,"Joe",70000,3);
        Person p2=new Person(2,"Henry",80000,4);
        Person p3=new Person(3,"Sam",60000);
        Person p4=new Person(4,"Max",90000);
        List<Person> persons = new ArrayList<Person>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        for (Person temp:persons){
            System.out.println(temp);
        }

    }
}
class Person{
    int Id;
    String Name;
    int Salary;
    Integer ManagerId;

    public Person(int id, String name, int salary, int managerId) {
        Id = id;
        Name = name;
        Salary = salary;
        ManagerId = managerId;
    }

    public Person(int id, String name, int salary) {
        Id = id;
        Name = name;
        Salary = salary;
            }
    @Override
    public String toString() {
        return Id+"\t"+Name+"\t"+Salary+"\t"+ManagerId;
    }

}
