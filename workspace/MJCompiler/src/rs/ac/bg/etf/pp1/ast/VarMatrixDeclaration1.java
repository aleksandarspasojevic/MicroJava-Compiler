// generated with ast extension for cup
// version 0.8
// 27/5/2023 20:48:41


package rs.ac.bg.etf.pp1.ast;

public class VarMatrixDeclaration1 extends VarDeclInner {

    private VarMatrixDeclaration VarMatrixDeclaration;

    public VarMatrixDeclaration1 (VarMatrixDeclaration VarMatrixDeclaration) {
        this.VarMatrixDeclaration=VarMatrixDeclaration;
        if(VarMatrixDeclaration!=null) VarMatrixDeclaration.setParent(this);
    }

    public VarMatrixDeclaration getVarMatrixDeclaration() {
        return VarMatrixDeclaration;
    }

    public void setVarMatrixDeclaration(VarMatrixDeclaration VarMatrixDeclaration) {
        this.VarMatrixDeclaration=VarMatrixDeclaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarMatrixDeclaration!=null) VarMatrixDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarMatrixDeclaration!=null) VarMatrixDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarMatrixDeclaration!=null) VarMatrixDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarMatrixDeclaration1(\n");

        if(VarMatrixDeclaration!=null)
            buffer.append(VarMatrixDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarMatrixDeclaration1]");
        return buffer.toString();
    }
}
