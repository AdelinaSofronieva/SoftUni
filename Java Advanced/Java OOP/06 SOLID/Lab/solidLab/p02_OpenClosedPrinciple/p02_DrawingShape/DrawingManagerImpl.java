package J06SOLID.Lab.solidLab.p02_OpenClosedPrinciple.p02_DrawingShape;

import J06SOLID.Lab.solidLab.p01_SingleResponsibility.p01_DrawingShape.interfaces.DrawingManager;
import J06SOLID.Lab.solidLab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;


public class DrawingManagerImpl implements DrawingManager {


    @Override
    public void draw(Shape shape) {
        if (shape instanceof Circle)
        {
            this.drawCircle((Circle)shape);
        }
            else if (shape instanceof Rectangle)
        {
            this.drawRectangle(((Rectangle)shape));
        }
    }
    public void drawCircle(Circle circle)
    {
        // Draw Circle
    }

    public void drawRectangle(Rectangle rectangle)
    {
        // Draw Rectangle
    }
}
