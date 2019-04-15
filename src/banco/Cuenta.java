package banco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private int numero;
    private String dueño;
    private int Clave;
    private float saldo;
 public Cuenta(int numero,String dueño){
     numero=this.numero;
     dueño=this.dueño;
     

 }

    public void setClave(int Clave) {
        this.Clave = Clave;
    }
    
   public boolean consignar(double valor){
       if(valor>0 && this.saldo >=valor){
           this.saldo+=valor;
           return true;
       }
       else return false;
   }
   public boolean retirar(double valor){
       if(valor>0 && this.saldo >=valor){
           this.saldo-=valor;
           return true;
       }
       else return false;
       
   }
   public double consultarSaldo(){
       return this.saldo;
   }
   }
   
   
   
   
   
   
   
   
   
   
   
   
