package software.Miulpgc.es.model;

public class DataRegister {
    private String id;
    private Double averageRating;
    private int numVotes;

    public DataRegister(String id, Double averageRating, int numVotes) {
        this.id = id;
        this.averageRating = averageRating;
        this.numVotes = numVotes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public int getNumVotes() {
        return numVotes;
    }

    public void setNumVotes(int numVotes) {
        this.numVotes = numVotes;
    }

    @Override
    public String toString() {
        return "software.Miulpgc.es.model.DataRegister{" +
                "id='" + id + '\'' +
                ", averageRating=" + averageRating +
                ", numVotes=" + numVotes +
                '}';
    }
}
