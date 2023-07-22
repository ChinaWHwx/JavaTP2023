package Heritage.Interface;
import Exception.FormatException;

class PNG extends Image {
    public String url;

    final String MIME_TYPE = "image/png";

    public PNG(){
        String mimeType = MIME_TYPE;
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
