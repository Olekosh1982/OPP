package lesson_34.accounting;

public class Company {

    private Employee[] employees;
    private int companySize ;
    private Employee employee;

    public Company(int capacity) {
        employees = new Employee[capacity];
        this.companySize = 0;
    }


    public boolean addEmployee(Employee employee){
        if(companySize < employees.length){
            employees[companySize] = employee;
            companySize++;
            return true;
        }
        return false;
    }

    public boolean removeEmployee(Employee employee){
        for (int i = 0; i < companySize; i++) {
            if(employees[i].equals(employee)){
                employees[i] = employees[companySize-1];
                companySize--;
                return true;
            }
        }
        return false;
    }
    public void allEmployees(){
        for (int i = 0; i < companySize; i++) {
            System.out.println(employees[i]);
        }
    }

    public double allSalary(){
        double result = 0;
        for (int i = 0; i < companySize; i++) {
            result += employees[i].salary();
        }
        return result;
    }



}
