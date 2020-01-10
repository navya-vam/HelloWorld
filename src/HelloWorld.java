/* This is a simple Java program. 
   FileName : "HelloWorld.java".
   hii
   hello
 */
TODO
class HelloWorld 
{ 
    // Your program begins with a call to main(). 
    // Prints "Hello, World" to the terminal window. 
    public static void main(String args[]) 
    { 
        String data = "this is amazing /* comment */ more data ";
        Pattern pattern = Pattern.compile("/\\*.*?\\*/");

    Matcher matcher = pattern.matcher(data);
    while (matcher.find()) {
        // Indicates match is found. Do further processing
        System.out.println(matcher.group());
    
    } 
} 
