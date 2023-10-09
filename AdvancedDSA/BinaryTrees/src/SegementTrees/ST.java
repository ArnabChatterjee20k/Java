package SegementTrees;

public class ST {
    private class Node {
        int data;
        int startInterval;
        int endInterval;
        Node lefNode;
        Node riNode;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

    }

    Node rooNode;

    public ST(int[] arr) {
        this.rooNode = constructTree(arr, 0, arr.length - 1);
    }
    
    
    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node subTreeRoot = new Node(start, end);

        int mid = (end + start) / 2;

        subTreeRoot.lefNode = constructTree(arr, start, mid);
        subTreeRoot.riNode = constructTree(arr, mid + 1, end);

        subTreeRoot.data = subTreeRoot.lefNode.data + subTreeRoot.riNode.data;
        
        return subTreeRoot;
    }
    
    public void print(){
        System.out.println("Printing from bottom to top");
        printTree(rooNode);
    }

    private void printTree(Node node) {
        if (node == null) {
            return;
        }
        printTree(node.lefNode);
        printTree(node.riNode);
        System.out.println(node.data + " , " + node.startInterval + " , " + node.endInterval);
    }

    public int query(int start,int end){
        return query(rooNode, start, end);
    }

    private int query(Node node,int start, int end){
        if(node == null){
            return 0;
        }
        // node interval inside the query interval
        else if(node.startInterval>=start && node.endInterval<=end){
            return node.data;
        }
        // outiside
        else if(node.startInterval>end && node.endInterval < start){
            return 0;
        }
        // overlapping
        return this.query(node.lefNode, start, end) + this.query(node.riNode, start, end);
    }

    public void update(int index,int val){
        update(rooNode, index, val);
    }

    private int update(Node node,int index,int val){
        if(index>=node.startInterval && index<=node.endInterval){
            if(index == node.startInterval && index == node.endInterval){
                node.data = val;
                return node.data;
            }
            else{
                int left = update(node.lefNode, index, val);
                int right = update(node.riNode, index, val);
                node.data = left + right;
                return node.data;
            }
        }
        
        return node.data;
    }
}