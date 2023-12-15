package gramma.Pre;

public class StringDataModel implements DataModel {

    private String data;

    public String getData() {
        return data;
    }

    public StringDataModel() {
        this("");
    }

    public StringDataModel(String data){
        this.data = data;
    }

    @Override
    public byte[] read() {
        return data.getBytes();
    }

    @Override
    public int write(byte[] data) {
        this.data = new String(data);
        return data.length;
    }
    

    public static void main(String[] args) {
        StringDataModel model = new StringDataModel("Hello World!");
        byte[] data = model.read();
        System.out.println(java.util.Arrays.toString(data));

        byte[] data2 = {97, 98, 99, 100, 101};
        model.write(data2);
        System.out.println(model.getData());
    }
}
