package encapsulation;

public class TestEmployee {
    public static void main(String[] args) {

        //using set the value and get the value.
        Employee emp1 = new Employee();
        emp1.setEmpName("kajol");
        emp1.setEmpDOB("01/01/2000");
        emp1.setEmpId(101);
        System.out.println(emp1.getEmpName()+" "+emp1.getEmpDOB()+" "+emp1.getEmpId());

        //using set the value and get the value.
        Employee emp2 = new Employee();
        emp2.setEmpName("Sharif");
        emp2.setEmpDOB("01/01/2005");
        emp2.setEmpId(102);
        System.out.println(emp2.getEmpName()+" "+emp2.getEmpDOB()+" "+emp2.getEmpId());

        //using constructor set the value then get the value
        Employee emp3 = new Employee("Shiddique",103,"05/17/1948");
        System.out.println(emp3.getEmpName());
    }
}
