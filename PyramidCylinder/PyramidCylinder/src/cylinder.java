public class cylinder extends figur {
    float radius;
    float lateralSurfaceArea;
    float baseArea;

    public cylinder(float height, float radius) {
        this.height = height;
        this.radius = radius;
        this.volume = (float) (Math.PI * Math.pow(radius, 2) * height);
        this.surfaceArea = (float) (2 * Math.PI * radius * (radius + height));
        this.lateralSurfaceArea = (float) (2 * Math.PI * radius * height);
        this.baseArea = (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "cylinder [radius=" + radius + ", lateralSurfaceArea=" + lateralSurfaceArea + ", baseArea=" + baseArea
                + "]";
    }
    
}
