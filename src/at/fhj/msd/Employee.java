package at.fhj.msd;

public class Employee {

      private String firstName;
      private String lastName;
      private static int currentId = 1;
      private final int id;
      private double salary;
      

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
          return lastName.toUpperCase() + " " + firstName;
      }

      public void setfirstName (String firstName)
      {
            if (firstName == null)
            {
                  throw new IllegalArgumentException(" Name should not be null, include a name please :) ");
            }
            else 
            {
                  this.firstName = firstName;
            }
            
      }

      public void setLastName (String lastName)
      {
            if (lastName == null)
            {
                  throw new IllegalArgumentException(" Name should not be null, include a name please :) ");
            }
            else 
            {
                  this.lastName = lastName;
            }
      }

      public void setsalary (double salary)
      {
            if (salary >= 0)
            {
                  this.salary = salary;
            }
            else if (salary < 0)
            {
                  throw new IllegalArgumentException("Salary shouldn't be in the negatives");
            }
            else
            {
                  throw new IllegalArgumentException("Error 404");
            }

            
      }

      public Employee (String firstname, String lastname, double salary)
      {
            this.firstName = firstname;
            this.lastName = lastname;
            this.salary = salary;
            this.id = currentId;
            currentId++;
      }

      public Employee (String firstname, String lastname)
      {
            this.firstName = firstname;
            this.lastName = lastname;
            this.salary = 1000;
            this.id = currentId;
            currentId++;
      }

      @SuppressWarnings("override")
      public String toString()
      {
            return String.format("[%d] %s: %.2f", this.id, getName(), this.salary);
      }

      

}
