package listinterface;
import java.util.*;
public class NthElementFromEnd {


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int N = 3;
        Stack<String>st=new Stack<>();
       for(String e  : list){
           st.push(e);
       }
       int i=0;
        while (i<N-1){
            st.pop();
            i++;

        }
        System.out.print(st.peek());
    }
}



