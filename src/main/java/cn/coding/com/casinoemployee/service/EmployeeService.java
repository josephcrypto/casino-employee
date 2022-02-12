package cn.coding.com.casinoemployee.service;


import cn.coding.com.casinoemployee.entity.Employee;
import cn.coding.com.casinoemployee.entity.paging.Paged;
import cn.coding.com.casinoemployee.entity.paging.Paging;
import cn.coding.com.casinoemployee.exception.UserNotFoundException;
import cn.coding.com.casinoemployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee getById(Integer id) throws UserNotFoundException {
        Optional<Employee> result = employeeRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        throw new UserNotFoundException("Employee not found with ID " + id);
    }

    public void deleteById(Integer id) throws UserNotFoundException {
        Long count = employeeRepository.countById(id);
        if (count == null || count == 0) {
            throw new UserNotFoundException("Employee not found with ID " + id);
        }
        employeeRepository.deleteById(id);
    }

    public Paged<Employee> getEmployeeWithPaginated(int pageNumber, int size) {
        PageRequest request = PageRequest.of(pageNumber - 1, size, Sort.Direction.ASC, "id");
        Page<Employee> employeePage = employeeRepository.findAll(request);
        return new Paged<>(employeePage, Paging.of(employeePage.getTotalPages(), pageNumber, size));
    }

    public List<Employee> listAllEmployee() {
        return (List<Employee>) employeeRepository.findAll();
    }
}
