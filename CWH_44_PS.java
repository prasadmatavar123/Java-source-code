class Cylinder{
    private int radius;
    public int getRadius(){
        return radius;
    }
    private int height;
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    
}
public class CWH_44_PS {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println(h);
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        
    }
    
}
