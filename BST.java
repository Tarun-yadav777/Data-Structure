package data_structure.DSrelated;

class NodeBST
{
    int data;
    NodeBST leftChild;
    NodeBST rightChild;
}
public class BST
{
    NodeBST root;
    public void addNode(int data)
    {
        NodeBST new_node = new NodeBST();
        new_node.data=data;
        if (root == null)
        {
            root = new_node;
        } else
            {
            NodeBST temp_node = root;
            NodeBST parent;
            while (true)
            {
                parent = temp_node;
                if (data < temp_node.data)
                {
                    temp_node = temp_node.leftChild;
                    if (temp_node == null)
                    {
                        parent.leftChild = new_node;
                        return;
                    }
                }
                else
                    {
                    temp_node = temp_node.rightChild;
                    if (temp_node == null)
                    {
                        parent.rightChild = new_node;
                        return;
                    }

                }

            }
        }
    }
    public void inorderTraverse(NodeBST temp_node)
    {
        if(temp_node!=null)
        {
            inorderTraverse(temp_node.leftChild);
            System.out.print(temp_node.data+",");
            inorderTraverse(temp_node.rightChild);
        }
    }
    public void preorderTraverse(NodeBST temp_node)
    {
        if(temp_node!=null)
        {
            System.out.print(temp_node.data+",");
            preorderTraverse(temp_node.leftChild);
            preorderTraverse(temp_node.rightChild);
        }
    }
    public void postorderTraverse(NodeBST temp_node)
    {
        if(temp_node!=null)
        {
            postorderTraverse(temp_node.leftChild);
            postorderTraverse(temp_node.rightChild);
            System.out.print(temp_node.data+",");
        }
    }
    public NodeBST findNode(int data)
    {
        NodeBST temp_node = root;
        while(temp_node.data!=data)
        {
         if(data<temp_node.data)
             temp_node=temp_node.leftChild;
         else
             temp_node=temp_node.rightChild;
         if(temp_node==null)
             return null;
        }
        return temp_node;
    }


    public static void main(String arg[])
    {
        BST tree = new BST();
        tree.addNode(65);
        tree.addNode(85);
        tree.addNode(88);
        tree.addNode(32);
        tree.addNode(60);
        tree.addNode(27);
        tree.addNode(73);
        tree.addNode(71);
        tree.addNode(62);
        System.out.println("Inorder traverse elements =");
        tree.inorderTraverse(tree.root);
        System.out.println();
        System.out.println("Pre order traverse elements =");
        tree.preorderTraverse(tree.root);
        System.out.println();
        System.out.println("Post order traverse elements =");
        tree.postorderTraverse(tree.root);
        System.out.println();
        tree.findNode(27);
        tree.findNode(98);
    }
}
