package gramma.Pre;


public class EnumExample {

    public enum Status {
        START (0, "start"),
        NORMAL (1, "read"),
        WRITE (2, "write"),
        UPDATE (3, "update");

        private final int code;
        private final String desc;
        Status(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        int code() {
            return code;
        }

        String desc() {
            return desc;
        }
    }

    private Status status = Status.START;
    
    public static void main(String[] args) {
        for (Status s : Status.values()) {
            System.out.println(s);
        }
        for (Status s : Status.values()) {
            System.out.printf("code: %d, desc: %s\n", s.code(), s.desc());
        }
    }
}
