# Description
<span style="color:green; font-size:20px"><b>
This programm is here to write down employee names, salayries and give them automatically an ID.</b>
</span>

## Guidance

>The ``Employee.java`` Class has two Constructors, where on only wants a **Firstname:String** and a **Lastname:String**, the Other also wanst a **Salary:Double** (The other Constructor has a predefined salary). They all have getter and setter Methods for their attributes (The Constructor who doesn't receive a salary also has a getter and setter for the salary attribute). They also have an **id** Attribute which is not changeable and increases per Employee Object made (So the first Employee has the id 1, the second 2 and so on). Also a ``toString()`` Method which returns a String in this Form: [id] Lastname(in UpperCase) Firstname: Salary <br> Example: *[2] LASLEY Huey: 2000,00*
<br>

>The ``Salary.java`` Class has also two Constructors, one where you give it a **baseValue:doble** and a **increase:Double**, the other only wants the baseValue attribute and has a predefined ``DEFAULT_INCREASE = 0.15:Double`` attribute. Like the ``Employee.java`` it also has setters and getters for all Methods and a ``currentValue(int years)`` Method, which is taking the years and the increase value and returns the double value of the salary after **years:int** with each year the value increasing by **increase:Double** (the Increase is in Decimal, so 0.2 is a 20% increase). The increase value in the other contructor is set to 0.15, so a 15% increase.

>The ``EmployeeV2.java`` Class is very similar to the ``Employee.java`` Class, but it includes Elements from the Salary Class, you can now check your salary after a by you set of years, with an Deafult increase of 15%

## Features

 [X] getter and setter methods to change the values and to read/print them.
 [X] a toString Method, that returns all information about the employe at once.
 [X] A Method to save salaries over the years

## Commits

1. initial commit, added java classes, gitignore and pushed repository.

2. gettermethods, created getter methods for the member variables.

3. setandconst, settermethods and 2 constructors with an id that increase each time a new object is created 

4. extension1, 1 extension of the exercise: toString Method added (Described above)

5. Finalcommit, 2 extension and last, saves salaries and can calcute with them your current salary with years and increase per year etc.

## Links

> Link to my GitHub: [My Github](https://github.com/casper-zielinski)<br>
> Link to the Exercise: [https://git-iit.fh-joanneum.at/iit-prog/java1/exercises/-/tree/main/10_oop/employee](https://git-iit.fh-joanneum.at/iit-prog/java1/exercises/-/tree/main/10_oop/employee)
>Link to my Lecturer: [Gitlab](https://git-iit.fh-joanneum.at/schwabha)
