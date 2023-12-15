package gramma.InClass;

public enum State {
    START (0, "start"),
    NORMAL (1, "normal"),
    WRITE (2, "write"),
    UPDATE (3, "update");

    private final int code;
    private final String desc;
    private State(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    // public void setCode(int code) {
    //     this.code = code;
    // }

    public String getDesc() {
        return desc;
    }

    // public void setDesc(String desc) {
    //     this.desc = desc;
    // }
}