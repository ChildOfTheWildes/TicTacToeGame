public abstract class Player extends PlayerFactory {

    private final String name;
    private final String marker;
    private int wins = 0;
    private final int turn;

    public Player(String name, String marker, int turn) {
        this.name = name;
        this.marker = marker;
        this.turn = turn;
    }

    public String getName() {
        return name;
    }
    public String getMarker() {
        return marker;
    }
    public int getTurn() {
        return this.turn;
    }
    public int getWins() {
        return this.wins;
    }
    public void addWin() {
        this.wins++;
    }

    //public abstract void takeTurn(GridPane board);
    public abstract void takeTurn(TicTacToe game);
}
