package design_pattern.structural.proxy;

public class QueryExecuteImpl implements DataBaseQueryExecute {

    @Override
    public void executeQuery(String operation) {
        System.err.println("database query executed. "+operation);
    }
}
