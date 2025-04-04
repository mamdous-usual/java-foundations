class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Mamdous", "Ahmed", "Laskar"));
    }

    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
           sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
