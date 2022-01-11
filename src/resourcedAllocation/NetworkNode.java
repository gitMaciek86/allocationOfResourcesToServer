package resourcedAllocation;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NetworkNode {
    public static void main(String[] args) throws IOException {
        boolean isMaster = true;
        String identifier = null;
        int serverPort = 0;
        String gatewayIP = null;
        int gatewayPort = 0;
        String tempResourceKey = null;
        Integer tempRecourceValue = 0;
        String comparisonKey = null;
        int oldValue = 0;
        boolean isKeyPresent = false;
        HashMap<String, Integer> mapOfResources = new HashMap<String, Integer>();

        for (int i=0; i <args.length; i++) {
            if(args[i] == "-gateway") {
                isMaster = false;
            }
        }

        if(!isMaster) {
            for(int i=0; i <  args.length; i++) {
                switch (args[i]) {
                    case "-ident":
                        identifier = args[++i];
                        break;
                    case "-tcpport":
                        serverPort = Integer.parseInt(args[++i]);
                        break;
                    case "-gateway":
                        String[] gatewayArray = args[++i].split(":");
                        gatewayIP = gatewayArray[0];
                        gatewayPort = Integer.parseInt(gatewayArray[1]);
                        break;
                    default:
                        String[] resourceArray = args[++i].split(":");
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
        } else {
            for(int i=0; i <  args.length; i++) {
                switch (args[i]) {
                    case "-ident":
                        identifier = args[++i];
                        break;
                    case "-tcpport":
                        serverPort = Integer.parseInt(args[++i]);
                        break;
                    default:
                        String[] resourceArray = args[++i].split(":");
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
        }


       /* try {
            Socket socket= null;
            InputStreamReader inputStreamReader = null;
            OutputStreamWriter outputStreamWriter = null;
            BufferedReader bufferedReader = null;
            BufferedWriter bufferedWriter = null;
            ServerSocket serverSocket = null;
            serverSocket =  new ServerSocket(1234);

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
