
package graficos;

public class BarData {
    private Double score;
    private String name;
    private String category;

    public BarData(Double score, String name, String category) {
        this.score = score;
        this.name = name;
        this.category = category;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
