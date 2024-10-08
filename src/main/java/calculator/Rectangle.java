package calculator;

public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(int length){
        this.length = length;
        this.width = length;
    }
    public Rectangle(){
        this.length = 2;
        this.width = 4;
    }


    public static int calculateOpp(int length, int width){return (length * width);}
    public static int calculateOpp(int length){return (length * length);}
    public int calculateOpp(){return (length * width);}

    public static int calculateOm(int length, int width){return ((length*2)+(width*2));}
    public static int calculateOm(int length){return ((length*4));}
    public int calculateOm(){return ((length*2)+(width*2));}
}
