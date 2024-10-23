public class Scoreboard {

    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;

    public Scoreboard(String one, String two) {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }

    public String getScore() {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }

    public void recordPlay(int points) {
        if(teamOne.equals(activeTeam))
        teamOneScore += points;
        if(teamTwo.equals(activeTeam))
        teamTwoScore += points;
        if(points == 0)
        {
            if(activeTeam.equals(teamOne)) activeTeam = teamTwo;
            else if(teamTwo.equals(activeTeam)) activeTeam = teamOne;
            
        }
    }

}