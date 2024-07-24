// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        //System.out.println("Enter username");
        //String userName = myObj.nextLine();
        //Stack stk = new Stack(1000);
        ArrayList<Integer> stk = new ArrayList<>();
        String firstNum;
        String secondNum;
        String operation;
        String user;

        //String full = firstNum + " " + secondNum + " " + operation + " " + user;
        System.out.print("Enter: ");
        String full = e.nextLine();
        //for (full.charAt(0) != '+' || full.charAt(0) != '-' || full.charAt(0) != '/'|| full.charAt(0) != '*' || full.charAt(0) != '%') { 
        stk.add(10);
        stk.add(5);
        stk.add(3);
        stk.add(1);
        System.out.println(stk);
        System.out.println(stk.size());
        do {
          
          //for (int i = 0; i<full.length(); i++) {
            if (full.charAt(0) == '?') {
              System.out.println(stk);
              break;
            }
            else if (full.charAt(0) == '+' || full.charAt(0) == '-' || full.charAt(0) == '/'|| full.charAt(0) == '*' || full.charAt(0) == '%') {
              int n = stk.get(stk.size()-1);
              int b = stk.get(stk.size()-2);
              int result;
              if (full.charAt(0) == '+') {
                   result = n + b;
                   System.out.println(n);
              }
              else if (full.charAt(0) == '-') {
                  result = n - b;
              }
              else if (full.charAt(0) == '*') {
                  result = n * b;
              }
              else if (full.charAt(0) == '/') {
                  result = n / b;
              }
              else {
                  result = n % b;
              }
              if (stk.size() == 2 ) {
                stk.remove(stk.size()-1);
                stk.add(result);
                stk.remove(stk.size()-2);
              }
              else if (stk.size() == 1) {
                System.out.println("no can do");
              }
              else {
                stk.remove(stk.size()-1);
                stk.remove(stk.size()-2);
                stk.add(result);
              }
              System.out.println(stk);
              System.out.print("Enter: ");
              full = e.nextLine();
            }
            else {
              String[] o = full.split(" ");
              
              int n = Integer.valueOf(o[0]);
              //full = full.split();
              int b = Integer.valueOf(o[1]);
              int result;
              //System.out.println(full.charAt(4));
              System.out.println(n);
              //System.out.println(b);
              System.out.println(o[2]);
              if (o[2].equals("+")) {
                  System.out.println(o[2]);
                  result = n + b;
                   //System.out.println(n);
              }
              else if (o[2].equals("-")) {
                  result = n - b;
              }
              else if (o[2].equals("*")) {
                  result = n * b;
              }
              else if (o[2].equals("/")) {
                  result = n / b;
              }
              else if (o[2].equals("%")){
                  result = n % b;
              }
              else {result = -1;}
              stk.add(result);
              //System.out.println(stk);
              System.out.println(stk);
              System.out.print("Enter: ");
              
              full = e.nextLine();
            
            }
            
          //}
          
        } while (full.charAt(0) != '!');
//         if (full.charAt(0) == '+' || full.charAt(0) == '-' || full.charAt(0) == '/'|| full.charAt(0) == '*' || full.charAt(0) == '%') {
//             if (stk.isEmpty()) {
//                 System.out.println("Empty Stack");
//             }
// //            try {
// //                stk.length
// //            }
// //            catch {
// //                System.out.println("Out of bounds");
// //            }
//             else if (stk.le()<2) {
//                 System.out.println("out of bounds");
//             }
//             else {
                

//             }
//         }
        // else if (full.charAt(0) == '!') {
        //     System.out.println(stk);
        // }
        // // else {
        //     System.out.println("e");
        //     int n = full.charAt(0);
        //     int b = full.charAt(2);
        //     int result;
        //     if (full.charAt(4) == '+') {
        //         result = n + b;
        //         System.out.println(n + b);
        //     }
        //     else if (full.charAt(4) == '-') {
        //         result = n - b;
        //     }
        //     else if (full.charAt(4) == '*') {
        //         result = n * b;
        //     }
        //     else if (full.charAt(4) == '/') {
        //         result = n / b;
        //     }
        //     else {
        //         result = n % b;
        //     }
        //     stk.push(result);
        //     System.out.println(stk);
        // }
    }
}