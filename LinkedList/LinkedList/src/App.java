public class App {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        try {
            list.getValue(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        list.append(6);
        int ret = list.getValue(0);
        System.out.println("index 0 is " + ret);
        if (ret != 6)
            System.out.println("error");

        list.append(4);
        list.append(1);
        list.append(-3);
        list.append(10);
        ret = list.getValue(list.getLength() - 1);
        System.out.println("index 4 is " + ret);

        System.out.println(list);
    }
}
