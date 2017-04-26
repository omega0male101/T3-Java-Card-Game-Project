public class Game {
    Dealer dealer;
    ArrayList<Player> players;


    public Game(Dealer dealer) {
        this.dealer = dealer;
        this.players = new ArrayList<player>;
    }

    public String checkWinner(){
        int player1Points = players.get(0).totalPoints();
        int player2Points = players.get(1).totalPoints();

        if (player1Points > player2Points){
            return "PLayer One Wins!";
        }
        else if (player2Points > player1Points){
            return "Player Two Wins!";
        }
        else if (player2Points == player1Points){
            return "What are the chances? It's a draw!";
        }
        else {
            return "Error 1 - Something isn't right / Check PLayer Class";
        }
    }
}