// generated with ast extension for cup
// version 0.8
// 27/5/2023 20:48:41


package rs.ac.bg.etf.pp1.ast;

public class MultipleMatrixDeclaration extends VarDeclInner {

    private VarDeclInner VarDeclInner;
    private MultMatrixDecl MultMatrixDecl;

    public MultipleMatrixDeclaration (VarDeclInner VarDeclInner, MultMatrixDecl MultMatrixDecl) {
        this.VarDeclInner=VarDeclInner;
        if(VarDeclInner!=null) VarDeclInner.setParent(this);
        this.MultMatrixDecl=MultMatrixDecl;
        if(MultMatrixDecl!=null) MultMatrixDecl.setParent(this);
    }

    public VarDeclInner getVarDeclInner() {
        return VarDeclInner;
    }

    public void setVarDeclInner(VarDeclInner VarDeclInner) {
        this.VarDeclInner=VarDeclInner;
    }

    public MultMatrixDecl getMultMatrixDecl() {
        return MultMatrixDecl;
    }

    public void setMultMatrixDecl(MultMatrixDecl MultMatrixDecl) {
        this.MultMatrixDecl=MultMatrixDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclInner!=null) VarDeclInner.accept(visitor);
        if(MultMatrixDecl!=null) MultMatrixDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclInner!=null) VarDeclInner.traverseTopDown(visitor);
        if(MultMatrixDecl!=null) MultMatrixDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclInner!=null) VarDeclInner.traverseBottomUp(visitor);
        if(MultMatrixDecl!=null) MultMatrixDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleMatrixDeclaration(\n");

        if(VarDeclInner!=null)
            buffer.append(VarDeclInner.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultMatrixDecl!=null)
            buffer.append(MultMatrixDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleMatrixDeclaration]");
        return buffer.toString();
    }
}
