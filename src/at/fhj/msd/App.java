package at.fhj.msd;
public class App {
    public static void main(String[] args) throws Exception 
    {
        Employee employer = new Employee("Manuel", "Kazyniski");
        Employee employer1 = new Employee("Manuel", "Kazyniski");
        Employee employer2 = new Employee("Manuelski", "Kazyniski");
        
        
        
    

        System.out.println(employer.getName());
        System.out.println(employer.getSalary());
        System.err.println(employer2.getId());
        


    }
}
