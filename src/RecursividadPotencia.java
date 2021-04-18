/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julia
 */
public class RecursividadPotencia {
    int num = 1;
    int potencia =1;
    //int cont1=1;
   // int cont2=num*potencia;
  // int resultado;
    
    public int Potencia(int num, int potencia){
       if(potencia==0){
           return 1;
       }else if(potencia<0){
           
           return  Potencia(num, potencia+1)/num;
       }else{
           return num*Potencia(num, potencia-1);
       }
            
    }
    
}



