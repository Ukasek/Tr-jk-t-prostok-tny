public class TestTriangle {
    public static void main(String[] args) {
        TriangleCheck triangleChceck = new TriangleCheck();

        Triangle triangle = new Triangle(60, 60, 60);
        System.out.println("Czy trójkąt jest prostokątny?: " + triangleChceck.isRightTriangle(triangle));

        Triangle triangle2 = new Triangle(30, 60, 90);
        System.out.println("Czy trójkąt jest prostokątny?: " + triangleChceck.isRightTriangle(triangle2));


    }
}
