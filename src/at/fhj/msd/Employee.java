package at.fhj.msd;

public class Employee {

      private String firstName = "lol";
      private String lastName = "sos";
      private int id = 3;
      private double salary = 22.3;

      public int getId()
      {
            return this.id; 
      }

      public double getSalary()
      {
            return this.salary;
      }

      public String getName () 
      {
          return lastName.toUpperCase() + firstName;
      }



}
