public class Main {
    public static void main (String[] args){
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle=new RedShapeDecorator(new Rectangle());
        System.out.println("circle without border:");
        circle.draw();
        System.out.println("\ncircle with red bordure:");
        redCircle.draw();
        System.out.println("\nRectangle with red bordure:");
        redRectangle.draw();
    }
}
