package Lec1;

public class Practice {
    int t ;
    Practice(int t){
        this.t=t;
    }
    public static void main(String[] args) {
        final Practice obj = new Practice(5);
        obj.t=6;
        //obj = new Practice(6);
    }
}
