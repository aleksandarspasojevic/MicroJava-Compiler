// generated with ast extension for cup
// version 0.8
// 27/5/2023 20:48:41


package rs.ac.bg.etf.pp1.ast;

public class CostVarInitializations extends CostVarInitList {

    private CostVarInitList CostVarInitList;
    private String constVarName;
    private ConstType ConstType;

    public CostVarInitializations (CostVarInitList CostVarInitList, String constVarName, ConstType ConstType) {
        this.CostVarInitList=CostVarInitList;
        if(CostVarInitList!=null) CostVarInitList.setParent(this);
        this.constVarName=constVarName;
        this.ConstType=ConstType;
        if(ConstType!=null) ConstType.setParent(this);
    }

    public CostVarInitList getCostVarInitList() {
        return CostVarInitList;
    }

    public void setCostVarInitList(CostVarInitList CostVarInitList) {
        this.CostVarInitList=CostVarInitList;
    }

    public String getConstVarName() {
        return constVarName;
    }

    public void setConstVarName(String constVarName) {
        this.constVarName=constVarName;
    }

    public ConstType getConstType() {
        return ConstType;
    }

    public void setConstType(ConstType ConstType) {
        this.ConstType=ConstType;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CostVarInitList!=null) CostVarInitList.accept(visitor);
        if(ConstType!=null) ConstType.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CostVarInitList!=null) CostVarInitList.traverseTopDown(visitor);
        if(ConstType!=null) ConstType.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CostVarInitList!=null) CostVarInitList.traverseBottomUp(visitor);
        if(ConstType!=null) ConstType.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CostVarInitializations(\n");

        if(CostVarInitList!=null)
            buffer.append(CostVarInitList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+constVarName);
        buffer.append("\n");

        if(ConstType!=null)
            buffer.append(ConstType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CostVarInitializations]");
        return buffer.toString();
    }
}
