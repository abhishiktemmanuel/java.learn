class calc
{
    void calculate(int x,int y,char ch)
    {
        int func=0;
        if(ch=='S'||ch=='s')
        {
            func=x+y;
        }
        else
        {
            func=x*y;
        }
    }
    void calculate(char st,char ch)
    {
        if(ch=='s'||ch=='S')
        {
            st=Character.toLowerCase(st);
        }
        else
        {
            st=Character.toUpperCase(st);
        }
    }
}