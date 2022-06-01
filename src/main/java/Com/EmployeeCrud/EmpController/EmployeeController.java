package Com.EmployeeCrud.EmpController;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.EmployeeCrud.EmployeeModel.Employee;
import Com.EmployeeCrud.EmployeeService.EmployeeService;

@RestController
public class EmployeeController
{
	EmployeeService employeeservice;
	@GetMapping("/test")
	public String test() {
		return "Test App";
	}
	@PostMapping("/add")
	public int addemp(@RequestBody Employee employee) {
	
		return employeeservice.add(employee);
	}

	
}
