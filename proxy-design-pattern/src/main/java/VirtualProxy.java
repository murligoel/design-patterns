interface IImage {
    void display();
}

class RealImage implements IImage {

    private String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
        System.out.println("[RealImage] Loading image from disk: " + fileName);
    }
    @Override
    public void display() {
        System.out.println("[RealImage] Displaying " + fileName);
    }
}
class ImageProxy implements IImage {

    private RealImage realImage;
    private String fileName;

    public ImageProxy(String file) {
        this.fileName = file;
        this.realImage = null;
    }
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

public class VirtualProxy {

    public static void main(String[] args) {
        IImage image = new ImageProxy("RealImage.jpg");
        image.display();
    }
}
