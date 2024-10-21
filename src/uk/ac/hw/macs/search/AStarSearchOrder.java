package uk.ac.hw.macs.search;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class AStarSearchOrder implements SearchOrder{
    @Override
    public void addToFringe(List<FringeNode> frontier, FringeNode parent, Set<ChildWithCost> children) {
        for (ChildWithCost child : children) { // append all new states at the start of the frontier
            frontier.add(0, new FringeNode(child.node, parent, child.cost));
        }
        // sort the frontier by the f-value (sum of path costs and heuristics) for the A* search
        frontier.sort(Comparator.comparingInt(child -> child.gValue + child.node.getValue().getHeuristic()));
    }
}
