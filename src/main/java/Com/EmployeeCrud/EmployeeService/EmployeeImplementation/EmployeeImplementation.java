package Com.EmployeeCrud.EmployeeService.EmployeeImplementation;

import java.util.ArrayList;
import java.util.List;

import Com.EmployeeCrud.EmployeeModel.Employee;
import Com.EmployeeCrud.EmployeeService.EmployeeService;

public class EmployeeImplementation implements EmployeeService 
{
public List<Employee> employees = new ArrayList<Employee>();
	
	public EmployeeImplementation () {
		employees.add(new Employee(1, "Raj", 25000));
		employees.add(new Employee(2,"Sai",3500));
	}
		@Override

		public int add(Employee employee) {
			employees.add(employee);
			return employee.getEmpid();
		}

		@Override
		public List<Employee> findAll() {
			return employees;
		}

		@Override
		public Employee findById(int id) {
			Employee findEmployeeById = null;
			for (Employee employee : employees) {
				if (employee.getEmpid() == id) {
					findEmployeeById = employee;
				}
			}
			return findEmployeeById;
		}

		@Override
		public String delete(int id) {
			String deleteStatus = "";
			for (Employee employee : employees) {
				if (employee.getEmpid() == id) {
					employees.remove(employee);
					deleteStatus = "Deleted successfully";
				} else {
					deleteStatus = "Not found book";
				}
			}
			return deleteStatus;
		}

		@Override
		public String update(Employee employee) {
			for (Employee empUpdate : employees) {
				if (employee.getEmpid() == empUpdate.getEmpid()) {
					int empIndex = employees.indexOf(empUpdate);
					empUpdate.setEmpname(employee.getEmpname());
					empUpdate.setEmpname(employee.getEmpname());

					employees.add(empIndex, employee);

					return "Employee details  updated successfully";
				} else {
					return "Employee details  not found to update";
				}
			}
			return null;
		}
		
	}

	
	
	

	
	

	


	

	

