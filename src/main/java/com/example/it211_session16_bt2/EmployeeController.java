package com.example.it211_session16_bt2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1L, "Nguyen Van An", 15000000.0),
                new Employee(2L, "Tran Thi Bich", 18500000.0),
                new Employee(3L, "Le Minh Duc", 22000000.0)
        );
    }
}
