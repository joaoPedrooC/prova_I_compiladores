
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Mar 29 21:41:51 BRT 2025
//----------------------------------------------------

package provaQ3;

import java_cup.runtime.*;
import java.util.*;
import java.io.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Mar 29 21:41:51 BRT 2025
  */
public class ParserSemantico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserSemantico() {super();}

  /** Constructor which sets the default scanner. */
  public ParserSemantico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserSemantico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\006\000\002\003\004\000\002\002\004\000\002\002" +
    "\005\000\002\002\005\000\002\002\005\000\002\002\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\014\000\004\010\004\001\002\000\012\004\ufffc\005" +
    "\ufffc\006\ufffc\007\ufffc\001\002\000\004\002\016\001\002" +
    "\000\012\004\012\005\007\006\010\007\011\001\002\000" +
    "\004\010\015\001\002\000\004\010\014\001\002\000\004" +
    "\010\013\001\002\000\004\002\001\001\002\000\012\004" +
    "\ufffe\005\ufffe\006\ufffe\007\ufffe\001\002\000\012\004\ufffd" +
    "\005\ufffd\006\ufffd\007\ufffd\001\002\000\012\004\uffff\005" +
    "\uffff\006\uffff\007\uffff\001\002\000\004\002\000\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\014\000\006\002\005\003\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserSemantico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserSemantico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserSemantico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserSemantico$actions {
  private final ParserSemantico parser;

  /** Constructor */
  CUP$ParserSemantico$actions(ParserSemantico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserSemantico$do_action(
    int                        CUP$ParserSemantico$act_num,
    java_cup.runtime.lr_parser CUP$ParserSemantico$parser,
    java.util.Stack            CUP$ParserSemantico$stack,
    int                        CUP$ParserSemantico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserSemantico$result;

      /* select the action based on the action number */
      switch (CUP$ParserSemantico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= NUMERO 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.peek()).value;
		
  RESULT = n;

              CUP$ParserSemantico$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), RESULT);
            }
          return CUP$ParserSemantico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= expr ADD NUMERO 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.peek()).value;
		
  RESULT = new Integer(e.intValue() +  n.intValue());

              CUP$ParserSemantico$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), RESULT);
            }
          return CUP$ParserSemantico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= expr DIV NUMERO 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.peek()).value;
		
  RESULT = new Integer(e.intValue() / n.intValue());  

              CUP$ParserSemantico$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), RESULT);
            }
          return CUP$ParserSemantico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr ::= expr MULT NUMERO 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.peek()).value;
		
  RESULT = new Integer(e.intValue() * n.intValue());

              CUP$ParserSemantico$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), RESULT);
            }
          return CUP$ParserSemantico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_ptvg EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-1)).right;
		Integer start_val = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-1)).value;
		RESULT = start_val;
              CUP$ParserSemantico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserSemantico$parser.done_parsing();
          return CUP$ParserSemantico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr_ptvg ::= expr PTVG 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-1)).value;
		 System.out.println("Resultado: " + e); 
              CUP$ParserSemantico$result = parser.getSymbolFactory().newSymbol("expr_ptvg",1, ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), RESULT);
            }
          return CUP$ParserSemantico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

