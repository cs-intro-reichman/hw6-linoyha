import java.awt.Color;

public class Editor4 {


public static void main (String[] args) {
    String filename = args[0];
    int n = Integer.parseInt(args[1]);
    Color [][] greyimage = Runigram.read(filename);
    Runigram.setCanvas(greyimage);
    Runigram.morph(greyimage, greyimage, n);   
}
}
