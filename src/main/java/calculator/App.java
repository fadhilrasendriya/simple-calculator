/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calculator;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }
    public int getSum(int a, int b) {
        return a+b;
    }
    public int getSubstract(int a, int b) {
        return a-b;
    }
    public int getProduct(int a, int b) {
        return a*b;
    }
    public int getDivision(int a, int b) {
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println(new App().getSum(10,20));
        System.out.println(new App().getSubstract(10,20));
        System.out.println(new App().getProduct(10,20));
        System.out.println(new App().getDivision(10,20));
    }
}
