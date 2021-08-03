package security;

public class Rpc {

    private static boolean login ;
    private static String level[] = null ;

    // load user level
    private static void loadUser(){
        // testing
        level = new String[5] ;
        level[0] = "main" ;
        level[1] = "billing" ;
        level[2] = "employee" ;
        level[3] = "page1" ;
        level[4] = "page2" ;

    }

    // login
    public static boolean systemLogin(String user, String pass){
        login = false ;

        if ( user.equals("praveen") & pass.equals("1234")  ){
            login = true ;
            loadUser();
        }
        return login ;
    }

    // return user access
    public static String[] userAllowed(){
        if ( login == false ){
            return null ;
        }

        return  level ;
    }

}
