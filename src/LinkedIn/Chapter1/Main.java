package LinkedIn.Chapter1;

public class Main {
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(120,12,TreeType.OAK);
        if(myFavoriteOakTree.heightFt>100){
            System.out.println("This is a tall tree !");
        }
    }
}
