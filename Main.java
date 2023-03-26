    import java.io.File;

    import net.sourceforge.tess4j.Tesseract;
    import net.sourceforge.tess4j.TesseractException;
    public class Main {
        public static void main(String[] args) {
            Tesseract tess = new Tesseract();

            try {
                tess.setDatapath("\"C:\\Users\\caohu\\Rowdy_Hacks\\Tess4J-3.4.8-src\\Tess4J\\tessdata\"");
                String text = tess.doOCR(new File(("\"C:\\Users\\caohu\\Rowdy_Hacks\\RowdyHack\\test_image.jpg\"")));

                System.out.println(text);

            }
            catch (TesseractException e)
            {
                e.printStackTrace();
            }
        }
    }
