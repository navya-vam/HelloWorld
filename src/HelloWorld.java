/* This is a simple Java program. 
   FileName : "HelloWorld.java".
   hii
   hello
 */
class HelloWorld 
{ 
    // Your program begins with a call to main(). 
    // Prints "Hello, World" to the terminal window. 
    public static void main(String args[]) 
    { 
         int target = -5;
         int num = 3;

         target = -num; // Compliant; intent to assign inverse value of num is clear
         target += num;
         System.out.println(target);
    } 
} 
