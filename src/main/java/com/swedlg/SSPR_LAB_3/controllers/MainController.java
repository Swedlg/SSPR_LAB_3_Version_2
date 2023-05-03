package com.swedlg.SSPR_LAB_3.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @PostMapping("/sum")
    public ResponseEntity<String> calculateSum(@RequestParam String first_number,
                               @RequestParam String second_number,
                               Model model) {
        double result = Double.parseDouble(first_number) + Double.parseDouble(second_number);
        return new ResponseEntity<>( String.valueOf(result), HttpStatus.OK);
    }

    @PostMapping("/subtraction")
    public ResponseEntity<String> calculateSubtraction(@RequestParam String first_number,
                                       @RequestParam String second_number,
                                       Model model) {
        double result = Double.parseDouble(first_number) - Double.parseDouble(second_number);
        return new ResponseEntity<>( String.valueOf(result), HttpStatus.OK);
    }

    @PostMapping("/multiplication")
    public ResponseEntity<String> calculateMultiplication(@RequestParam String first_number,
                                          @RequestParam String second_number,
                                          Model model) {
        double result = Double.parseDouble(first_number) * Double.parseDouble(second_number);
        return new ResponseEntity<>( String.valueOf(result), HttpStatus.OK);
    }

    @PostMapping("/division")
    public ResponseEntity<String> calculateDivision(@RequestParam String first_number,
                                    @RequestParam String second_number,
                                    Model model) {
        double result = Double.parseDouble(first_number) / Double.parseDouble(second_number);
        return new ResponseEntity<>( String.valueOf(result), HttpStatus.OK);
    }
}
