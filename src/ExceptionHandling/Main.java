package ExceptionHandling;

public class Main {
    public static void main(String[] args) throws MyException {
        int a=5;
        int b = 0;

        //System.out.println(c);
        try{
            divide(5,0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this will always execute, no matter what");
        }


        try{
            String name ="Sam";
            if(name.equals("Sam")){
                throw new MyException("this is my name");
            }
        } catch (MyException e) {
            throw new MyException(e.getMessage());
        }
    }
    static int divide(int a ,int b){
        if(b==0){
            throw new ArithmeticException("don't divide by zero");
        }
        return a/b;
    }
    static int divide2 (int a, int b) throws Exception{
        if(b==0){
            throw new Exception("don't divide by zero");
        }
        return a/b;
    }
}
