package main;

import tree.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<String> x = new Node<String>("parent1");
        Node<String> y = new Node<String>("parent2");

        System.out.println(x.getRoot());

        Node<String> child1 = x.addChild("child1");
        {
            Node<String> innerChild1 = child1.addChild("innerChild1OfChild1");
            Node<String> innerChild2 = child1.addChild("innerChild2OfChild1");
            Node<String> innerChild3 = child1.addChild("innerChild3OfChild1");

            System.out.println("-" + child1);

            System.out.println("--" + innerChild1);
            System.out.println("--" + innerChild2);
            System.out.println("--" + innerChild3);

            System.out.println("Level of child1: " + child1.getLevel());
            System.out.println("Level of innerChild2 in Child1: " + innerChild2.getLevel());


        }

        System.out.println();

        System.out.println(y.getRoot());


        Node<String> child2 = x.addChild("child2");
        {
            Node<String> innerChild1 = child2.addChild("innerChild2OfChild2");
            Node<String> innerChild2 = child2.addChild("innerChild3OfChild2");
            Node<String> innerChild3 = child2.addChild("innerChild4OfChild2");
            {
                Node<String> innerChild4 = innerChild3.addChild("innerChild4OfChild3");
                System.out.println(innerChild4.getLevel());
                System.out.println("\nIs inner Child4 Leaf? " + innerChild4.isLeaf());
            }

            System.out.println("-" + child2);

            System.out.println("--" + innerChild1);
            System.out.println("--" + innerChild2);
            System.out.println("--" + innerChild3);

            System.out.println("Level of child1: " + child2.getLevel());
            System.out.println("Level of innerChild2 in Child2: " + innerChild2.getLevel());


        }
	}

}
