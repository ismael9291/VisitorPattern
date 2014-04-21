
public class VisitorCalc extends Visitor
{
    public int visit(Exp exp)
    {
        if (exp instanceof ValueExp)
        {
            ValueExp vexp = (ValueExp)exp;
            return vexp.getValue();
        }
        else
        {            
            BinaryExp bexp = (BinaryExp)exp;
            int left = bexp.getLeft().accept(this);
            char op = bexp.getOp();
            int right = bexp.getRight().accept(this);

            if (op == '+')
                return left + right;
            else if (op == '-')
                return left - right;
            else if (op == '*')
                return left * right;
            else if (op == '/')
                return left / right;
            return 0;  
        }
    }


}