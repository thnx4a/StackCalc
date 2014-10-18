package com.suhorukov.titov.calc.commands;

import com.suhorukov.titov.calc.Command;

import java.util.Map;
import java.util.Stack;

/**
 * Created by demo3 on 18.10.14.
 */
public class Push implements Command {
    @Override
    public void execute(Stack<Double> stack, Map<String, Double> defines, String[] arg) {
        Double val;
        try {
            val = new Double(arg[1]);
        } catch (NumberFormatException e) {
            val = defines.get(arg[1]);
            if (val == null) {
                throw e;
            }

        }

        stack.push(val);
    }
}