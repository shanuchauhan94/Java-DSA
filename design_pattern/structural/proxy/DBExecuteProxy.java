package design_pattern.structural.proxy;

public class DBExecuteProxy implements DataBaseQueryExecute {

    QueryExecuteImpl queryExecuteImpl;
    boolean isAdmin;

    public DBExecuteProxy(String user, String password) {
        if (user.equals("Admin") && password.equals("12345")) {
            isAdmin = true;
        }
        this.queryExecuteImpl = new QueryExecuteImpl();
    }

    @Override
    public void executeQuery(String operation) {
        if (isAdmin) {
            queryExecuteImpl.executeQuery(operation);
        } else if (operation.equals("Delete")) {
            System.err.println("not admin delete query can't performed.");
        } else {
            queryExecuteImpl.executeQuery(operation);
        }

    }
}
