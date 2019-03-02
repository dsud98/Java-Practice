import java.util.*;
class BinarySearchTree<T extends Number & Comparable<? super T>>{
    class Node<T>{
        T item;
        Node<T> left, right;
        Node(T value) { 
            item = value; 
            left = right = null; 
        } 
    }
    Node<T> root = null;
    Node insert(Node<T> croot, T value){
        if(croot==null){
                croot = new Node(value);
                if (root == null){
                    root = croot;
                }
            }
        else{
            if(value.compareTo(croot.item)<0){
                croot.left = insert(croot.left,value);
            }
            else if(value.compareTo(croot.item)>0){
                croot.right = insert(croot.right,value);
        }
    }
    return croot;
}
    void inorder(Node croot){
        if(croot!=null){
            inorder(croot.left);
            System.out.println(croot.item);
            inorder(croot.right);
        }
    }
}