/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.undo_feature_simulation;




import java.util.Scanner;
import java.util.Stack;

public class Undo_Feature_Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> actions = new Stack<>();

        while (true) {
            System.out.println("Enter an action (type 'undo' and 'exit' to stop):");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            } else if (input.equalsIgnoreCase("undo")) {
                if (!actions.isEmpty()) {
                    String undoneAction = actions.pop();
                    System.out.println("You undid: \"" + undoneAction + "\"");
                } else {
                    System.out.println("No actions to undo!");
                }
            } else {
                actions.push(input);
                System.out.println("Action recorded: \"" + input + "\"");
            }
        }

        scanner.close();
    }
}
