/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetarget.percentual_faturamento_estado;

import java.text.DecimalFormat;
import java.util.HashMap;

/**
 *
 * @author liedson
 */
public class PercentualFaturamentoEstado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Double> city_value = new HashMap<>();
        city_value.put("SP", 67836.43);
        city_value.put("RG", 36678.66);
        city_value.put("MG", 29229.88);
        city_value.put("ES", 27165.48);
        city_value.put("Outros", 19849.53);
        
        double total = 0;
        double percent= 0;        
        
        for (double value : city_value.values()) {
            total+=value;
        }
        
        for (HashMap.Entry<String, Double> map : city_value.entrySet()) {            
            percent = map.getValue() / total * 100;
            System.out.println(map.getKey()+":"+String.format("%.2f", percent)+"%");            
        }
                
    }
    
}
