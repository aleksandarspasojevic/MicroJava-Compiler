// generated with ast extension for cup
// version 0.8
// 27/5/2023 20:48:41


package rs.ac.bg.etf.pp1.ast;

public class ConstVarDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private CostVarInitList CostVarInitList;

    public ConstVarDecl (CostVarInitList CostVarInitList) {
        this.CostVarInitList=CostVarInitList;
        if(CostVarInitList!=null) CostVarInitList.setParent(this);
    }

    public CostVarInitList getCostVarInitList() {
        return CostVarInitList;
    }

    public void setCostVarInitList(CostVarInitList CostVarInitList) {
        this.CostVarInitList=CostVarInitList;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CostVarInitList!=null) CostVarInitList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CostVarInitList!=null) CostVarInitList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CostVarInitList!=null) CostVarInitList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstVarDecl(\n");

        if(CostVarInitList!=null)
            buffer.append(CostVarInitList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstVarDecl]");
        return buffer.toString();
    }
}
