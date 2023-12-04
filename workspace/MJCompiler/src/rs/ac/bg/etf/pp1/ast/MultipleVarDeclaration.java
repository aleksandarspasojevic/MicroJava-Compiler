// generated with ast extension for cup
// version 0.8
// 27/5/2023 20:48:41


package rs.ac.bg.etf.pp1.ast;

public class MultipleVarDeclaration extends VarDeclInner {

    private VarDeclInner VarDeclInner;
    private MultVarDecl MultVarDecl;

    public MultipleVarDeclaration (VarDeclInner VarDeclInner, MultVarDecl MultVarDecl) {
        this.VarDeclInner=VarDeclInner;
        if(VarDeclInner!=null) VarDeclInner.setParent(this);
        this.MultVarDecl=MultVarDecl;
        if(MultVarDecl!=null) MultVarDecl.setParent(this);
    }

    public VarDeclInner getVarDeclInner() {
        return VarDeclInner;
    }

    public void setVarDeclInner(VarDeclInner VarDeclInner) {
        this.VarDeclInner=VarDeclInner;
    }

    public MultVarDecl getMultVarDecl() {
        return MultVarDecl;
    }

    public void setMultVarDecl(MultVarDecl MultVarDecl) {
        this.MultVarDecl=MultVarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclInner!=null) VarDeclInner.accept(visitor);
        if(MultVarDecl!=null) MultVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclInner!=null) VarDeclInner.traverseTopDown(visitor);
        if(MultVarDecl!=null) MultVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclInner!=null) VarDeclInner.traverseBottomUp(visitor);
        if(MultVarDecl!=null) MultVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleVarDeclaration(\n");

        if(VarDeclInner!=null)
            buffer.append(VarDeclInner.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultVarDecl!=null)
            buffer.append(MultVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleVarDeclaration]");
        return buffer.toString();
    }
}
