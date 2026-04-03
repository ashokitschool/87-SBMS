package in.ashokit.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repo.AddressRepo;
import in.ashokit.repo.EmployeeRepo;

@Service
public class EmpService {

	@Autowired
	private EmployeeRepo empRepo;

	@Autowired
	private AddressRepo addrRepo;

	public void saveEmpWithAddresses() {

		Address a1 = new Address();
		a1.setCity("Hyd");
		a1.setState("TG");
		a1.setType("Present");

		Address a2 = new Address();
		a2.setCity("Guntur");
		a2.setState("AP");
		a2.setType("Permanent");

		Employee e = new Employee();
		e.setEmpName("Ashok");
		e.setEmpSalary(10000.00);

		// association mapping
		a1.setEmp(e);
		a2.setEmp(e);

		e.setAddr(Arrays.asList(a1, a2));

		empRepo.save(e);

	}

	public void getEmpById(Integer id) {
		empRepo.findById(id);
	}

}
