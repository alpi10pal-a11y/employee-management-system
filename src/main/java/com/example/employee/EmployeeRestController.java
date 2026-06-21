package com.example.employee;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

    List<Employee> list = new ArrayList<>();

    // GET - all employees
    @GetMapping
    public List<Employee> getAll() {
        return list;
    }

    // POST - add employee
    @PostMapping
    public String add(@RequestBody Employee emp) {
        list.add(emp);
        return "Employee Added";
    }

    // PUT - update employee
    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody Employee emp) {
        for (Employee e : list) {
            if (e.getId() == id) {
                e.setName(emp.getName());
                e.setRole(emp.getRole());
                return "Updated";
            }
        }
        return "Not Found";
    }

    // DELETE - delete employee
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        list.removeIf(e -> e.getId() == id);
        return "Deleted";
    }
}