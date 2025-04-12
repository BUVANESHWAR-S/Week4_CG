package Day1.Stack;

import java.util.Stack;


import javax.print.DocFlavor.INPUT_STREAM;


public class pb2 {
    public Stack<Integer> st;


    public pb2(){
        st = new Stack<>();
    }
    public void sort(Stack<Integer> st){
        if(!st.isEmpty()){
            int temp = st.pop();
            sort(st);
            insert_sorted(st, temp);
        }
    }
    public void insert_sorted(Stack<Integer> st, int temp){
        if(st.isEmpty() || st.peek() <= temp){
            st.push(temp);
        }
        else{
            int val = st.pop();
            insert_sorted(st, temp);
            st.push(val);
        }
    }
    public void display(Stack<Integer> st){
        for(int num : st){
            System.out.println(num);
        }
    }


    public static void main(String[] args) {
        pb2 obj1 = new pb2();
        Stack<Integer> stack =new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);
        obj1.display(stack);
        System.out.println("after sorting");
        obj1.sort(stack);
        obj1.display(stack);
    }
}

