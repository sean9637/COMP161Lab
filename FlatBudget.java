/** COMP161 Lab02 
  * FlatBudget.java
  * 
  * This class calculates the weekly donation to the flat account required from each person
  * There by each vaiable is to be divided by 4 or numberInFlat
 */
public class FlatBudget{
   public static void main(String[]args){
      int numberInFlat = 4;                  // number of people sharing the total cost
      String MONTH = "March 2021";           // String description of this month
      int numDays = 31;                      // number of days in this month
      double numWeeksInMonth = numDays/7.0;  // number of weeks in this month
      double groceriesWeekly = 210.0;        // grocery expenses
      double servicesMonthly = 279.0;        // power internet expenses
      double rentFortnightly = 824.0;        // rent expenses
      double servicesWeekly =  servicesMonthly / numWeeksInMonth;
      double rentWeekly = rentFortnightly/2;
          
      double expensesTotalPerWeek = groceriesWeekly + servicesWeekly + rentWeekly;
      double eachPersonPerWeek = expensesTotalPerWeek/numberInFlat;
      
      //print statements
      System.out.println("The total expenses per week is " + expensesTotalPerWeek);
      
      
    
   
    
   }
}