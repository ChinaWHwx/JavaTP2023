package Heritage.Interface;

import Exception.FormatException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;


abstract class Image implements VisualElement{
    private BufferedImage image;

    public String imageUrl;
    private int width;
    private int height;
    protected enum mime_type{
        PNG,
        JPEG
    }
    public void load(String url) throws FormatException{
        if(!(url instanceof String)){
            throw  new FormatException("Unknown format");
        }
    }

    public Image(int width,int height){
        this.image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        this.width = width;
        this.height = height;
    }

    public Image(String url){
        //URL imageUrl = new URL(url);
        //this.image = ImageIO.read(imageUrl);
        this.imageUrl = url;
        if (imageUrl != null) {
            this.width = image.getWidth();
            this.height = image.getHeight();
        } else {
            this.width = 0;
            this.height = 0;
        }//不加载异常的方式来赋值
        /*
        try{
            URL imageUrl = new URL(url);
            this.image = ImageIO.read(imageUrl);
            if (image != null) {
                this.width = image.getWidth();
                this.height = image.getHeight();
            } else {
                this.width = 0;
                this.height = 0;
            }
        }catch (IOException e){
            this.width = 0;
            this.height = 0;
        }
        */
    }
    @Override
    public void display() {

    }

    @Override
    public String log() {
        return null;
    }

    /*
    @Override
    public void log(Function<String, String> logger) {
        // Call the log() method of the parent class
        super.log(logger);

        // Add "Image" to the log message
        String logMessage = "Image " + logger.apply("");
        System.out.println(logMessage);
    }
     */
}
