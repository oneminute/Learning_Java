package gramma.Pre;

public interface DataModel extends ReadableModel, WritableModel {
    enum Status {
        OPENED,
        CLOSED,
        READING,
        WRITING
    }

    // public byte[] read();
    // public int write(byte[] data);

    public static void test() {
        System.out.println("test");
    }

    default void test2() {
        System.out.println("test2");
    }
}
