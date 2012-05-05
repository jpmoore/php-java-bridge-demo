import php.java.bridge.*;

public class HelloWorld {
  public static final String JAVABRIDGE_PORT="8087";
  static final php.java.bridge.JavaBridgeRunner runner =
    php.java.bridge.JavaBridgeRunner.getInstance(JAVABRIDGE_PORT);

  public static void main(String[] args) throws Exception {
    runner.waitFor();
    System.exit(0);
  }

  public String hello(String args[]) throws Exception {
    return "Hello " + args[0];
  }
}
