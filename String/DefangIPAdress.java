package String;

public class DefangIPAdress {
    public String defangIPaddr(String address) {
        String [] array = address.split("\\.");
        
        StringBuilder sb = new StringBuilder();
        for (String octet: array) {
            sb.append(octet);
            sb.append("[.]");
        }
        
        return sb.substring(0, sb.length() - 3).toString();
    } 
}
