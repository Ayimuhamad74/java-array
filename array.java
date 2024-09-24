public class array {
    public static void main(String[] args) {
        int javaku[];
        javaku = new int[8];
        int i;
        int bd;
        float total;
        float average;
        bd = 8;
        total = 0;

        javaku[0] = 3;
        javaku[1] = 2;
        javaku[2] = 8;
        javaku[3] = 10;
        javaku[4] = 14;
        javaku[5] = 22;

        for (i = 0; i < bd; i++) {
            System.out.println("javaku[" + i + "] = " + javaku[i]);
            total = total + javaku[i];
        }
        average = total / bd;
        System.out.println("Total = " + total);
        System.out.println("Rata-rata =" + average);
    }
}
