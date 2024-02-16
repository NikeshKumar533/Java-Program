public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Nikesh";
        String s2 = "Nikesh";
        String s3 = new String("Nikesh");
        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
