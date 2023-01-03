package aplicacion;
import estructuras.PilaAcotada;
import estructuras.Pila;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * En esta aplicacion vamos a hacer una agrupacion de parentesis
 * 
 * @author (Castillo Cardenas Elia Guadalupe)
 * @version (Septiembre-2022)
 */
public class Agrupacion
{
   public static void main(String[]args){
    Scanner entrada;
    PilaAcotada  pilaConLimite;
   String expresion;
   char caracter;
   boolean isBalanceada=true;
   Pila contratoPila= new PilaAcotada();
   expresion=JOptionPane.showInputDialog("Digite la expresion:");
   for(int i=0;i<expresion.length();i++){
    //Verificamos si es un carecter de apertura y lo metemos a la pila
    if(expresion.charAt(i)==('(')){
    contratoPila.push(new Character(')'));
    }else if(expresion.charAt(i)==('[')){
    contratoPila.push(new Character(']'));
    }else if(expresion.charAt(i)==('{')){
    contratoPila.push(new Character('}'));
    }else if(expresion.charAt(i)==(')')||expresion.charAt(i)==(']')||expresion.charAt(i)==('}')){//Verificamos si es un parentesis de cierre
    try{ 
    caracter=(Character) contratoPila.pop();
    }catch(FileNotFoundException e){
    JOptionPane.showMessageDialog(null,e.getMessage());
    e.printStackTrace();
    isBalanceada=false;
    break;
    }catch(Exception e){
    System.out.println(e.getMessage());
    e.printStackTrace();
    }
    //Verificamos si coinciden los parentesis de apertira y cierre
    if(expresion.charAt(i)==(')')&& expresion.charAt(i)==('(')){
    isBalanceada=true;
    }else{
    isBalanceada=false;
    return;
    }
    if(expresion.charAt(i)==(']') && expresion.charAt(i)==('[')){
    isBalanceada=true;
    }else{
    isBalanceada=false;
    return;
    }
    if(expresion.charAt(i)==('}')&&expresion.charAt(i)==('{')){
    isBalanceada=true;
    }else{
    isBalanceada=false;
    return;
    }
    }
    }
    if(contratoPila.isEmpty()){
    isBalanceada=false;
    }
    if(isBalanceada==true){
    JOptionPane.showMessageDialog(null," La expresion esta balanceada ");
    }else{
    JOptionPane.showMessageDialog(null," La expresion no esta balanceada");
    }
   }

   
}

