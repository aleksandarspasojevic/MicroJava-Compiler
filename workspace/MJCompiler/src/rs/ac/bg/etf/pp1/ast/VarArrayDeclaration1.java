// generated with ast extension for cup
// version 0.8
// 27/5/2023 20:48:41


package rs.ac.bg.etf.pp1.ast;

public class VarArrayDeclaration1 extends VarDeclInner {

    private VarArrayDeclaration VarArrayDeclaration;

    public VarArrayDeclaration1 (VarArrayDeclaration VarArrayDeclaration) {
        this.VarArrayDeclaration=VarArrayDeclaration;
        if(VarArrayDeclaration!=null) VarArrayDeclaration.setParent(this);
    }

    public VarArrayDeclaration getVarArrayDeclaration() {
        return VarArrayDeclaration;
    }

    public void setVarArrayDeclaration(VarArrayDeclaration VarArrayDeclaration) {
        this.VarArrayDeclaration=VarArrayDeclaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarArrayDeclaration!=null) VarArrayDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarArrayDeclaration!=null) VarArrayDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarArrayDeclaration!=null) VarArrayDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarArrayDeclaration1(\n");

        if(VarArrayDeclaration!=null)
            buffer.append(VarArrayDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarArrayDeclaration1]");
        return buffer.toString();
    }
}
