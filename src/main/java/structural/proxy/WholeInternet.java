package structural.proxy;

import java.net.URI;

public class WholeInternet implements Internet{

    public void connect(){
        System.out.println("Connecting to the internet");
    }

    public void enterWebSite(URI uri){
        System.out.println("Entered website: " + uri.getPath());
    }
}
