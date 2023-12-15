package gramma.InClass;

// enum Status {
//     START,
//     NORMAL,
//     WRITE,
//     UPDATE,
//     CLOSE
// }

public class EnumExample {
    // public enum State {
    //     START,
    //     NORMAL,
    //     WRITE,
    //     UPDATE,
    //     CLOSE
    // }

    private State state = State.START;

    public static void main(String[] args) {
        State s1 = State.START;
        System.out.println(s1);
        State s2 = State.NORMAL;
        // s2.setCode(0);
        System.out.println(s2.getCode());
        System.out.println(s1.getCode() == s2.getCode());

        System.out.println();
        for (State s: State.values()) {
            System.out.printf("code: %d, desc: %s\n", s.getCode(), s.getDesc());
        }
    }
}
