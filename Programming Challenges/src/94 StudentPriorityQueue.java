import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });

        queue.offer(new Student("Mamdous",'A'));
        queue.offer(new Student("Prashant",'B'));
        queue.offer(new Student("Monohar",'A'));
        queue.offer(new Student("Shyam Lal",'C'));

        System.out.printf("Queue is: %s\n", queue);

        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
    }


    private static class Student{
       private final String name;
       private final char grade;

        private Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
           return name + ": " + grade;
        }
    }
}
