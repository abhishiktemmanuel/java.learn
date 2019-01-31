class Strange
{
    int ele[]=new int[20];
    int capacity,top;
    Strange(int cap)
    {
        capacity=cap;
        top=1;
    }

    void pushItem(int value)
    {
        if(top<(capacity+10))
        {
            ele[top-1]=value;
            top++;
        }
        else
        {
            System.out.println("strange is full , cannot push item");
        }
    }

    int popItem()
    {
        if(top==1)
        {
            System.out.println("Strange is empty , returning 9999");
            return(9999);
        }
        else
        {
            top--;
            return ele[top-1];
        }

    }
}