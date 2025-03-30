package provaQ3;
import java_cup.runtime.*;

%%
%cup
%public
%class Lexer
%line
%column

DIGITO = [0-9]
NUMERO = {DIGITO}+
IGNORE = [\n|\s|\t\r]

%%
<YYINITIAL> {
  {NUMERO} {
    int aux = Integer.parseInt(yytext());
    return new Symbol(Sym.NUMERO, yyline, yycolumn, new Integer(aux));
  }
  "*" { return new Symbol(Sym.MULT); }
  "/" { return new Symbol(Sym.DIV); }
  "+" { return new Symbol(Sym.ADD); }
  ";" { return new Symbol(Sym.PTVG); }
  {IGNORE} { }
}
<<EOF>> { return new Symbol(Sym.EOF); }