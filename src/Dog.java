public class Dog

{

    public void putAge()

    {
        int age = 0; //local variable
        age = age + 6;
        System.out.println("Dog age is : " + age);
    }

    public static void main(String args[]){

        Dog d = new Dog();
        d.putAge();

    }

}
