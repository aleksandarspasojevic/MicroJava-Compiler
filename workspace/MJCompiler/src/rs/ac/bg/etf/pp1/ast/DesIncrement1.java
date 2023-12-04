// generated with ast extension for cup
// version 0.8
// 27/5/2023 20:48:41


package rs.ac.bg.etf.pp1.ast;

public class DesIncrement1 extends DesignatorStatement {

    private DesignatorIncrement DesignatorIncrement;

    public DesIncrement1 (DesignatorIncrement DesignatorIncrement) {
        this.DesignatorIncrement=DesignatorIncrement;
        if(DesignatorIncrement!=null) DesignatorIncrement.setParent(this);
    }

    public DesignatorIncrement getDesignatorIncrement() {
        return DesignatorIncrement;
    }

    public void setDesignatorIncrement(DesignatorIncrement DesignatorIncrement) {
        this.DesignatorIncrement=DesignatorIncrement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorIncrement!=null) DesignatorIncrement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorIncrement!=null) DesignatorIncrement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorIncrement!=null) DesignatorIncrement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesIncrement1(\n");

        if(DesignatorIncrement!=null)
            buffer.append(DesignatorIncrement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesIncrement1]");
        return buffer.toString();
    }
}
