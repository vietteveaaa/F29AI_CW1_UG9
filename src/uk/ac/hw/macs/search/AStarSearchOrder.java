package uk.ac.hw.macs.search;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class AStarSearchOrder implements SearchOrder{
    @Override
    public void addToFringe(List<FringeNode> frontier, FringeNode parent, Set<ChildWithCost> children) {
        for (ChildWithCost child : children) {
            frontier.add(0, new FringeNode(child.node, parent, child.cost));
        }
        frontier.sort(Comparator.comparingInt(child -> child.gValue + child.node.getValue().getHeuristic()));
    }
}