package dslab4;

class Stack {
	int maxSize;
    int top;
    char[] stk;

    Stack(int size) {
        maxSize = size;
        stk = new char[maxSize];
        top = -1;
    }

     boolean isEmpty() {
        return (top == -1);
    }

     boolean isFull() {
        return (top == maxSize - 1);
    }
     
//Push function
     void push(char item) {
        if (isFull()) {
            System.out.println("Stack overflow!");
            return;
        }
        stk[++top] = item;
    }
     
//Pop function
     char pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return '\0'; // Return default character for error handling.
        }
        return stk[top--];
    }
//Presence of operator
    boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' );
    }
//Performing Operations
    int Operation(int op1, int op2, char operator) {
        switch (operator) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                if (op2 != 0) {
                    return op1 / op2;
                } else {
                    System.out.println("Division by zero.");
                    System.exit(1);
                }
            default:
                System.out.println("Invalid operator: " + operator);
                System.exit(1);
                return 0;
        }
    }
    
    void evaluate(String exp) {
   	 Stack stack = new Stack(exp.length());

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            
            if (ch == '=') {
                break; // Exit the loop when '=' occurs.
            }
            else if (Character.isDigit(ch)) {
                stack.push(ch);
            }
             else if (isOperator(ch)) {
                if (stack.isEmpty()) {
                    System.out.println("Invalid expression.");
                    return;
                }
                int operand2 = stack.pop() - '0';
                
                //'0' converts character into integer.
                if (stack.isEmpty()) {
                    System.out.println("Invalid expression.");
                    return;
                }
                int operand1 = stack.pop() - '0';

                int result = Operation(operand1, operand2, ch);
                stack.push((char) (result + '0'));
                System.out.println("Intermediate result: " + result);
            } else {
                System.out.println("Invalid character in expression : " + ch);
                
            }
        }

        if (!stack.isEmpty()) {
            int output = stack.pop() - '0';
            System.out.println("The final result of the expression is: " + output);
        } else {
            System.out.println("Invalid expression.");
        }
   }
    
//Reversing the expression.
   void reverse(String str) {
       Stack stack = new Stack(str.length());

       for (int i = 0; i < str.length(); i++) {
           stack.push(str.charAt(i));//input char in stack
       }

       while (!stack.isEmpty()) {
           System.out.print(stack.pop());//remove all the elements.
       }
       System.out.println();
   }
}