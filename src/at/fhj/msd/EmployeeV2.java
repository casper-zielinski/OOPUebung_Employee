package at.fhj.msd;

public final class EmployeeV2 {
      private static int currentId = 1;
      private String firstName;
      private String lastName;
      private int id;
      private Salary salary;
      private int years = 0;

      public EmployeeV2(String firstName, String lastName, Salary salary)
      {
            this.setfirstName(firstName);
            this.setLastName(lastName);
            this.salary = salary;
            this.id = currentId++;
            this.years = 0;
        
      }

      public EmployeeV2(String firstName, String lastName, double salary)
      {
            this(firstName, lastName, new Salary(salary));
      }
      
      public int getId()
      {
            return this.id; 
      }

      public double getSalary()
      {
            return this.salary.getbaseValue();
      }

      public String getName() 
      {
          return lastName.toUpperCase() + " " + firstName;
      }

      public int getyears()
      {
            return this.years;
      }

      //setter methods

      public void setfirstName (String firstName)
      {
            if (firstName.isBlank())
            {
                  throw new IllegalArgumentException(" Name should not be blank, include a name please :) ");
            }
            else 
            {
                  this.firstName = firstName;
            }
            
      }

      public void setLastName (String lastName)
      {
            if (lastName.isBlank())
            {
                  throw new IllegalArgumentException(" Name should not be blank, include a name please :) ");
            }
            else 
            {
                  this.lastName = lastName;
            }
      }



      public void setyears(int years)
      {

            if (years < 0)
            {
                  throw new IllegalArgumentException("Years can't be negative");
            }
            else 
            {
                  this.years = years;
            }
      }

      public double currentSalaryValue()
      {
            return this.salary.currentValue(this.years);
      }

       @SuppressWarnings("override")
      public String toString()
      {
             return String.format("[%d] %s, %d: %.2f", this.id, getName(),this.years, this.currentSalaryValue());
      }  

      
}
