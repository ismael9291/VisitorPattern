
public class VisitorPrint extends Visitor
{
    public int visit(Exp exp)
    {
        if (exp instanceof ValueExp)
        {
            ValueExp vexp = (ValueExp)exp;
            System.out.print(vexp.getValue());
        }
        else
        {
            BinaryExp bexp = (BinaryExp)exp;
            System.out.print("(");
            bexp.getLeft().accept(this);
            System.out.print(") " + bexp.getOp() + " (");
            bexp.getRight().accept(this);
            System.out.print(")");            
        }
        
        return 0;
    }


}
