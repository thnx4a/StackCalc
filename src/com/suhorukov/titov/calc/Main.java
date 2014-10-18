package com.Suhorukov.Titov.calc;

import com.suhorukov.titov.calc.Command;
import com.suhorukov.titov.calc.commands.Add;
import com.suhorukov.titov.calc.commands.Define;
import com.suhorukov.titov.calc.commands.Print;
import com.suhorukov.titov.calc.commands.Push;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        Map<String, Double> defines = new HashMap<>();
        Map<String, Command> commands = new HashMap<>();
        commands.put("PUSH", new Push());
        commands.put("ADD", new Add());
        commands.put("PRINT", new Print());
        commands.put("DEFINE", new Define());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            String calcArgs[] = line.split(" ");

            if (calcArgs.length == 0) {
                continue;
            }

            Command cmd = commands.get(calcArgs[0]);

            if (cmd == null) {
                System.out.println("Unknown command: " + calcArgs[0]);
                continue;
            }

            cmd.execute(stack, defines, calcArgs);
        }
    }
}
