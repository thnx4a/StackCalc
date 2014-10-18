package com.suhorukov.titov.calc;

import java.util.Map;
import java.util.Stack;

/**
 * Created by demo3 on 18.10.14.
 */
public interface Command {
    void execute(Stack<Double> stack,
                 Map<String,Double> defines,
                 String[] arg);

}
