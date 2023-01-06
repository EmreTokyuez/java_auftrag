public class pyramid  extends figur{    

    public pyramid(float height, float baseArea) {
        this.height = height;
        this.volume = (float) (1.0/3.0 * baseArea * height);
        this.surfaceArea = (float) (baseArea + Math.sqrt(Math.pow(baseArea/2, 2) + Math.pow(height, 2)) * 4);
    }

    @Override
    public String toString() {
        return "pyramid []";
    }
    
}