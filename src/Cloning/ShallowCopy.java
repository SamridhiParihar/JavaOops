package Cloning;

import Lec4.Access.A;

public class ShallowCopy {
    public static class Book implements Cloneable{
        String title;
        Author author;
        Book(String title, Author author){
            this.title=title;
            this.author = author;
        }
        @Override
        public Object clone () throws CloneNotSupportedException {
            return super.clone();
        }
    }
    public static class Author{
        String name;
        int age ;
        Author(String name, int age){
            this.name=name;
            this.age=age;
        }
    }
    public static void main(String[]args) throws CloneNotSupportedException {
        Book obj = new Book("Happpy Faces", new Author("Sam",22));
        Book copyObj = (Book) obj.clone();
        obj.author.name = "Parihar";
        obj.author.age = 23;
        System.out.println(copyObj.author.age+" "+copyObj.author.name);
    }
}
