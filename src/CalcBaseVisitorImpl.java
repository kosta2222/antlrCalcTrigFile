import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;

public class CalcBaseVisitorImpl extends CalcBaseVisitor<Double>{
    HashMap<String,Double> memory=null;
    public CalcBaseVisitorImpl() {
        memory=new HashMap<>();
    }

    public Double toRad(Double i){
        Double d=(3.14d * i)/180.0;
        return d;

    }
    @Override
    public Double visitCos(@NotNull CalcParser.CosContext ctx) {
        /*return super.visitCos(ctx);*/
        Double r=this.toRad(Double.parseDouble(ctx.INT().getText()));
        Double d=Math.cos(r);
        return  d;
    }

    @Override
    public Double visitInt(@NotNull CalcParser.IntContext ctx) {
        /*return super.visitInt(ctx);*/
        Double d=Double.parseDouble(ctx.INT().getText());
        return d;
    }

    @Override
    public Double visitTan(@NotNull CalcParser.TanContext ctx) {
        Double r=this.toRad(Double.parseDouble(ctx.INT().getText()));
        Double d=Math.tan(r);
        return  d;
    }

    @Override
    public Double visitSin(@NotNull CalcParser.SinContext ctx) {
        Double r=this.toRad(Double.parseDouble(ctx.INT().getText()));
        Double d=Math.sin(r);
        return  d;
    }

    @Override
    public Double visitVariable(@NotNull CalcParser.VariableContext ctx) {
        String id=ctx.ID().getText();
        Double  value=visit(ctx.plusMinus());
        memory.put(id,value);
        return value;
    }

    @Override
    public Double visitPlus(@NotNull CalcParser.PlusContext ctx) {
        return visit(ctx.plusMinus())+visit(ctx.mulDiv());
    }
    @Override
    public Double visitMinus(@NotNull CalcParser.MinusContext ctx) {
        return visit(ctx.plusMinus())+visit(ctx.mulDiv());
    }

    @Override
    public Double visitMul(@NotNull CalcParser.MulContext ctx) {
        return visit(ctx.mulDiv(0))*visit(ctx.mulDiv(1));
    }

    @Override
    public Double visitDiv(@NotNull CalcParser.DivContext ctx) {
        return visit(ctx.mulDiv(0))/visit(ctx.mulDiv(1));
    }

    @Override
    public Double visitBraces(@NotNull CalcParser.BracesContext ctx) {
        return visit(ctx.plusMinus());
    }
}
