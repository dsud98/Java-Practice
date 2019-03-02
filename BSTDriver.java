import java.util.Scanner;

class BSTDriver{
    public static void main(String[] args) {
        BinarySearchTree<Integer> obj = new BinarySearchTree<>();
        while(true){
            System.out.println("type insert or display");
            Scanner sc = new Scanner(System.in);
            String c = sc.next();
            if(c.equals("insert")){
                obj.insert(obj.root , sc.nextInt());
            }
            else if(c.equals("display")){
                obj.inorder(obj.root);
            }
            else{
                break;
            }
        }
    }
}