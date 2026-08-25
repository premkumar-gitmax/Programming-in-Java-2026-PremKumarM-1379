class StaticKeyword
{
    static void show()
    {
        System.out.println("Base class");
    }
}
class Derived extends StaticKeyword
{
    static void show()
    {
        System.out.println("Derived class");
    }
    public static void main(String[] args)
    {
     
     StaticKeyword.show();
     Derived.show();
    
    }
}
