
package torrehanoia3;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Pilha {
    

    private int maxSize;
    private Integer[] torre;
    private int top;
  
    
    public Pilha(int tam){
        maxSize = tam;
        torre = new Integer[maxSize];
        top = -1;       
    }
    public Pilha(String teste){
        
    }
    
    public void push(int disco){
        if(isFull()){
            System.out.println("Stack cheia");
            return;
        }
        else if(!isEmpty() && peek() <= disco){
           JOptionPane.showMessageDialog(null, "Não é possível colocar um disco maior acima de um disco menor");
            
        }
            top++;
            torre[top]=disco;  
    }
    
   public Integer pop(){
       if(isEmpty()){
           JOptionPane.showMessageDialog(null, "Não é possível retirar discos deu um pino sem discos");
           return -1;   
       }
       int oldTop = top;
       top--;
       torre[oldTop]= null;
       return torre[oldTop];
       }
   public Integer peek(){
       if(isEmpty()){
           return -1;
       }
       return torre[top];
   }
   
   public boolean isEmpty(){
       return(top == -1);
   }
   
   public boolean isFull(){
       return(top == maxSize - 1);
    
   }
   public int size(){
       return maxSize;
   }
   
   public String toString(String nomePino){
       return "Pilha: "+nomePino + Arrays.toString(torre);
   }

}
