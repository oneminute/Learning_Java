package gramma.Pre;

import java.io.*;

public class ExceptionEample {
    
    public static void main(String[] args) {
        ExceptionEample e1 = new ExceptionEample();
        e1.example1();
        e1.example2(10);
        e1.example3();
        e1.example4();
        e1.example5();
    }

    /**
     * simple example
     */
    public void example1() {
        try {
            int a = 0;
            int b = 10;
            int c = b / a;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * recursive invoking stack
     * 
     * @param n
     */
    public void example2(int n) {
        try {
            int a = n;
            int b = 10;
            int c = b / a;
            example2(n - 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * throw an exception manually
     */
    public void example3() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i == 5)
                    throw new Exception("sth wrong");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * with finally block, and determine the order of each step.
     */
    public void example4() {
        try {
            System.out.println("try block1");
            // throw new Exception("sth wrong");
            // System.out.println("try block2");
            return;
        } catch (Exception e) {
            System.out.println("catch block");
            return;
        } finally {
            System.out.println("finally block");
        }
        // System.out.println("return block");
    }

    /**
     * release the resouces in the finally block
     */
    public void example5() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Employees.txt")); // be careful about the file path
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * try with resources
     */
    public void example6() {
        try(BufferedReader reader = new BufferedReader(new FileReader("Employees.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * declare exception
     */
    public void example7() throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Employees.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public void example8() {
        try {
            throw new Exception2();
        } catch (Exception2 e) {
            e.printStackTrace();
        } catch (Exception1 e) {
            e.printStackTrace();
        }

    }
}

class Exception1 extends Exception {
    
}

class Exception2 extends Exception1 {

}
