public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage.");
        int FULL_TIME_EMP = 1;

        double emp_check = Math.floor(Math.random()*10 % 2);
        if(FULL_TIME_EMP == emp_check)
            System.out.println("Employee are present");
        else
            System.out.println("Employee are not present");
    }
}
