import java.util.Scanner;

public class AliceSkill {
    public static int maxSkillLevel(int[] difficulties, int D) {
        int skill = 0;
        for (int i = 0; i < D; i++) {
            if (difficulties[i % difficulties.length] > skill) {
                skill += difficulties[i % difficulties.length];
            } else { 
                skill -= difficulties[i % difficulties.length];
            }
        }
        return skill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] difficulties = new int[N];
        for (int i = 0; i < N; i++) {
            difficulties[i] = scanner.nextInt();
        }
        int Q = scanner.nextInt();
        int[] queries = new int[Q];
        for (int i = 0; i < Q; i++) {
            queries[i] = scanner.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            int maxSkill = maxSkillLevel(difficulties, queries[i]);
            System.out.println(maxSkill);
        }

        // Close the scanner
        scanner.close();
    }
}
