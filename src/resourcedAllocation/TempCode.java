package resourcedAllocation;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TempCode {
    public static void main(String[] args) throws IOException {
/*        String identifier = null;
        int serverPort = 0;
        String gatewayIP = null;
        int gatewayPort = 0;
        String tempResourceKey = null;
        Integer tempRecourceValue = 0;
        String comparisonKey = null;
        int oldValue = 0;
        boolean isKeyPresent = false;
        HashMap<String, Integer> mapOfResources = new HashMap<String, Integer>();

        String[] check = new String[10];
        check[0] = "-ident";
        check[1] = "123";
        check[2] = "-tcpport";
        check[3] = "9090";
        check[4] = "-gateway";
        check[5] = "localhost:9990";
        check[6] = "A:5";
        check[7] = "C:3";
        check[8] = "D:55";
        check[9] = "Z:88";
        for(int i=0; i <  check.length; i++) {
            switch (check[i]) {
                case "-ident":
                    identifier = check[++i];
                    break;
                case "-tcpport":
                    serverPort = Integer.parseInt(check[++i]);
                    break;
                case "-gateway":
                    String[] gatewayArray = check[++i].split(":");
                    gatewayIP = gatewayArray[0];
                    gatewayPort = Integer.parseInt(gatewayArray[1]);
                    break;
                default:
                    String[] resourceArray = check[++i].split(":");
                    tempResourceKey = resourceArray[0];
                    tempRecourceValue = Integer.parseInt(resourceArray[1]);
                    Iterator<Map.Entry<String, Integer>> iterator = mapOfResources.entrySet().iterator();
                    isKeyPresent = false;
                    while (iterator.hasNext()) {
                        Map.Entry<String, Integer> entry = iterator.next();
                        if (comparisonKey == entry.getKey()) {
                            isKeyPresent = true;
                            oldValue = entry.getValue();
                        }
                    }
                    if (!isKeyPresent) {
                        mapOfResources.put(tempResourceKey, tempRecourceValue);
                    } else {
                        mapOfResources.replace(tempResourceKey, oldValue, oldValue + tempRecourceValue);
                    }
            }
        }
        System.out.println("identifier: " + identifier);
        System.out.println("TCP port: " + serverPort);
        System.out.println("gateway: " + gatewayIP);
        System.out.println("gatewayPort: " + gatewayPort);
        for(Map.Entry<String, Integer> entry : mapOfResources.entrySet()) {
            System.out.println("Resource: " + entry.getKey() + " , quantity: " + entry.getValue());
         */









//----------------------
/*        try {
            while (true) {
                socket = serverSocket.accept();
                inputStreamReader = new InputStreamReader(socket.getInputStream());
                outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
                bufferedReader = new BufferedReader(inputStreamReader);
                bufferedWriter = new BufferedWriter(outputStreamWriter);

                while(true) {
                    String msgFromClient = bufferedReader.readLine();
                    System.out.println("Client " + msgFromClient);
                    bufferedWriter.write("MSG received");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    if(msgFromClient.equalsIgnoreCase("BYE"));
                    break;

                }
                socket.close();
                inputStreamReader.close();
                outputStreamWriter.close();
                bufferedReader.close();
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        }

}
