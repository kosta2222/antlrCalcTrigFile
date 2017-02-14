import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

/**
 * Created by papa on 14.02.2017.
 */
public class Main2 {
    public static void main(String[] args) throws Exception {
        //

        //
         InputStream is=new FileInputStream(new File("test.txt"));
         OutputStream os=new FileOutputStream("result.txt");
         StringBuilder sb=new StringBuilder();
         int b=0;
        while ( is.available()>0) {
            b=is.read();

            if ( b==(int)'\n'){
                //
                CharStream cs = new ANTLRInputStream(sb.toString());
                CalcLexer lexer = new CalcLexer(cs);
                /*lexer.reset();*/

                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CalcParser parser = new CalcParser(tokens);
                ParseTree tree = parser.input(); // begin parsing at // rule
                //
                CalcBaseVisitorImpl visitor = new CalcBaseVisitorImpl();


                double result= visitor.visit(tree);
                String sD=sb.toString()+"="+String.valueOf(result);
                byte[] bytes=sD.getBytes();
                os.write(bytes);
                os.write((int)'\n');

                sb.delete(0,sb.toString().length()-1);
                continue;
            }
            sb.append((char)b);

        }

        is.close();
        os.close();

    }
}
