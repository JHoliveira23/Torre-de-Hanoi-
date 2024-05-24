package torrehanoia3;

import javax.swing.JOptionPane;


public class TorreHanoiA3 {



    public static void main(String[] args) {
        Pilha pino1 = new Pilha(5);
        Pilha pino2 = new Pilha(5);
        Pilha pino3 = new Pilha(5);
       
        pino1.push(5);
        pino1.push(4);
        pino1.push(3);
        pino1.push(2);
        pino1.push(1);
        int tentativas = 0;
        
        while(!pino2.isFull() || !pino3.isFull()){
        int topoHanoi = 0;
        int escolhaRetirada = Integer.parseInt(JOptionPane.showInputDialog("Escolha de qual pino você quer retirar um disco"));
        int escolhaDestino = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do pino que você quer colocar esse disco"));
        int topo1 = pino1.peek();
        int topo2 = pino2.peek();
        int topo3 = pino3.peek();
        
        
            if(escolhaRetirada == 1){
                topoHanoi = pino1.peek();
                pino1.pop();
            }
            else if(escolhaRetirada == 2){
                topoHanoi = pino2.peek();
                pino2.pop();     
            }
            else if(escolhaRetirada == 3){
                topoHanoi = pino3.peek();
                pino3.pop();
            }
            if(escolhaDestino == 1){
                    pino1.push(topoHanoi);
                }
                else if(escolhaDestino == 2){
                    pino2.push(topoHanoi);
                }
                else if(escolhaDestino == 3){
                    pino3.push(topoHanoi);
                }
        
       
            tentativas++;
            System.out.println(pino1.toString("pino 1:"));
            System.out.println(pino2.toString("pino 2:"));
            System.out.println(pino3.toString("pino 3:"));
            System.out.println("número de tentativas: "+tentativas);
        
        }
        } 
    }
    
