// generated with ast extension for cup
// version 0.8
// 27/5/2023 20:48:41


package rs.ac.bg.etf.pp1.ast;

public class FormalMatrixDecl extends FormalParamDecl {

    private Type Type;
    private String param;

    public FormalMatrixDecl (Type Type, String param) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.param=param;
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param=param;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormalMatrixDecl(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+param);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormalMatrixDecl]");
        return buffer.toString();
    }
}
