package provaQ1;

import java.io.*;

public class GeraLexer {
  public static void main(String[] args) throws IOException {
    String caminho = "C:\\Users\\jp871\\OneDrive\\Área de Trabalho\\prova_compiladores\\provaQ1\\especificacao.flex";
    File arquivo = new File(caminho);

    jflex.Main.generate(arquivo);
  }
}
