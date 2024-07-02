package me.nugumanov.springhw.service;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {
    public int getSummary(int num1, int num2) {
        return (num1 + num2);
    }

    public int getSubtraction(int num1, int num2) {
        return (num1 - num2);
    }

    public int getMultiply(int num1, int num2) {
        return (num1 * num2);
    }

    public int getDivision(int num1, int num2) {
        return (num1 / num2);
    }
}
