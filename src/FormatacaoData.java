
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Andre
 */
public class FormatacaoData {
    
    public static void main(String[] args) {
        
        //Exemplo 1 - Exibe duas datas com formatos diferentes no console
        Date date = new Date();
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
                
        System.out.println(formataData.format(date));
        System.out.println(new SimpleDateFormat("EEEE, dd 'de' MMMMM 'de' yyyy").format(date));
        
        //Exemplo 2 - Recebe a data do usuário
        String data = JOptionPane.showInputDialog(null, "Entre com a data (dd/mm/yyyy)");
        
        try{
            //instancia uma variável de data informada
            Date dataInformada = new Date();
            // faz a conversão da data informada para o formato abaixo
            dataInformada = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            //exibe a data formatada em um novo formato
            JOptionPane.showMessageDialog(null, new SimpleDateFormat("EEEE, dd 'de' MMMMM 'de' yyyy").format(dataInformada));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no formato da data");
        }
    }
    
}
