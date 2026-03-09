class VolumeCalculator { 
    double calculateVolume(double side) { 
        return side * side * side; 
    } 
 
    double calculateVolume(double length, double width, double height) { 
        return length * width * height; 
    } 
 
    double calculateVolume(double radius, boolean isSphere) { 
        return (4.0 / 3.0) * Math.PI * radius * radius * radius; 
    } 
 
    public static void main(String[] args) { 
        VolumeCalculator vc = new VolumeCalculator(); 
        double cubeVolume = vc.calculateVolume(4); 
        double rectangularCubeVolume = vc.calculateVolume(4, 5, 6); 
        double sphereVolume = vc.calculateVolume(3, true); 
        System.out.println("Preksha - 240390107031"); 
        System.out.println("Volume of Cube: " + cubeVolume); 
        System.out.println("Volume of Rectangular Cube: " + rectangularCubeVolume); 
        System.out.println("Volume of Sphere: " + sphereVolume); 
    } 
}