package at.fhj.msd;
public class App {
    public static void main(String[] args) throws Exception 
    {
        // Employe 1 
        Employee e = new Employee("Edward", "Lasley");
        e.setfirstName("Dick");
        System.out.println(e.getName());
        System.out.println(e.getId());
        System.out.println(e.getSalary());
        e.setsalary(200);
        System.out.println(e.getSalary());
        Employee e2 = new Employee("Huey", "Lasley", 2000);
        System.out.println(e2.getName());
        System.out.println(e2.getId());
        System.out.println(e2.toString());

        //Salary
        Salary s = new Salary(1000, 0.2);
        System.out.println(s.getbaseValue());
        System.out.println(s.getincrease());
        System.out.println(s.currentValue(3));
        Salary s2 = new Salary(1000);
        System.out.println(s2.currentValue(1));

        // Employe 2
        EmployeeV2 e3 = new EmployeeV2("Saul", "Goodman", 100);
        System.out.println(e3.getSalary());
        System.out.println(e3.currentSalaryValue());
        EmployeeV2 e4 = new EmployeeV2("Walter", "White", s2);
        System.out.println(e4.getSalary());
        e4.setyears(1);
        System.out.println(e4.currentSalaryValue());

        
        


    }
}
