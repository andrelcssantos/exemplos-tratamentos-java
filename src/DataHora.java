import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Andre
 */
public class DataHora {
    
    public static void main(String[] args) {
        
        //recebe a entrada dos dados
        String data = JOptionPane.showInputDialog(null, "Entre com a data (dd/mm/yyyy)");
        
        //cria um array com os meses do ano
        String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", 
                          "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        
        //cria um array com os dias da semana
        String dias[] = {"domingo", "segunda", "terça", "quarta", "quinta", "sexta", "sábado"};
        
        //separa a data utilizando a / como parametro de delimitador
        String parte[] = data.split("/");
        //cria uma variável tipo int que é convertida para receber o seu dia, mes e ano respectivo
        int dia = Integer.parseInt(parte[0]);
        int mes = Integer.parseInt(parte[1]);
        int ano = Integer.parseInt(parte[2]);
        
        //recupera o dia da semana
        Date date = new Date();
        date.setDate(dia);
        date.setMonth(mes - 1);
        date.setYear(ano - 1900);
        
        int diaSemana = date.getDay();
        
        //cria uma variável tipo String que recebe o array de dias com seu dia - 1, pois o array se inicia em 0
        String diaSemanaExtenso = dias[diaSemana];
        String mesExtenso = meses[mes - 1];
        
        //exibe a saida dos dados parte[0] = dia / mesExtenso = parte[1] / parte[2] = ano
        JOptionPane.showMessageDialog(null, diaSemanaExtenso + "-feira " + ", " + mesExtenso + " de " + parte[2]);
    }
    
}
