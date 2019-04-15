/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Estudiante
 */
public class Banco {
  public static void main(String[] args) {
    Cuenta cuenta= new Cuenta(1012,"Magdalena");
    cuenta.setClave(1234);
    boolean resultado =cuenta.consignar(10000);
    if(resultado==true){
    System.out.println("consignacion exitosa");               
}else{
     System.out.println("No se pudo consignar");   
}
   
    }
    
}
