package provaQ2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TesteAnalisador {
  public static void main(String[] args) throws FileNotFoundException {
    String arquivo = "C:\\Users\\jp871\\OneDrive\\Área de Trabalho\\prova_compiladores\\provaQ2\\codigo.txt";
    BufferedReader texto = new BufferedReader(new FileReader(arquivo));

    Lexer lexico = new Lexer(texto);

    AnalisadorSintatico sintatico = new AnalisadorSintatico(lexico);

    try {
      sintatico.parse();
      System.out.println("Sucesso na análise sintática");
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Falha geral.");
    }
  }
}
