
public class ValueExp extends Exp
{
    private int value;
    
    public ValueExp(int value)
    {
        this.value = value;
    }

    // accept the visitor
    public int accept(Visitor v)
    {
        return v.visit(this);        
    }

    public int getValue()
    {
        return value;
    }
}
