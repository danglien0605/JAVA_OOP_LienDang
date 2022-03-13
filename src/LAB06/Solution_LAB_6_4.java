package LAB06;

public class Solution_LAB_6_4 {
    public static void main(String[] args) {
        String url = "https://google.com";
        String isHttps = (url.substring(0,5).equals("https")) ? "https" : "http";
        String domainName = url.split("//")[1];
        domainName = domainName.split("\\.")[0];
        String afterDot  = url.split("\\.")[1];

        System.out.printf("URl is %s, domain name is %s, and it is .%s", isHttps, domainName, afterDot);
    }
}
