import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
     
       
      while (sc.hasNext()) {
         String input=sc.next();
          char[] input1 = input.toCharArray();
           Stack<Character> stack = new Stack<>();
            //Complete the code
          for(char in :input1){
          if(in=='{' || in=='['){
              stack.push(in);
          }
          if(in=='}' || in==']')
          {
              if((stack.peek()=='{' && in=='}') || (stack.peek()=='[' && in==']'))
              stack.pop();
              else
                  stack.push(in);
          }
          }
          if(stack.empty())
          System.out.println(true);
       else
           System.out.println(false);
      }
       
      
   }
}
