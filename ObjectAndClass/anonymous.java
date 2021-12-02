public class anonymous {
    void fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial answer is"+fact);
    }
    public static void main(String args[])
    {
        new anonymous().fact(5);
    }
}
