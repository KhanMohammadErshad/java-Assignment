package fourthweek;

public class Father
{
    String name="khan Mohammad";
    public void showName(String name)
    {
        if(name.equals("khan"))
            System.out.println(name);
    }
    public int showName(int name)
    {
        return name;
    }
    public void show()
    {
        System.out.println("Hi someone");
    }
}
class Child extends Father
{
    String name="khan";
    public void show()
    {
        super.show();
        System.out.println("Hi I am Khan Mohammad");
    }
}
class SubChaild extends Child
{

}
