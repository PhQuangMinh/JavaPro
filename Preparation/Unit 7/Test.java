/**
 * InnerTest
 */
abstract class A {
 
    void fun(){

    }
}
class B extends A {

}
 
class Test {
 
    public static void main(String args[])
    {
        {
            A b = new B();
            b.fun();
        }
    }
}