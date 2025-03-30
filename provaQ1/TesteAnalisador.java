package provaQ1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TesteAnalisador {
  public static void main(String[] args) throws IOException {
    String arquivo = "C:\\Users\\jp871\\OneDrive\\Área de Trabalho\\prova_compiladores\\provaQ1\\codigo.txt";
    BufferedReader texto = new BufferedReader(new FileReader(arquivo));

    Lexer analisador = new Lexer(texto);

    while(true) {
      Token token = analisador.yylex();
      if(token == null) break;
    }
  }
}
