package Java002;

public class class16_stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

// Thread 1
        new Thread(() -> {
            sb.append(" World");
        }).start();
        System.out.println(sb);

// Thread 2
        new Thread(() -> {
            sb.append("!");
        }).start();

//Hence multiple thread cannot be accessed at the same time
        System.out.println(sb.toString());

    }
}
