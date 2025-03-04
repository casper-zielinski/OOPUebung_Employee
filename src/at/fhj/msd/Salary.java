package at.fhj.msd;

public final class Salary {

      private double baseValue;
      private double increase;
      private static final double DEFAULT_INCREASE = 0.15;

      public Salary(double baseValue, double increase)
      {
            this.setbaseValue(baseValue);
            this.setincrease(increase);

      }

      public Salary(double baseValue)
      {
            this(baseValue, DEFAULT_INCREASE);
      }

      public double getbaseValue()
      {
            return this.baseValue;
      }

      public double getincrease()
      {
            return this.increase;
      }

      public void setbaseValue (double baseValue)
      {
            if (baseValue < 0)
            {
                  throw new IllegalArgumentException("Value should not be negative");
            }
            else
            {
                  this.baseValue = baseValue;
            }
           
      }

      public void setincrease (double increase)
      {
            if (increase > 0 && increase <= 1)
            {
                  this.increase = increase;
            }
            else 
            {
                  throw new IllegalArgumentException("Value should be between 0 and 1 (0 excluded)");
            }
            
      }

      public double currentValue (int years)
      {
            return this.baseValue * Math.pow((1 + increase), years);
      }


      

      


}
