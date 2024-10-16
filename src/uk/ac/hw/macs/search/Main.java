package uk.ac.hw.macs.search;

public class Main {

    private static Node addChild(int x, int y, String value, int goalX, int goalY, Node parent, int cost) {
        Node child = new Node(new AStarState(x, y, value, goalX, goalY));
        parent.addChild(child, cost);
        return child;
    }

    public static void main(String[] args) {
        // Grid 1
        Node root = new Node(new AStarState(0, 0, "S", 5, 2));
        Node goal = new Node(new AStarState(5, 2, "G", 5, 2));
        Node A = addChild(1, 0, "A", 5, 2, root, 1);
        Node E = addChild(0, 1, "E", 5, 2, root, 2);
        Node F = addChild(1, 1, "F", 5, 2, A, 2);
        E.addChild(F, 2);
        Node L = addChild(0, 2, "L", 5, 2, E, 1);
        Node H = addChild(2, 1, "H", 5, 2, F, 1);
        Node M = addChild(1, 2, "M", 5, 2, F, 1);
        L.addChild(M, 1);
        Node P = addChild(0, 3, "P", 5, 2, L, 2);
        Node I = addChild(3, 1, "I", 5, 2, H, 2);
        Node B = addChild(3, 0, "B", 5, 2, I, 2);
        Node J = addChild(4, 1, "J", 5, 2, I, 1);
        Node N = addChild(3, 2, "N", 5, 2, I, 2);
        Node C = addChild(4, 0, "C", 5, 2, B, 1);
        J.addChild(C, 1);
        Node K = addChild(5, 1, "K", 5, 2, J, 1);
        Node O = addChild(4, 2, "O", 5, 2, J, 2);
        N.addChild(O, 2);
        Node Q = addChild(3, 3, "Q", 5, 2, N, 1);
        Node D = addChild(5, 0, "D", 5, 2, C, 1);
        K.addChild(D, 1);
        K.addChild(goal, 1);
        O.addChild(goal, 1);
        Node R = addChild(4, 3, "R", 5, 2, O, 2);
        Q.addChild(R, 2);
        Node T = addChild(5, 3, "T", 5, 2, R, 2);
        T.addChild(goal, 1);

        SearchOrder order = new AStarSearchOrder();
        SearchProblem problem = new SearchProblem(order);
        problem.doSearch(root);

        // Grid 2
        root = new Node(new AStarState(0, 0, "S", 3, 4));
        goal = new Node(new AStarState(3, 4, "G", 3, 4));
        A = addChild(1, 0, "A", 3, 4, root, 1);
        D = addChild(0, 1, "D", 3, 4, root, 2);
        E = addChild(1, 1, "E", 3, 4, A, 1);
        D.addChild(E, 1);
        J = addChild(0, 2, "J", 3, 4, D, 1);
        F = addChild(2, 1, "F", 3, 4, E, 1);
        K = addChild(1, 2, "K", 3, 4, E, 1);
        J.addChild(K, 1);
        N = addChild(0, 3, "N", 3, 4, J, 2);
        T = addChild(0, 4, "T", 3, 4, N, 2);
        O = addChild(1, 3, "O", 3, 4, N, 1);
        K.addChild(O, 1);
        H = addChild(3, 1, "H", 3 ,4, F, 2);
        P = addChild(2, 3, "P", 3, 4, O, 2);
        B = addChild(3, 0, "B", 3, 4, H, 2);
        I = addChild(4, 1, "I", 3, 4, H, 1);
        L = addChild(3, 2, "L", 3, 4, H, 1);
        Q = addChild(3, 3, "Q", 3, 4, P, 1);
        L.addChild(Q, 1);
        C = addChild(4, 0, "C", 3, 4, B, 1);
        I.addChild(C, 1);
        M = addChild(4, 2, "M", 3, 4, I, 1);
        L.addChild(M, 1);
        R = addChild(4, 3, "R", 3, 4, M, 2);
        Q.addChild(R, 2);
        Node U = addChild(4, 4, "U", 3, 4, R, 2);
        Q.addChild(goal, 1);
        U.addChild(goal, 1);

        order = new AStarSearchOrder();
        problem = new SearchProblem(order);
        problem.doSearch(root);
    }
}
