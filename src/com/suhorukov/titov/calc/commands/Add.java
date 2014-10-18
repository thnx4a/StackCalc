package com.suhorukov.titov.calc.commands;

import com.suhorukov.titov.calc.Command;

import java.util.Map;
import java.util.Stack;

/**
 * Created by demo3 on 18.10.14.
 */
public class Add implements Command {
    @Override
    public void execute(Stack<Double> stack, Map<String, Double> defines, String[] arg) {
        if (stack.size() >= 2) {
            Double result = stack.pop() + stack.pop();
            stack.push(result);
        }
    }
}
