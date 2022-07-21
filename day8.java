

class UnivalTree{
    public int value;
    public UnivalTree left;
    public UnivalTree right;
    public UnivalTree(int value, UnivalTree left, UnivalTree right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public int countUni(UnivalTree node){
        int count = 0;
        if(node.left == null && node.right == null){
            return 1;
        }
        if(node.left.value == node.right.value){
            count++;
        }
        if(node.left != null){
            count += countUni(node.left);
        }
        if(node.right != null){
            count += countUni(node.right);
        }
        return count;
    }
}
class day8{
    public static void main(String [] args){
        UnivalTree sample = new UnivalTree(1,
             new UnivalTree(1, null, null), new UnivalTree(0, new UnivalTree(1, new UnivalTree(1, null, null),
              new UnivalTree(1, null, null)), new UnivalTree(0, null, null)));
        System.out.println(sample.countUni(sample));
    }
}