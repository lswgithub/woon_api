//트리는 노드 구조 , LinkedList 들로 구성된다.




// 1. 하나의 트리는 root node개를 가진다.
// 2. root 노드는 0 또는 그 이상의 자식 노드들을 가진다.
// 3. 자식 노드들은 0 또는 그이상의 자식 노드들을 가진다.
    
class Node {
    public String id;
    public String name;
    public ArrayList Node[]; 
}

class Tree {
    public Node root;   
}



