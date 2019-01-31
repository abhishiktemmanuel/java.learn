class reccour
{
    int fun(int count)
    {
        System.out.println(count);
        if (true)
        {
            fun(fun(fun(fun(++count))));
        }
        return count;
    }
    void main()
    { 
        System.out.println(fun(1));
    }
}