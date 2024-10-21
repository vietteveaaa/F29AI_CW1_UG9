package uk.ac.hw.macs.search;

public class AStarState implements State {
    private final int x,y; // store grid coordinates of a state for heuristics calculation
    private final String value; // a letter in a grid cell
    private final int goalX, goalY; // goal coordinates

    public AStarState (int x, int y, String value, int goalX, int goalY) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.goalX = goalX;
        this.goalY = goalY;
    }

    // if the state coordinates match the goal coordinates then it's the goal
    @Override
    public boolean isGoal() { return this.x == this.goalX && this.y == this.goalY; }

    // Manhattan distance calculation
    @Override
    public int getHeuristic() {
        return Math.abs(goalX - x) + Math.abs(goalY - y);
    }

    @Override
    public String toString() { return value; }
}
