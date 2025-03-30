package provaQ3;

import java.io.*;

public class TesteAnalisadorSintatico {
  public static void main(String[] args) throws IOException {
    String arquivo = "C:\\Users\\jp871\\OneDrive\\Área de Trabalho\\prova_compiladores\\provaQ3\\codigo.txt";
    
    BufferedReader texto = new BufferedReader(new FileReader(arquivo));
    Lexer lexico = new Lexer(texto);
    ParserSintatico sintatico = new ParserSintatico(lexico);

    try {
      sintatico.parse();
      System.out.println("Análise sintática concluida.");
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
