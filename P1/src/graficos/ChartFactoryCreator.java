
package graficos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class ChartFactoryCreator {

    public static ChartPanel createPieChartPanel(String charTitle, HashMap<String, Double> valores, int width, int height) {

        DefaultPieDataset dataset = new DefaultPieDataset();

        for (Entry<String, Double> entry : valores.entrySet()) {
            dataset.setValue(entry.getKey(), entry.getValue());
        }

        JFreeChart chart = ChartFactory.createPieChart3D(
                charTitle, // chart title 
                dataset, // data    
                true, // include legend   
                true,
                false);

        ChartPanel chartPanel = new ChartPanel(chart, width, height, 0, 0, width, height, true, true, true, true, true, false);
        return chartPanel;

    }

    public static ChartPanel createBarChartPanel(String charTitle,String categoryLegent,String scoreLegent, ArrayList<BarData> valores, int width, int height) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (BarData barData : valores) {
            dataset.addValue(barData.getScore(), barData.getName(), barData.getCategory());
        }

        JFreeChart barChart = ChartFactory.createBarChart3D(
                charTitle,
                categoryLegent,
                scoreLegent,
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart, width, height, 0, 0, width, height, true, true, true, true, true, false);
        return chartPanel;

    }
    
    
        // El pnChart es el panel que vas a usar para mostrar el char
        // Ejemplo PieChar
//        HashMap<String, Double> valores = new HashMap<>();
//
//        valores.put("Ingenieros", new Double(10));
//        valores.put("Tecnicos", new Double(32));
//        valores.put("Doctor", new Double(3));
//        valores.put("Magister", new Double(5));
//        valores.put("Licenciado", new Double(25));
//        
//        ChartPanel chartPanel = ChartFactoryCreator.createPieChartPanel("Carreras vs Cantidad", valores,pnChart.getWidth(),pnChart.getHeight());
//        pnChart.add(chartPanel,BorderLayout.CENTER);
//        pnChart.validate();
        // Ejemplo BarChar
//        ArrayList<BarData> valores = new ArrayList<>();
//        
//        valores.add(new BarData(new Double(10), "ingenieros", "empresa1"));
//        valores.add(new BarData(new Double(15), "Tecnicos", "empresa1"));
//        valores.add(new BarData(new Double(10), "Doctor", "empresa1"));
//        valores.add(new BarData(new Double(40), "Magister", "empresa1"));
//        valores.add(new BarData(new Double(35), "ingenieros", "empresa1"));
//        valores.add(new BarData(new Double(33), "Licenciado", "empresa1"));
//
//        valores.add(new BarData(new Double(15), "ingenieros", "empresa2"));
//        valores.add(new BarData(new Double(5), "Tecnicos", "empresa2"));
//        valores.add(new BarData(new Double(16), "Doctor", "empresa2"));
//        valores.add(new BarData(new Double(14), "Magister", "empresa2"));
//        valores.add(new BarData(new Double(51), "ingenieros", "empresa2"));
//        valores.add(new BarData(new Double(12), "Licenciado", "empresa2"));
//        
//        ChartPanel chartPanel = ChartFactoryCreator.createBarChartPanel("Cantidad Empleados por empresa","Empresas","Cantidad",valores,pnChart.getWidth(),pnChart.getHeight());
//        pnChart.add(chartPanel,BorderLayout.CENTER);
//        pnChart.validate();

}
