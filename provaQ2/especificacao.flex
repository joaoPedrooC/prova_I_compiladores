package provaQ2;
import java_cup.runtime.*;

%%
%cup
%public
%class Lexer
%line
%column
%{
  private Symbol symbol(int type) { return new Symbol(type, yyline, yycolumn); }
  private Symbol symbol(int type, Object value) { return new Symbol(type, yyline, yycolumn, value); }
%}

DIGITO = [0-9]
LETRA = [a-zA-Z]
INTEIRO = {DIGITO}+
DECIMAL = {INTEIRO}"."{INTEIRO}
VARIAVEL = {LETRA}+
IGNORE = [\n|\s|\t\r]

%%
<YYINITIAL> {
  "programa" { return new Symbol(Sym.PROGRAMA); }
  "if" { return new Symbol(Sym.IF); }
  "inicio" { return new Symbol(Sym.INICIO); }
  "fim" { return new Symbol(Sym.FIM); }
  "int" { return new Symbol(Sym.TIPO_INTEIRO); }
  "float" { return new Symbol(Sym.TIPO_FLOAT); }
  "=" { return new Symbol(Sym.ATRIBUICAO); }
  ";" { return new Symbol(Sym.PTVG); }
  "(" { return new Symbol(Sym.ABRE_PARENTESES); }
  ")" { return new Symbol(Sym.FECHA_PARENTESES); }
  ">" { return new Symbol(Sym.CONDICIONAL); }
  "*" { return new Symbol(Sym.OP_ARITMETICO); }
  {INTEIRO} { return new Symbol(Sym.INTEIRO); }
  {DECIMAL} { return new Symbol(Sym.FLOAT); }
  {VARIAVEL} { return new Symbol(Sym.VARIAVEL); }
  {IGNORE} { }
}
<<EOF>> { return new Symbol(Sym.EOF); }
[^] { throw new Error("Caractere invalido: " + yytext() + " na linha " + (yyline + 1) + " coluna " + (yycolumn + 1)); }