package design_pattern.structural.proxy;

public class ProxyDesignPattern {

    public static void main(String[] args) {
        DBExecuteProxy dbExecuteProxy = new DBExecuteProxy("Admin", "12345");
        dbExecuteProxy.executeQuery("Delete");

        DBExecuteProxy dbExecuteProxy1 = new DBExecuteProxy("non-Admin", "12345");
        dbExecuteProxy1.executeQuery("Delete");
    }
}
