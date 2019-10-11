
public class Result {
    
    private int exitCode;
    private String msg;
     
    public Result(int exitCode, String msg) {
        this.exitCode = exitCode; 
        this.msg = msg;
    }
   
    public int exitCode() {
        return exitCode;
    }
   public String msg() {
       return msg;
    }
    
    
}

