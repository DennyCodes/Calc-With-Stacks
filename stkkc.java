public class Stack {

    static final int MAX = 1000;
    private int top; // Index of the topmost element
    private int[] stack; // Maximum size of Stack
    protected int length;
    
    public Stack(int m) {
        //MAX = m;
        stack = new int[m];
        top = 0;
        length = 0;

    }

    public boolean findElement(int Paran) {
        for (int i = 0; i < this.stack.length; i++) {
            if (stack[i] == Paran) {
                return true;
            }

        }
        return false;
    }

    /**
     * Returns true if the stack is empty
     **/
    public boolean isEmpty() {
        if (this.stack.length == 0) {
            return true;
        }
        return false;
    }

    /**
     * Pushes data onto the stack
     **/
    public void push(int data) {
        if (top < MAX) {
            stack[top] = data;
            top += 1;
            length+=1;

            //System.out.println("full stack");
        } else {
            throw new OverflowException();
        }

    }

    public int le() {
        return stack.length;
    }

    /**
     * Removes topmost item from the stack & returns its value
     **/
    public int pop() {
        if (top <= 0) {
            throw new UnderflowException();
        }
        top -= 1;
        length-=1;
        int s = stack[top];
        //stack[top] = null;

        return s;
    }

    /**
     * Returns value of topmost item on the stack
     **/
    public int peekEnd() {
        if (this.stack.length < 1) {
            return stack[this.stack.length - 1];
        }
        return -1;
    }

    public int peekE() {
        if (this.stack.length < 2) {
            return stack[this.stack.length - 2];
        }
        return -1;
    }
    public int peek () {
        return this.stack[top];
    }
        //@Override
    public String toString () {
        String s = "";
        for (int i = 0; i < top; i++) {
            s += stack[i];
            s += ", ";
        }
        return s;
    }

}
