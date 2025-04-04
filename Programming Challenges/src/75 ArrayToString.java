class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[] {"This", " is ", "the ", "best"," and ", "detailed", " course on java", " on YouTube"};
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
           sb.append(str);
        }
        System.out.println(sb);
    }
}
