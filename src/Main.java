import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main extends Model {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        Model Kamil = new Model();

        try {
            Kamil.htmlWork();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
