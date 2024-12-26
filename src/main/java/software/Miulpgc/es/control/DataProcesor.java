package software.Miulpgc.es.control;

import software.Miulpgc.es.model.DataRegister;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DataProcesor {

    public HashMap<String, Integer> average_rating_histogram_builder(DataReader reader) {
        HashMap<String, Integer> average_rating_histogram = average_rating_histogram_initializer();
        for (DataRegister register : reader.getRegistersList()) {
            double rating = register.getAverageRating();
            String range = getRatingRange(rating);
            average_rating_histogram.put(range, average_rating_histogram.getOrDefault(range, 0) + 1);
        }
        return average_rating_histogram;
    }

    private String getRatingRange(double rating) {
        if (rating <= 4.9) return "0.0 - 4.9";
        else if (rating <= 6.9) return "5.0 - 6.9";
        else if (rating <= 8.9) return "7.0 - 8.9";
        else return "9.0 - 10.0";
    }

    private HashMap<String, Integer> average_rating_histogram_initializer() {
        return new LinkedHashMap<>() {{
            put("0.0 - 4.9", 0);
            put("5.0 - 6.9", 0);
            put("7.0 - 8.9", 0);
            put("9.0 - 10.0", 0);
        }};
    }



}
