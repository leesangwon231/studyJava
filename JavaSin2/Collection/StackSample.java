package JavaSin2.Collection;

import java.util.Stack;

public class StackSample {
    

    public static void main(String[] args) {
        StackSample s = new StackSample();
        s.chkecPop();

    }


    public void chkecPeek(){
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack.peek());
        }

        System.out.println(stack.size());
    }

    public void chkecPop(){
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack.pop());
            System.out.println(stack.size());
        }

    }
}
