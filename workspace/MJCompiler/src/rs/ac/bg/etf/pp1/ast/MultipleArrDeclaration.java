// generated with ast extension for cup
// version 0.8
// 27/5/2023 20:48:41


package rs.ac.bg.etf.pp1.ast;

public class MultipleArrDeclaration extends VarDeclInner {

    private VarDeclInner VarDeclInner;
    private MultArrDecl MultArrDecl;

    public MultipleArrDeclaration (VarDeclInner VarDeclInner, MultArrDecl MultArrDecl) {
        this.VarDeclInner=VarDeclInner;
        if(VarDeclInner!=null) VarDeclInner.setParent(this);
        this.MultArrDecl=MultArrDecl;
        if(MultArrDecl!=null) MultArrDecl.setParent(this);
    }

    public VarDeclInner getVarDeclInner() {
        return VarDeclInner;
    }

    public void setVarDeclInner(VarDeclInner VarDeclInner) {
        this.VarDeclInner=VarDeclInner;
    }

    public MultArrDecl getMultArrDecl() {
        return MultArrDecl;
    }

    public void setMultArrDecl(MultArrDecl MultArrDecl) {
        this.MultArrDecl=MultArrDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclInner!=null) VarDeclInner.accept(visitor);
        if(MultArrDecl!=null) MultArrDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclInner!=null) VarDeclInner.traverseTopDown(visitor);
        if(MultArrDecl!=null) MultArrDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclInner!=null) VarDeclInner.traverseBottomUp(visitor);
        if(MultArrDecl!=null) MultArrDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleArrDeclaration(\n");

        if(VarDeclInner!=null)
            buffer.append(VarDeclInner.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultArrDecl!=null)
            buffer.append(MultArrDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleArrDeclaration]");
        return buffer.toString();
    }
}
