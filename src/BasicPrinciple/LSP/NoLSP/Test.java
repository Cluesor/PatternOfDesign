package BasicPrinciple.LSP.NoLSP;

public class Test {
    public static void resize(Rectangle rectangle){     // 输入参数只针对长方形有效，无法将正方形作为参数
        while (rectangle.getWidth() > rectangle.getHeight()){
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("Width: " + rectangle.getWidth()+ "," + "Height:" + rectangle.getHeight());
        }
        System.out.println("Resize End ," + "Width: " + rectangle.getWidth()+ " ," + " Height:" + rectangle.getHeight());


    }

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(20);
//        rectangle.setHeight(10);
//        resize(rectangle);

        Square square = new Square();
//        square.setWidth(20);
//        square.setHeight(10);
        square.setLength(10);
        resize(square);

}

}
