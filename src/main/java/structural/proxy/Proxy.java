package structural.proxy;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class Proxy implements Internet {

    private URI defaultSite;

    private WholeInternet internet;
    private List<String> blockedSites = new ArrayList<>();

    public Proxy(WholeInternet internet, URI defaultUri) {
        try {
            this.defaultSite = new URI("google.de");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        this.internet = internet;
    }

    @Override
    public void connect() {
        internet.connect();
    }

    @Override
    public void enterWebSite(URI uri) {
//        if(uri.getPath().contains())
        if (isBlocked(uri)) {
            System.out.println("This URI is BLOCKED");
            internet.enterWebSite(defaultSite);
        } else {
            internet.enterWebSite(uri);
        }
    }

    private boolean isBlocked(URI uri) {
        return blockedSites.stream()
                .anyMatch(uri.getPath()::contains);
    }
}
