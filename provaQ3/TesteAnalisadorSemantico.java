package provaQ3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TesteAnalisadorSemantico {
  public static void main(String[] args) throws FileNotFoundException {
    String arquivo = "C:\\Users\\jp871\\OneDrive\\Área de Trabalho\\prova_compiladores\\provaQ3\\codigo.txt";

    BufferedReader texto = new BufferedReader(new FileReader(arquivo));
    Lexer lexico = new Lexer(texto);
    ParserSemantico semantico = new ParserSemantico(lexico);

    try {
      semantico.parse();
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Falha na análise semântica. " + e);
    }
  }
}
