// + - * / expression

public class BinaryExp extends Exp
{    
    private char op;  // + - * /
    private Exp left;
    private Exp right;
    
    public BinaryExp(Exp left, char op, Exp right)
    {
        this.left = left;
        this.op = op;
        this.right = right;
    }
    
    // accept the visitor
    public int accept(Visitor v)
    {
        return v.visit(this);        
    }

    // getters
    public char getOp()
    {
        return op;
    }

    public Exp getLeft()
    {
        return left;
    }

    public Exp getRight()
    {
        return right;
    }

}
