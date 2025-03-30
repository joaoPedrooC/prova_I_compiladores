import static provaQ1.Token.*;

%%
%{
  private void imprimir(String token, String lexema) {
    System.out.println(lexema + " -> " + token);
  }
%}

%class Lexer
%type Token

letra = [a-zA-Z]
digito = [0-9]
inteiro = {digito}+
identificador = {letra} ({letra} | {digito} | "_")*
op_comparacao = ("<" | ">")
tipagem = ("int" | "float" | "void" | "char")
op_especiais = ("++" | "<<" | ">>")
op_atribuicao = "="
simbolos_especiais = ("(" | ")" | ";" | "{" | "}")
palavras_reservadas = ("main" | "if" | "while" | "cout" | "cin" | "return")
branco = [\n|\t|\r| ]+
%%

{ tipagem } { imprimir("TIPAGEM ", yytext()); return TIPO; }
{ palavras_reservadas } { imprimir("PALAVRA RESERVADA ", yytext()); return PALAVRARESERVADA; }
{ branco } { return BRANCO; }
{ identificador } { imprimir("IDENTIFICADOR ", yytext()); return IDENTIFICADOR; }
{ inteiro } { imprimir("NUMERO INTEIRO ", yytext()); return INTEIRO; }
{ op_comparacao } { imprimir("OPERADOR COMPARATIVO ", yytext()); return OPERADORCOMPARATIVO; }
{ op_especiais } { imprimir("OPERADOR ESPECIAL ", yytext()); return OPERADORESPECIAL; }
{ op_atribuicao } { imprimir("OPERADOR ATRIBUICAO ", yytext()); return OPERADORATRIBUICAO; }
{ simbolos_especiais } { imprimir("SIMBOLO ESPECIAL ", yytext()); return SIMBOLOESPECIAL; }
. { imprimir("Caractere invalido ", yytext()); return ERROR; }
<<EOF>> { return null; }