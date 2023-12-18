package generics.Pre;

import java.util.*;

public class GenericsExample {
    public static void main(String[] args) {
        // if do not use generics
        ArrayList numbers = new ArrayList();
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        int num0 = (int) numbers.get(0);

        LinkedList strings = new LinkedList<>();
        strings.add("hello");
        strings.add("world");
        String str0 = (String) strings.get(0);

        // use generics
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        num0 = numbers2.get(0);

        LinkedList<String> strings2 = new LinkedList<String>();
        strings2.add("hello");
        str0 = strings2.get(0);

        // Accumulator without generics
        Accumulator1 acc1 = new Accumulator1(0);
        acc1.add(10);
        acc1.add(20);
        acc1.add(30.0);
        System.out.println("int value of acc1: " + acc1.getTotal().intValue());
        System.out.println("double value of acc1: " + acc1.getTotal().doubleValue());

        Accumulator1 acc2 = new Accumulator1(0.0);
        acc2.add(10.0);
        acc2.add(20.0);
        acc2.add(30);
        System.out.println("int value of acc2: " + acc2.getTotal().intValue());
        System.out.println("double value of acc2: " + acc2.getTotal().doubleValue());

        Accumulator<Integer> acc3 = new Accumulator<Integer>(Integer.class);
        acc3.add(10);
        acc3.add(20);
        // acc3.add(30.0);
        System.out.println("int value of acc3: " + acc3.getTotal().intValue());
        System.out.println("double value of acc3: " + acc3.getTotal().doubleValue());
    }

    public static<T> T func1(T v) {
        return v;
    }
}

class Accumulator1 {

    private Number total;

    public Number getTotal() {
        return total;
    }

    public Accumulator1(Number value) {
        this.total = value;
    }

    public void add(Number n) {
        if (total instanceof Byte) {
            total = total.byteValue() + n.byteValue();
        } else if (total instanceof Short) {
            total = total.shortValue() + n.shortValue();
        } else if (total instanceof Integer) {
            total = total.intValue() + n.intValue();
        } else if (total instanceof Long) {
            total = total.longValue() + n.longValue();
        } else if (total instanceof Float) {
            total = total.floatValue() + n.floatValue();
        } else if (total instanceof Double) {
            total = total.doubleValue() + n.doubleValue();
        }
    }
}

class Accumulator<T extends Number> {

    private Double total;
    private Class<T> type;

    public Accumulator(Class<T> type) {
        total = 0.0;
        this.type = type;
    }

    public void add(T value) {
        if (value != null)
            total += value.doubleValue();
    }

    public T getTotal() {
        if (type.equals(Byte.class))
            return type.cast(total.byteValue());
        else if (type.equals(Short.class))
            return type.cast(total.shortValue());
        else if (type.equals(Integer.class))
            return type.cast(total.intValue());
        else if (type.equals(Long.class))
            return type.cast(total.longValue());
        else if (type.equals(Float.class))
            return type.cast(total.floatValue());
        else if (type.equals(Double.class))
            return type.cast(total.doubleValue());
        throw new ClassCastException("Can not cast the accumulate value into type of " + type);
    }
}

class SyncVariable<T> {
    
    private T value;

    public synchronized T getValue() {
        return value;
    }

    public synchronized void setValue(T value) {
        this.value = value;
    }
}
