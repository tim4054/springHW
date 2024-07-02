package me.nugumanov.springhw.controler;

import me.nugumanov.springhw.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String getHello() {
        return "Добро пожаловать";
    }

    @GetMapping(path = "/calculator/plus")
    public String getSummary(@RequestParam(value = "num1", required = false) Integer num1,
                             @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Отсутствует параметр";
        }
        int result = calculatorService.getSummary(num1, num2);
        return num1 + "+" + num2 + "=" + result;
    }

    @GetMapping(path = "/calculator/minus")
    public String getSubtraction(@RequestParam(value = "num1", required = false) Integer num1,
                                 @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Отсутствует параметр";
        }
        int result = calculatorService.getSubtraction(num1, num2);
        return num1 + "-" + num2 + "=" + result;
    }

    @GetMapping(path = "/calculator/multiply")
    public String getMultiply(@RequestParam(value = "num1", required = false) Integer num1,
                              @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Отсутствует параметр";
        }
        int result = calculatorService.getMultiply(num1, num2);
        return num1 + "*" + num2 + "=" + result;
    }

    @GetMapping(path = "/calculator/divide")
    public String getDivision(@RequestParam(value = "num1", required = false) Integer num1,
                              @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Отсутствует параметр";
        }
        if (num2 == 0) {
            return "Нельзя делить на ноль";
        }
        int result = calculatorService.getDivision(num1, num2);
        return num1 + "/" + num2 + "=" + result;
    }
}

