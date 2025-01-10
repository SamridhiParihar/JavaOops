package LinkedIn.Chapter1;

public class Tree {
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;
    public Tree(double heightFt,double trunkDiameterInches , TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }
    void grow(){
        this.heightFt= heightFt+10;
        this.trunkDiameterInches = trunkDiameterInches+1;
    }
    void announceTallTree(){
        if(this.heightFt>100){
            System.out.println("this is tall tree!");
        }
    }

}
