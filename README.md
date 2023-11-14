# DSA_JAVA
## created own adt for array
## created subsequence pattern
## Sorting algorithms

## BFS DFS
bfs dfs is a important searching techniqes of a Tree <br>
In BFS, we perform level wise traversal of node using queue, when the upper level Nodes are traversed then we come to the lower level nodes. <br>

#### BFS
Queue<Tree> q= new LinkedList<>() <br>
q.add(root) <br>
while(!q.isEmpty){ <br>
itr=q.remove(); <br>
check if conditions for adding childs in queue <br>
} <br>

#### DFS
DFS is a top to bottom search <br>
PREORDER , POSTORDER , INORDER is used in  DFS <br>
INORDER = > Inorder gives soted data of a BST <br>
POSTORDER => postorder can be use when we want to delete tree

 

## GOOGLE AMAZON (most asked)
### Q-> populating next right node imnt perfect Binary Tree?
#### approach=>
the next is also provided hence only use LinkedList Logic to solve this question. <br>
### q= find elemets of tree from right side view
#### approach
traverse level wise and find the last node of each level, it can be found by using nested for loop inside while loop, inside will run till the complete level of tree and add last value<br>

