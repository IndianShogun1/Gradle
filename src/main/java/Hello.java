import org.apache.commons.lang3.StringUtils;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        System.out.printf("%s%s%s",
                StringUtils.center("Hello", 10),
                StringUtils.center("World", 10),
                StringUtils.center("!", 10));
    }
}
