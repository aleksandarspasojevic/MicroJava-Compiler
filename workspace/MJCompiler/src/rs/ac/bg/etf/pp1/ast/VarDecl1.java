// generated with ast extension for cup
// version 0.8
// 27/5/2023 20:48:41


package rs.ac.bg.etf.pp1.ast;

public class VarDecl1 extends VarDecl {

    private VarDeclInner VarDeclInner;

    public VarDecl1 (VarDeclInner VarDeclInner) {
        this.VarDeclInner=VarDeclInner;
        if(VarDeclInner!=null) VarDeclInner.setParent(this);
    }

    public VarDeclInner getVarDeclInner() {
        return VarDeclInner;
    }

    public void setVarDeclInner(VarDeclInner VarDeclInner) {
        this.VarDeclInner=VarDeclInner;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclInner!=null) VarDeclInner.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclInner!=null) VarDeclInner.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclInner!=null) VarDeclInner.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDecl1(\n");

        if(VarDeclInner!=null)
            buffer.append(VarDeclInner.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDecl1]");
        return buffer.toString();
    }
}
