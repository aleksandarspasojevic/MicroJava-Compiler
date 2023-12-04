// generated with ast extension for cup
// version 0.8
// 27/5/2023 20:48:41


package rs.ac.bg.etf.pp1.ast;

public class ConstVarDeclarations extends VarDeclList {

    private VarDeclList VarDeclList;
    private ConstVarDecl ConstVarDecl;

    public ConstVarDeclarations (VarDeclList VarDeclList, ConstVarDecl ConstVarDecl) {
        this.VarDeclList=VarDeclList;
        if(VarDeclList!=null) VarDeclList.setParent(this);
        this.ConstVarDecl=ConstVarDecl;
        if(ConstVarDecl!=null) ConstVarDecl.setParent(this);
    }

    public VarDeclList getVarDeclList() {
        return VarDeclList;
    }

    public void setVarDeclList(VarDeclList VarDeclList) {
        this.VarDeclList=VarDeclList;
    }

    public ConstVarDecl getConstVarDecl() {
        return ConstVarDecl;
    }

    public void setConstVarDecl(ConstVarDecl ConstVarDecl) {
        this.ConstVarDecl=ConstVarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclList!=null) VarDeclList.accept(visitor);
        if(ConstVarDecl!=null) ConstVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclList!=null) VarDeclList.traverseTopDown(visitor);
        if(ConstVarDecl!=null) ConstVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclList!=null) VarDeclList.traverseBottomUp(visitor);
        if(ConstVarDecl!=null) ConstVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstVarDeclarations(\n");

        if(VarDeclList!=null)
            buffer.append(VarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstVarDecl!=null)
            buffer.append(ConstVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstVarDeclarations]");
        return buffer.toString();
    }
}
