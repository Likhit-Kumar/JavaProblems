import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
public class mac {
  
    // method to get the MAC Address
    void getMAC(InetAddress addr) throws SocketException
    {
        // create a variable of type NetworkInterface and
        // assign it with the value returned by the
        // getByInetAddress() method
        NetworkInterface iface
            = NetworkInterface.getByInetAddress(addr);
  
        // create a byte array and store the value returned
        // by the NetworkInterface.getHardwareAddress()
        // method
        byte[] mac = iface.getHardwareAddress();
        
        // convert the obtained byte array into a printable
        // String
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format(
                "%02X%s", mac[i],
                (i < mac.length - 1) ? "-" : ""));
        }
        
        // print the final String containing the MAC Address
        System.out.println(sb.toString());
    }
  
    // Driver method
    public static void main(String[] args) throws Exception
    {
        // a variable of type InetAddress to store the
        // address of the local host
        InetAddress addr = InetAddress.getLocalHost();
        
        // instantiate the MACAddress class
        MACAddress obj = new MACAddress();
        System.out.print("MAC Address of the system : ");
        
        // call the getMAC() method on the current object
        // passing the localhost address as the parameter
        obj.getMAC(addr);
    }
}
