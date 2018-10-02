//트리는 노드 구조 , LinkedList 들로 구성된다.



class Node {
    public String id;
    public String name;
    public ArrayList Node[]; 
}
// 1. 하나의 트리는 root node개를 가진다.
// 2. root 노드는 0 또는 그 이상의 자식 노드들을 가진다.
// 3. 자식 노드들은 0 또는 그이상의 자식 노드들을 가진다.
    

class Tree {
    public Node root;   
//Binary Tree Traversal
////In-Order Traversal   
    void orderTraversal(Tree node, OrderType orderType) {
        if ( node != null) {
            String selectedType = orderType.getType();
            if (selectedType == "IN_ORDER") {
                inOrderTraversal(node.left);
                visit(node);
                inOrderTraversal(node.right);

            } else if (selectedType == "PRE_ORDER") {
                visit(node);
                inOrderTraversal(node.left);
                inOrderTraversal(node.righ);
                
            } else if (selectedType = "POST_ORDER") {
                inOrderTraversal(node.left);
                inOrderTraversal(node.right);
                visit(node);
                
            }
            
        }
    }
//     
    
}

//이진 트리 (binary tree) 
// 가각의 노드가 최대 두 개의 자식 노드를 가지는 트리 자료구조





