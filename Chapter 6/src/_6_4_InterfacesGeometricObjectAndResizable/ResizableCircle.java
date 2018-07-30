package _6_4_InterfacesGeometricObjectAndResizable;
/*
 * 
 * @author DNABigBoss - hanunalya22@gmail.com
 * 
 */
public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius *= percent/100.0;
    }
}
