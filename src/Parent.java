
public class Parent
{
    public int key = 11;
    int primarykey = 13;
    private int privatekey = 15;
    protected int protectedkey =16;

    private int add()
    {
        return key+primarykey;
    }

    public int showme()
    {
        //int add =p.add();
        return privatekey;

    }

    public static void main(String[] args) {
        Parent p = new Parent();

    }
}
