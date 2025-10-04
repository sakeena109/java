public class array {
    public static void main(String[] args) {
        double[] temp={22.4,12.6,23.6,26.9};
        double max=temp[0];
        for (int i=1;i<temp.length;i++) {
            if(temp[i]>max)
            max=temp[i];
        }
        System.out.println(max);
    }
}
