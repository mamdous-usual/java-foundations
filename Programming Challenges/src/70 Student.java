class Student {
    String name;
    int age;

    Student(String name, int age) {
       this.name = name;
       this.age = age;
    }

    @Override
    public String toString() {
        return "Student Details:{name:" + name + " , age:" + age + " }";
    }

    public static void main(String[] args) {
        Student frndA = new Student("Yogesh", 20);
        System.out.println(frndA);

    }
}
