package software.Miulpgc.es.view;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import software.Miulpgc.es.Main;

import javax.swing.*;

public class MainFrame {

    public MainFrame(DefaultCategoryDataset dataset) {

        JFreeChart barChart = ChartFactory.createBarChart(
                "Votes-to-Grade Histogram",
                "Range of grades",
                "Number of votes",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        JFrame frame = new JFrame("Histogram Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(barChart));
        frame.pack();
        frame.setVisible(true);
    }
}
