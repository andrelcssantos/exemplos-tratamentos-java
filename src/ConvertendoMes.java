
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
public class ConvertendoMes {
    
    public static void main(String[] args) {
        
        //recebe a entrada dos dados
        String data = JOptionPane.showInputDialog(null, "Entre com a data (dd/mm/yyyy)");
        
        //cria um array com os meses do ano
        String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", 
                          "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        
        //separa a data utilizando a / como parametro de delimitador
        String parte[] = data.split("/");
        //cria uma variável tipo int que é convertida para receber o seu mes respectivo
        int mes = Integer.parseInt(parte[1]);
        //cria uma variável tipo String que recebe o array de meses com seu mes - 1, pois o array se inicia em 0
        String mesExtenso = meses[mes - 1];
        
        //exibe a saida dos dados parte[0] = dia / mesExtenso = parte[1] / parte[2] = ano
        JOptionPane.showMessageDialog(null, parte[0] + " de " + mesExtenso + " de " + parte[2]);
    }
    
}
