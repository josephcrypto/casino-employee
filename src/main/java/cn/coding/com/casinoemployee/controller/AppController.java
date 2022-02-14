package cn.coding.com.casinoemployee.controller;

import cn.coding.com.casinoemployee.entity.Employee;
import cn.coding.com.casinoemployee.exception.UserNotFoundException;
import cn.coding.com.casinoemployee.repository.EmployeeRepository;
import cn.coding.com.casinoemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AppController {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("employee/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee/signup_form";
    }

    @PostMapping("/employee/save")
    public String saveEmployee(Employee employee, RedirectAttributes redirectAttributes) {
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message", "New Employee Register Successfully");
        return "redirect:/employee/list";
    }

    @PostMapping("employee/process_register")
    public String processRegister(Employee employee, RedirectAttributes redirectAttributes) {
        repository.save(employee);
        return "redirect:/employee/employee-list";
    }

    @GetMapping("employee/list")
    public String listEmployees(@RequestParam(value = "pageNumber", required = false, defaultValue = "1") int pageNumber,
                                @RequestParam(value = "size", required = false, defaultValue = "5") int size, Model model){
        model.addAttribute("listEmployees",employeeService.getEmployeeWithPaginated(pageNumber, size));
        return "employee/employee-list";
    }

    @GetMapping("employee/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model,RedirectAttributes redirect) {
        try {
            Employee employee = employeeService.getById(id);
            model.addAttribute("employee", employee);
            return "employee/signup_form";
        } catch (UserNotFoundException e) {
            redirect.addFlashAttribute("message", e.getMessage());
            return "redirect:/employee/list";
        }
    }
}
