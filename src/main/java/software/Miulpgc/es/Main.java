package software.Miulpgc.es;

import org.jfree.data.category.DefaultCategoryDataset;
import software.Miulpgc.es.control.DataProcesor;
import software.Miulpgc.es.control.IO.DB_DataReader;
import software.Miulpgc.es.model.DataRegister;
import software.Miulpgc.es.view.JFreeChartHistogramShow;
import software.Miulpgc.es.view.MainFrame;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<DataRegister> registerList = new ArrayList<>();
        DB_DataReader reader = new DB_DataReader();

        DataProcesor procesor = new DataProcesor();
        JFreeChartHistogramShow Histogram = new JFreeChartHistogramShow(procesor.average_rating_histogram_builder(reader.readData()));
        DefaultCategoryDataset dates = Histogram.showHistogram();
        MainFrame frame = new MainFrame(dates);

    }
}
