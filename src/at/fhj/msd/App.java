package at.fhj.msd;
public class App {
    public static void main(String[] args) throws Exception 
    {
        EmployeeV2 e1 = new EmployeeV2("Max", "Muster", 1234.5);
        e1.currentSalaryValue();
        Salary s = new Salary(1234.5, 0.12);
        EmployeeV2 e2 = new EmployeeV2("Jane", "Doe", s);
        e2.setyears(2);
        
        System.out.println(e2.currentSalaryValue());

        


    }
}
