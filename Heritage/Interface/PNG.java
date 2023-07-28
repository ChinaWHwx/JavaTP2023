package Heritage.Interface;
import Exception.FormatException;

class PNG extends Image {
    public String url;

    final String MIME_TYPE = "image/png";


    public PNG() {
        // 将MIME_TYPE值分配给对象
        String mimeType = MIME_TYPE;
        System.out.println("MIME Type: " + mimeType);
    }
    public PNG(String url) {
        super(url);
    }

    public PNG(int width, int height) {
        super(width, height);
    }

    @Override
    public void load(String url) throws FormatException {
        super.load(url);
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public String log() {
        return super.log();
    }
}
