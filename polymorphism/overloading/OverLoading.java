package polymorphism.overloading;

/*
a class has multiple methods having same name but different in parameters
 */
public class OverLoading {

    public void getSum(int a, int b) {
        int sum = a + b;
        System.err.println("method 1 " + sum);
    }

    public void getSum(int a, int b, int c) {
        int sum = a + b + c;
        System.err.println("method 2 " + sum);
    }

    // Type permeation
    public void getSum(int a, long b) {
        long sum = a + b;
        System.err.println("method 3 " + sum);
    }

    public static void main(String[] args) {
        OverLoading loading = new OverLoading();
        loading.getSum(35, 90L);
    }
}
