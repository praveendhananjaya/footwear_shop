public class Rpc {
    public boolean systemLogin(String user, String pass){
        boolean login = false ;

        if ( user.equals("praveen") & pass.equals("1234")  ){
            login = true ;
        }
        return login ;
    }
}
