package uk.ac.hw.macs.search;

public class AStarState implements State {
    private int x,y;
    private String value;
    private int goalX, goalY;

    public AStarState (int x, int y, String value, int goalX, int goalY) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.goalX = goalX;
        this.goalY = goalY;
    }

    @Override
    public boolean isGoal() { return this.x == this.goalX && this.y == this.goalY; }

    @Override
    public int getHeuristic() {
        return Math.abs(goalX - x) + Math.abs(goalY - y);
    }

    @Override
    public String toString() { return value; }
}
