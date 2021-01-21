//Class Employee: subclass of Person

public class Employee extends Person {

    private double payRate;    

    private double hoursWorked;

    private String department;

   

    public final int HOURS = 40;

    public final double OVERTIME = 1.5;

   

     //default constructor

     public Employee() {

        super();
        payRate = 0;
        hoursWorked = 0;
        department = "unspecified";

     }

     public Employee( String first, String last, double payRate, double hoursWorked, String department ) {
        super( first, last );
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
     }

 

     //add an alternate constructor with parameters

    public Employee( String first, String last, String department, double payRate ) {
        this( first, last, payRate, 0, department );
    }

    

     public String toString() {

         //should return a String like this:

         //The wages for xxxx from the xxxx department are: $xxxxx.xx"

        return "The wages for " + super.toString() + "from the " + department + " department are " + calculatePay();

     }

 

     public void print() {

       //Should print output like this (same line):

       //The employee xxxx from the xxxx department worked xx hours

       //with a pay rate of $xxx.xx. The wages for this employee are $xxxxx.xx

       System.out.println( "The employee " + super.toString() + " worked " + hoursWorked + " hours with a pay rate of " + payRate + ". The wages for this employee are " + calculatePay() );

     }

 

    

     public double calculatePay() {

        //Method to calculate and return the wages

        //handle both regular and overtime pay
        if (hoursWorked <= HOURS) {
            return (double) hoursWorked * payRate;
        } 
        return ( double ) HOURS * payRate + ( ( double ) ( hoursWorked - HOURS ) * payRate * OVERTIME );
 

     }

 

 

     public void setAll(String first, String last, double rate, double hours, String dep){

         super.setName( first, last );
         payRate = rate;
         hoursWorked = hours;
         department = dep;

     }

 

     public double getPayRate() {

         return payRate;
     }

 

    

     public double getHoursWorked() {

         return hoursWorked;

     }

    

    

     public String getDepartment() {

         return department;

     }

    

     public boolean equals( Object o ) {

       if( o instanceof Employee ) {
        Employee emp = ( Employee ) o; 
        return (emp.getPayRate() == this.getPayRate() ) && ( emp.getHoursWorked() == this.getHoursWorked() ) && this.getDepartment().equals( emp.getDepartment()) && super.equals(o);
       }
       return false;

     }

    

     public Employee getCopy() {

       return new Employee(getFirst(), getLast(), payRate, hoursWorked, department);

     }

    

     public void copy(Employee e) {

       super.copy( e );
       department = e.getDepartment();
       hoursWorked = e.getHoursWorked();
       payRate = e.getPayRate();

     }

      

}