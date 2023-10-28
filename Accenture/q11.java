import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the length of the linked list
        int n = scanner.nextInt();

        // Input the values of the linked list
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(scanner.nextInt());
        }

        // Create a single list to store alternate values
        List<Integer> alternateList = new LinkedList<>();

        // Create pointers p1 and p2
        int p1Index = 0;
        int p2Index = 1;

        while (p1Index < n) {
            alternateList.add(linkedList.get(p1Index));
            p1Index += 2;
        }

        while (p2Index < n) {
            alternateList.add(linkedList.get(p2Index));
            p2Index += 2;
        }

        // Print the list containing alternate values
        System.out.println("Alternate values in a single list: " + alternateList);
    }
}






