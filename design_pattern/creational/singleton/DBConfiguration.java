package design_pattern.creational.singleton;

public class DBConfiguration {

    private static DBConfiguration dbConfiguration;

    private DBConfiguration() {
        System.err.println(" ************* singleton instance ************* ");
    }

    public static DBConfiguration getInstance() {

        if (dbConfiguration == null) {
            dbConfiguration = new DBConfiguration();
        }
        return dbConfiguration;
    }


}
