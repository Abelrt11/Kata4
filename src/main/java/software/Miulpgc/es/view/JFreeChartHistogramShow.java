package software.Miulpgc.es.view;

import org.jfree.data.category.DefaultCategoryDataset;

import java.util.HashMap;
import java.util.Map;

public class JFreeChartHistogramShow {

    HashMap<String, Integer> HistogramData;

    public JFreeChartHistogramShow(HashMap<String, Integer> histogramData) {
        HistogramData = histogramData;
    }

    public DefaultCategoryDataset showHistogram() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Map.Entry<String, Integer> entry : HistogramData.entrySet()) {
            dataset.addValue(entry.getValue(), "Frequency", entry.getKey());
        }
        return dataset;
    }
}
