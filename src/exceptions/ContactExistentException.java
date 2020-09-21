package exceptions;
 

/**
 *
 * @author gabrieliordache
 */
public class ContactExistentException extends RuntimeException {
    
    private String contact;
    
    
    
    public ContactExistentException(String msg){
        super(msg);
    }
    
}
