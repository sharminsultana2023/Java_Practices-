import java.util.Scanner;

public class countNotes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your amount");
        int amount=scanner.nextInt();
        countNotes(amount);
    }
    public static void countNotes(int amount) {
        int[] notes = new int[]{1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int[] noteCount = new int[9];

        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCount[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        // Print notes
        System.out.println("Taka   NoteCount ");
        for (int i = 0; i < 9; i++) {
            if (noteCount[i] != 0) {
                System.out.println(notes[i] + " \t " + noteCount[i]);
            }
        }
    }
}
