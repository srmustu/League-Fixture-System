import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teams = new ArrayList<>();
        Collections.addAll(teams, "Galatasaray", "Bursaspor", "Fenerbahçe", "Beşiktaş", "Başakşehir", "Trabzonspor");

        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        generateFixture(teams);
    }

    private static void generateFixture(ArrayList<String> teams) {
        int totalRounds = (teams.size() - 1) * 2;
        int numTeams = teams.size();

        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("Round " + round);
            ArrayList<String> roundMatches = new ArrayList<>();


            for (int i = 0; i < numTeams / 2; i++) {
                String team1 = teams.get(i);
                String team2 = teams.get(numTeams - 1 - i);

                if (team1.equals("Bay") || team2.equals("Bay")) {
                    roundMatches.add(team1 + " vs " + team2);
                } else {
                    roundMatches.add(team1 + " vs " + team2);
                }
            }

            for (String match : roundMatches) {
                System.out.println(match);
            }

            System.out.println();
            rotateTeams(teams);
        }
    }

    private static void rotateTeams(ArrayList<String> teams) {
        String firstTeam = teams.remove(0); // İlk takımı çıkarıyoruz
        teams.add(firstTeam); // En sona ekliyoruz
    }
}




