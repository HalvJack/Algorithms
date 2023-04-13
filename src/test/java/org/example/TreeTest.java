package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class TreeTest {


    @Test
    void countLeaves() {
        Tree tree = new Tree();
        tree.addNode(5);
        tree.addNode(3);
        tree.addNode(7);
        tree.addNode(2);
        tree.addNode(5);
        tree.addNode(1);
        tree.addNode(0);
        tree.addNode(2);
        tree.addNode(8);

        tree.addNode(6, 3, true); // insert 6 as the left child of 3
        tree.addNode(4, 5, false); // insert 4 as the right child of 5
        //when
        int result = tree.countLeaves();
        //then
        Assertions.assertEquals(5,result);
        //then
    }

    @Test
    void maxDepth() {
        Tree tree = new Tree();
        tree.addNode(5);
        tree.addNode(3);
        tree.addNode(7);
        tree.addNode(2);
        tree.addNode(5);
        tree.addNode(1);
        tree.addNode(0);
        tree.addNode(2);
        tree.addNode(8);

        tree.addNode(6, 3, true); // insert 6 as the left child of 3
        tree.addNode(4, 5, false); // insert 4 as the right child of 5
        //when
        int result = tree.maxDepth();
        //then
        Assertions.assertEquals(5,result);
        //then
    }
}