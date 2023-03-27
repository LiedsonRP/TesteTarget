/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetarget.faturamento_diario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.ArrayList;

/**
 *
 * @author liedson
 */
public class FaturamentoDiario {
    
    final static String PATH = "./src/testetarget/faturamento_diario/dados.json";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
        double value = 0;        
        double media = 0;
        ArrayList<Double> values = new ArrayList<>();
        
        double min_value = 0;
        double max_value = 0;
        int num_dias_maior_media = 0;
        
        try {
            JSONArray js = (JSONArray) new JSONParser().parse(new FileReader(PATH));
            for (int i = 0; i < js.size(); i++) {
                
                JSONObject day = (JSONObject) js.get(i); 
                value = Double.parseDouble(day.get("valor").toString());
                
                if (value != 0) {
                    values.add(value);
                    media+=value;                    
                }
            }                        
            
            media = media / values.size();            
            min_value = value;
            
            for (double invoicing : values) {
                if (max_value < invoicing) {
                    max_value = invoicing;
                }
                
                if (min_value > invoicing) {
                    min_value = invoicing;
                }
                
                if (invoicing > media) {
                    num_dias_maior_media+=1;
                }
            }
            
            System.out.println("Menor Valor Arrecadado: R$" + String.format("%.2f", min_value));
            System.out.println("Maior Valor Arrecadado: R$" + String.format("%.2f", max_value));            
            System.out.println("Número de dias com arrecadação maior que a média: " + num_dias_maior_media);
                        
        } catch (FileNotFoundException ex) {
            System.out.println("arquivo não encontrado!");
        } catch (IOException ex) {
            System.out.println("A função parse não recebeu os dados do arquivo!");
        } catch (ParseException ex) {
            System.out.println("Erro ao converter os dados do arquivo!");
        }

    }

}
