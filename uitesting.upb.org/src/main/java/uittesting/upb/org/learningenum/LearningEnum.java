package uittesting.upb.org.learningenum;

public enum LearningEnum {

    MATEO("Puna", 123456, 23932409),

    DIEGO("Martinez",1253,123),

    ADRIANA("ORELLANA",123,1234);


    private String name;
    private int ci;
    private int cell;

    LearningEnum(String name, int ci, int cell) {
        this.name = name;
        this.ci = ci;
        this.cell = cell;
    }
    public String getName() {
        return name;
    }

    public int getCi() {
        return ci;
    }

    public int getCell() {
        return cell;
    }

}
