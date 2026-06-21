package com.example.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class EmployeeController {

    // In-memory storage (ArrayList)
    List<Employee> list = new ArrayList<>();

    // Home page - view all employees
    @GetMapping("/")
    public String viewHome(Model model) {
        model.addAttribute("employees", list);
        return "view";
    }

    // Show add form
    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "add";
    }

    // Save employee
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee emp) {
        list.add(emp);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
public String deleteEmployee(@PathVariable int id) {
    list.removeIf(e -> e.getId() == id);
    return "redirect:/";
}

}