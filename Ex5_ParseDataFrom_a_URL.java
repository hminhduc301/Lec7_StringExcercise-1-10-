package Lec7_string;

public class Ex5_ParseDataFrom_a_URL {

    public static void parseURL(String url) {
        int protocolEnd = url.indexOf("://");
        String protocol = url.substring(0, protocolEnd);
        int domainEnd = url.indexOf("/", protocolEnd + 3);
        String domain = url.substring(protocolEnd + 3, domainEnd);
        String path = url.substring(domainEnd);
        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);
    }

    public static void main(String[] args) {
        String inputUrl = "https://dtu.edu.vn/portals/0/home.aspx";
        System.out.println(" \"" + inputUrl + "\"");
        parseURL(inputUrl);

        System.out.println();

    }
}
