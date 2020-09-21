package exceptions;

/**
 *
 * @author gabrieliordache
 */
public class DataException extends RuntimeException {

    private String data;

    public String getData() {
        return data;
    }
    
    public DataException(String data, String msg){
        super(msg);
        this.data = data;
    }

}
