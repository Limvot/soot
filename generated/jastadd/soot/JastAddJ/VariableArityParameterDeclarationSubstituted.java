/* This file was generated with JastAdd2 (http://jastadd.org) version R20121122 (r889) */
package soot.JastAddJ;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.io.File;
import java.util.*;
import beaver.*;
import java.util.ArrayList;
import java.util.zip.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Collection;
import soot.*;
import soot.util.*;
import soot.jimple.*;
import soot.coffi.ClassFile;
import soot.coffi.method_info;
import soot.coffi.CONSTANT_Utf8_info;
import soot.tagkit.SourceFileTag;
import soot.coffi.CoffiMethodSource;
/**
 * @production VariableArityParameterDeclarationSubstituted : {@link VariableArityParameterDeclaration} ::= <span class="component">&lt;Original:VariableArityParameterDeclaration&gt;</span>;
 * @ast node
 * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.ast:34
 */
public class VariableArityParameterDeclarationSubstituted extends VariableArityParameterDeclaration implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public VariableArityParameterDeclarationSubstituted clone() throws CloneNotSupportedException {
    VariableArityParameterDeclarationSubstituted node = (VariableArityParameterDeclarationSubstituted)super.clone();
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public VariableArityParameterDeclarationSubstituted copy() {
      try {
        VariableArityParameterDeclarationSubstituted node = (VariableArityParameterDeclarationSubstituted)clone();
        if(children != null) node.children = (ASTNode[])children.clone();
        return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   */
  @SuppressWarnings({"unchecked", "cast"})
  public VariableArityParameterDeclarationSubstituted fullCopy() {
    try {
      VariableArityParameterDeclarationSubstituted tree = (VariableArityParameterDeclarationSubstituted) clone();
      tree.setParent(null);// make dangling
      if (children != null) {
        tree.children = new ASTNode[children.length];
        for (int i = 0; i < children.length; ++i) {
          if (children[i] == null) {
            tree.children[i] = null;
          } else {
            tree.children[i] = ((ASTNode) children[i]).fullCopy();
            ((ASTNode) tree.children[i]).setParent(tree);
          }
        }
      }
      return tree;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " +
        getClass().getName());
    }
  }
  /**
   * @ast method 
   * 
   */
  public VariableArityParameterDeclarationSubstituted() {
    super();


  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @ast method 
   * 
   */
  public void init$Children() {
    children = new ASTNode[2];
  }
  /**
   * @ast method 
   * 
   */
  public VariableArityParameterDeclarationSubstituted(Modifiers p0, Access p1, String p2, VariableArityParameterDeclaration p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setID(p2);
    setOriginal(p3);
  }
  /**
   * @ast method 
   * 
   */
  public VariableArityParameterDeclarationSubstituted(Modifiers p0, Access p1, beaver.Symbol p2, VariableArityParameterDeclaration p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setID(p2);
    setOriginal(p3);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * Replaces the Modifiers child.
   * @param node The new node to replace the Modifiers child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setModifiers(Modifiers node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Modifiers child.
   * @return The current node used as the Modifiers child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Modifiers getModifiers() {
    return (Modifiers)getChild(0);
  }
  /**
   * Retrieves the Modifiers child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Modifiers child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Modifiers getModifiersNoTransform() {
    return (Modifiers)getChildNoTransform(0);
  }
  /**
   * Replaces the TypeAccess child.
   * @param node The new node to replace the TypeAccess child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setTypeAccess(Access node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the TypeAccess child.
   * @return The current node used as the TypeAccess child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Access getTypeAccess() {
    return (Access)getChild(1);
  }
  /**
   * Retrieves the TypeAccess child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the TypeAccess child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Access getTypeAccessNoTransform() {
    return (Access)getChildNoTransform(1);
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /**
   * JastAdd-internal setter for lexeme ID using the Beaver parser.
   * @apilevel internal
   * @ast method 
   * 
   */
  public void setID(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
      throw new UnsupportedOperationException("setID is only valid for String lexemes");
    tokenString_ID = (String)symbol.value;
    IDstart = symbol.getStart();
    IDend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme ID.
   * @return The value for the lexeme ID.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
  /**
   * Replaces the lexeme Original.
   * @param value The new value for the lexeme Original.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setOriginal(VariableArityParameterDeclaration value) {
    tokenVariableArityParameterDeclaration_Original = value;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  protected VariableArityParameterDeclaration tokenVariableArityParameterDeclaration_Original;
  /**
   * Retrieves the value for the lexeme Original.
   * @return The value for the lexeme Original.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public VariableArityParameterDeclaration getOriginal() {
    return tokenVariableArityParameterDeclaration_Original;
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
