package creational.prototype;

public class Prototype {

    private int id;
    private String name;
    private String veryImportantData;
    private String someCalculatedValue;

    public Prototype(int id, String name) {
        this.id = id;
        this.name = name;
        this.veryImportantData = runDbQuery();
        this.someCalculatedValue = runCalculations();
    }

    private String runCalculations() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Calculated value";
    }

    private String runDbQuery() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Very important Data";
    }
}
