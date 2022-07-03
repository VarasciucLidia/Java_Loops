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

    // 7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main() pentru a verifica
    // daca functioneaza.

    public int exerciseSeven(int x)
    {
        int sum=0;
        for(int i=x;i<=100;i++)
        {
            sum=sum+i;
        }
        return sum;
    }

    //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // si sa calculeze media numerelor. La final, metoda sa returneze media. Apelati metoda in clasa Main,
    // metoda main() pentru a verifica daca functioneaza.

    public double exerciseEight(double x)
    {
        double sum=0, count=0;
        for(double i=x;i<=100;i++)
        {
            sum=sum+i;
            count++;
        }
        return sum/count;
    }

    //9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
    public void printAsterisk() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
