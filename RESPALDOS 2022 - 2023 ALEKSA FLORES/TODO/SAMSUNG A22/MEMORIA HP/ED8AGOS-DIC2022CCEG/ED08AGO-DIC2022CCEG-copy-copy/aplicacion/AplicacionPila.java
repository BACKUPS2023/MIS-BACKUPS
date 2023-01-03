package aplicacion;
import estructuras.Pila;
import estructuras.PilaAcotada;
import estructuras.PilaNoAcotada;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * Es una aplicacion en donde vamos a usar las clases que hicmos 
 * 
 * @author (Castillo Cardenas Elia Guadalupe ) 
 * @version (1.0 Septiembre-2022)
 */
public class AplicacionPila
{
    public static void main (String[]args)  {
        Scanner entrada;
        Pila interfacePila;
        PilaAcotada pilaConLimite;
        PilaNoAcotada pilaSinLimite;
        //Variables asociadas a los objetos
        char elemento;
        boolean estaLlena,estaVacia;
        //Variables asociadas al problema 
        String expresion;
        boolean isBalanceada=true;
        int i=0;
        //Polimorfismo
        entrada=new Scanner(System.in);
        System.out.print("Digite la expresion");
        expresion=entrada.next();
        Pila contratoPila= new PilaAcotada();
        char caracter;
        //Recorrer todo la expresion 
        //Verificar si en la expresion hay parentesis de entrada y de salida iguales 
        //Le vamos a meter un while para ver si la pila esta balanceada o no
        for(i=0;i<expresion.length();i++){
            if(expresion.charAt(i)==('(')){
                contratoPila.push(new Character(')'));
            }else if(expresion.charAt(i)==')'){
                try{
                    caracter = (Character)contratoPila.pop();
                }catch(FileNotFoundException e){
                    //Cuando manejamos herencia o subclaes prmero van las subclases
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                    isBalanceada=false;
                    //Terminamos el ciclo for , debido a que ya no puede estar balanceada 
                    break;
                }catch(Exception e){
                    //y despues las super cleses por lo tanto el ultimo siempre debe de ser Exception
                    //Aqui se genera debido a que falta un parentesis de cierre
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
        //Tambien se deber checar si faltaron parentesis de cerrar 
        if(contratoPila.isEmpty()){
            //No esta balanceada
            isBalanceada=false;
        }
        if(isBalanceada==true){
            System.out.println("La expresion esta balanceada");
        }else{
            System.out.println("La expresion no esta balanceada");
        }
    }
}

