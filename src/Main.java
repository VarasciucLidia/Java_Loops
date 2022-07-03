public class Main {
    public static void main(String[] args) {
        LogicalOp ob=new LogicalOp();
        ob.printToHundred(5);
        ob.printToMinusHundred(5);
        ob.exerciseThree(3,10);
        ob.exerciseFour(2,7);
        ob.exerciseFive();
        ob.exerciseSix();
        System.out.println("Rezultatul adunarii este: " + ob.exerciseSeven(95));
        System.out.println("Rezultatul mediei este: " + ob.exerciseEight(95));
        ob.printAsterisk();
        }
}
