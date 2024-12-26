package software.Miulpgc.es.control.IO;

import software.Miulpgc.es.model.DataRegister;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DB_dataReader {

    public List<DataRegister> readData(){
        String query = "SELECT * FROM title_ratings_with_id WHERE id = ?";

        int currentId = 1;
        boolean moreRows = true;
        List<DataRegister> RegisterList = new ArrayList<>();
        String id;
        String averageRating;
        String numVotes;
        try (Connection connection = DB_Connection.Connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            while (moreRows) {
                preparedStatement.setInt(1, currentId);
                currentId++;

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        id = resultSet.getString("id");
                        averageRating = resultSet.getString("averageRating");
                        numVotes = resultSet.getString("numVotes");
                    } else {
                        moreRows = false;
                    }
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return RegisterList;
    }
}
