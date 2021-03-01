package com.way.hackerRank;

public class Parser {
	int top=-1;
    char[] stack = new char[10];
    public boolean isBalanced(String a){
        char[] arr = new char[a.length()];
        arr = a.toCharArray();
        for(int i=0 ; i< arr.length ;i++){
            switch(arr[i]){
                case '{' : push(arr[i], arr.length);
                            break;
                case '(' :  push(arr[i], arr.length);
                            break;
                case '[' : push(arr[i], arr.length);
                            break;
                case '}' : 
                            if(stack[top] == '{'){
                                pop();
                            }else{
                                push(arr[i], arr.length);
                            }
                            break;
                case ')' : if(stack[top] == '('){
                                pop();
                            }else{
                                push(arr[i], arr.length);
                            }
                            break;
                case ']' : if(stack[top] == '['){
                                pop();
                            }else{
                                push(arr[i], arr.length);
                            }
                            break;
            }
        }
        
        if(top == -1)
            return true;
        return false;
    }
    void push(char a, int length){
        if(!overflow(length)){
            top = top + 1;
            stack[top] = a;
        }else{
            System.out.println("OverFlow");
        }
        
    }

    char pop(){
        if(!underflow()){
            char a = stack[top];
            //System.out.println(a);
            top = top - 1;
            return a;
        }  
        else{
            System.out.println("OverFlow");
        }
        return '0';
    }

    boolean overflow(int length){
        if(top == length -1 )
            return true;
        return false;
    }

    boolean underflow(){
        if(top == -1)
            return true;
        return false;
    }
}
