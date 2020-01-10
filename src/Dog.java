public class Dog

{

    public void putAge()

    {
        int ag = 0; //local variable
        String ab = "hello"
        //System.out.println("Dog age is : " + ab);
        ag = ag + 6;
        System.out.println("Dog age is : " + ag);
    }

    public static void main(String args[]){

        Dog d = new Dog();
        d.putAge();

    }

}
