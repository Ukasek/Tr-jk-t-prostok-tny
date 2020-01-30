public class TriangleCheck {
    Triangle triangle;


    boolean isRightTriangle(Triangle triangle) {
        if (triangle.getAngle1() == 90 || triangle.getAngle2() == 90 || triangle.getAngle3() == 90) {
            return true;
        } else {
            return false;
        }
    }
}



