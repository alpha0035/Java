package working_with_variables_datatypes;

public class enumTest {
    public enum sports {soccer, badminton, swimming, volleyball};
    public static void main(String[] args) {
        sports game= sports.soccer;
        System.out.println("Your choice is "+game);
    }
}
