package Com.EmployeeCrud.EmployeeService;

import java.util.List;
import Com.EmployeeCrud.EmployeeModel.Employee;
public interface EmployeeService 
{
	public int add(Employee employee);
	public List<Employee> findAll();
	public Employee findById(int id);
	public String delete(int id);
	public String update(Employee employee);
	


}
