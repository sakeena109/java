public class array {
    public static void main(String[] args) {
        int[] stud_marks={55,65,45,93,100};
        int total=0;
        for (int i=0;i<stud_marks.length;i++) {
            total =total+ stud_marks[i];
        }
        System.out.println(total);
    }
}
