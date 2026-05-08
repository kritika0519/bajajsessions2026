package strings_module;
// difference  between equals() and ==
public class EqualsOperator {
    public static void main(String[] args) {
        String a="hello";
        String b="hello";
        System.out.println(a.equals(b));

        //a.equals(b) compare teh whole string
        //"==" compares only address of string
    }
}
