public class LogicalOp {
    public void printToHundred(int x)
    {
        for(int i=x;i<=100;i++)
        {
            System.out.println(i);
        }
    }

    public void printToMinusHundred(int y)
    {
        for(int i=y;i>=-100;i--)
        {
            System.out.println(i);
        }
    }

    public void exerciseThree(int x,int y)
    {
        for(int i=x;i<=y;i++)
        {
            System.out.println(i);
        }
    }

    public void exerciseFour(int x,int y)
    {
        if(x<y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        }
        else {
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }
        }
    }
    public void exerciseFive()
    {
        for(int i=1;i<=100;i++)
        {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void exerciseSix()
    {
        for(int i=1;i<=100;i++)
        {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
