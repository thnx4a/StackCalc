package com.suhorukov.titov.calc;

import com.suhorukov.titov.calc.commands.Push;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by demo3 on 18.10.14.
 */
public class CalcText extends TestCase {

    public void testPush(){
        Push push = new Push();
        Stack<Double> stack = new Stack<>();
        Map<String, Double> defines = new HashMap<>();

        push.execute(stack,defines,new String[]{"PUSH", "120"});
        assertEquals(1, stack.size());


    }
}
