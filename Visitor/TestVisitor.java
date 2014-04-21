
public class TestVisitor
{
    public static void main(String[] args)
    {
        ValueExp v1 = new ValueExp(3);
        ValueExp v2 = new ValueExp(6);
        ValueExp v3 = new ValueExp(7);
        ValueExp v4 = new ValueExp(8);
        ValueExp v5 = new ValueExp(4);

        BinaryExp b1 = new BinaryExp(v1, '+', v2);
        BinaryExp b2 = new BinaryExp(v3, '-', v5);
        BinaryExp b3 = new BinaryExp(b1, '*', v4);
        BinaryExp b4 = new BinaryExp(b3, '/', b2);
        
        Visitor vis1 = new VisitorPrint();
        b4.accept(vis1);
        System.out.println();

        Visitor vis2 = new VisitorCalc();
        System.out.print("Result = " + b4.accept(vis2));
        

    }

}
