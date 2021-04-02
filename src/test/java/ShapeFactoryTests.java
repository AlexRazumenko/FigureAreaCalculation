import org.junit.Assert;
import org.junit.Test;


public class ShapeFactoryTests {

    @Test
    public void shouldReturnCircleIfInputEqualsC() {
        Shape actualShape = ShapeFactory.getInstance("C", 5);
        Assert.assertEquals(actualShape.getClass(), Circle.class);
    }

    @Test
    public void shouldReturnSquareIfInputEqualsS() {
        Shape actualShape = ShapeFactory.getInstance("S", 5);
        Assert.assertEquals(actualShape.getClass(), Square.class);
    }

    @Test
    public void shouldReturnSquareWithArea25IfSideEquals5() {
        Shape actualShape = ShapeFactory.getInstance("S", 5);
        Assert.assertEquals(actualShape.getArea(), 25, 0.001);
    }

    @Test
    public void shouldReturnCircleWithArea154IfRadiusEquals7() {
        Shape actualShape = ShapeFactory.getInstance("C", 7);
        Assert.assertEquals(actualShape.getArea(), 154, 0.1);
    }

}
