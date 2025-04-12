package Day1.Stack;

import java.util.Stack;
import javax.management.RuntimeErrorException;
public class pb1{
    private Stack<Integer> stk1;
    private Stack<Integer> stk2;
    public pb1(){
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }
    public void add(int n){
        stk1.push(n);
    }
    public int remove(){
        if(isEmpty()){
            throw new RuntimeException("queque is empty");
        }
        if(stk2.isEmpty()){
            while (!stk1.isEmpty()) {
                stk2.push(stk1.pop());
            }
        }
        return stk2.pop();
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("queque is empty");
        }
        if(stk2.isEmpty()){
            while (!stk1.isEmpty()) {
                stk2.push(stk1.pop());
            }
        }
        return stk2.peek();
    }
    public boolean isEmpty(){
        return (stk1.isEmpty() && stk2.isEmpty());
    }
    public static void main(String[] args) {
        pb1 obj1 = new pb1();
        obj1.add(2);
        obj1.add(10);
        obj1.add(12);
        obj1.add(24);
        obj1.add(54);
        System.out.println(obj1.remove());
        System.out.println(obj1.peek());
    }
}
