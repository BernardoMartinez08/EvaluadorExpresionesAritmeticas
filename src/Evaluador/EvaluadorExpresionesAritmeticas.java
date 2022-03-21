
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluador;
import ANTLR.ExprBaseListener;
import ANTLR.ExprBaseVisitor;
import ANTLR.ExprLexer;
import ANTLR.ExprListener;
import ANTLR.ExprParser;
import ANTLR.ExprVisitor;

import java.io.IOException;
import jdk.nashorn.internal.parser.TokenStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author angie
 */
public class EvaluadorExpresionesAritmeticas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String entrada = "D://Documentos//entrada";
        ExprLexer lexer = new ExprLexer(new ANTLRFileStream(entrada));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        
        ExprParser.ProgContext tree = parser.prog();
        
        ExprBaseVisitor visitor = new ExprBaseVisitor();
        
        visitor.visit(tree);
        
        
    }
    
}
