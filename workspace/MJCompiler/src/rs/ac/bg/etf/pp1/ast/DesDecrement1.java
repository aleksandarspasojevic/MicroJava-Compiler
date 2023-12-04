// generated with ast extension for cup
// version 0.8
// 27/5/2023 20:48:41


package rs.ac.bg.etf.pp1.ast;

public class DesDecrement1 extends DesignatorStatement {

    private DesignatorDecrement DesignatorDecrement;

    public DesDecrement1 (DesignatorDecrement DesignatorDecrement) {
        this.DesignatorDecrement=DesignatorDecrement;
        if(DesignatorDecrement!=null) DesignatorDecrement.setParent(this);
    }

    public DesignatorDecrement getDesignatorDecrement() {
        return DesignatorDecrement;
    }

    public void setDesignatorDecrement(DesignatorDecrement DesignatorDecrement) {
        this.DesignatorDecrement=DesignatorDecrement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorDecrement!=null) DesignatorDecrement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorDecrement!=null) DesignatorDecrement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorDecrement!=null) DesignatorDecrement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesDecrement1(\n");

        if(DesignatorDecrement!=null)
            buffer.append(DesignatorDecrement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesDecrement1]");
        return buffer.toString();
    }
}
