package cn.coding.com.casinoemployee.repository;

import cn.coding.com.casinoemployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findFirstByName(String name);

    public Long countById(Integer id);


}
