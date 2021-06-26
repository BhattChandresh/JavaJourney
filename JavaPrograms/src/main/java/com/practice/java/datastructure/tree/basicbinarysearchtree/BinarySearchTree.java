package com.practice.java.datastructure.tree.basicbinarysearchtree;

public class BinarySearchTree {
    private Node root;

    public void insert(int key, String value) {
        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key < current.key) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node findMin() {
        Node current = root;
        Node last = null;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node findMax() {
        Node current = root;
        Node last = null;
        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public boolean remove(int key) {
        Node currentNode = root;
        Node parentNode = root;
        boolean isLeftChild = false;

        // searching to find the node with the key to delete.
        while (currentNode.key != key) {
            parentNode = currentNode;
            if (key < currentNode.key) {
                isLeftChild = true;
                currentNode = currentNode.leftChild;
            } else {
                isLeftChild = false;
                currentNode = currentNode.rightChild;
            }

            if (currentNode == null) {
                return false;
            }
        }

        //found the node
        Node nodeToDelete = currentNode;

        // if node is  a leaf.
        if (nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
            if (nodeToDelete == root) {
                root = null;
            } else if (isLeftChild) {
                parentNode.leftChild = null;
            } else {
                parentNode.rightChild = null;
            }
        } else if (nodeToDelete.rightChild == null) {  // if node has a child ->  left child
            if (nodeToDelete == root) {
                root = nodeToDelete.leftChild;
            } else if (isLeftChild) {
                parentNode.leftChild = nodeToDelete.leftChild;
            } else {
                parentNode.rightChild = nodeToDelete.leftChild;
            }
        } else if (nodeToDelete.leftChild == null) {
            if (nodeToDelete == root) {
                root = nodeToDelete.rightChild;
            } else if (isLeftChild) {
                parentNode.leftChild = nodeToDelete.rightChild;
            } else {
                parentNode.rightChild = nodeToDelete.rightChild;
            }
        } else { // if node has 2 children.
            Node successor = getSuccessor(nodeToDelete);
            //connect the parent of NodeToDelete to instead.
            if (nodeToDelete == root) {
                root = successor;
            } else if (isLeftChild) {
                parentNode.leftChild = successor;
            } else {
                parentNode.rightChild = successor;
            }
            successor.leftChild = nodeToDelete.leftChild;
        }
        return true;
    }

    private Node getSuccessor(Node nodeToDelete) {
        Node successorParent = nodeToDelete;
        Node successor = nodeToDelete;

        Node current = nodeToDelete.rightChild; //Go to the right child
        while (current != null) {  //Start going left down tree until node has no left child.
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        // if successor not a right child.
        if (successor != nodeToDelete.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = nodeToDelete.rightChild;
        }
        return successor;
    }
/*
    void displayTree() {
        Stack globalStack = new Stack<>();
        globalStack.push(root);
        int nBlanks =  32;
        boolean isRowEmpty = false;
        System.out.println("**************************************************************************************");

        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for(int index=0; index< nBlanks;index++) {
                System.out.println("  ");
            }

            while(globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if(temp != null) {
                    System.out.println(temp.key);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if(temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.println("--");
                    localStack.push(null);
                    localStack.push(null);
                }

                for(int index=0;index<nBlanks*2  - 2;index++) {
                    System.out.println("  ");
                }
            }
            System.out.println();
            nBlanks = nBlanks/2;
            while(localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        }
        System.out.println("**************************************************************************************");
    }
 */
}
