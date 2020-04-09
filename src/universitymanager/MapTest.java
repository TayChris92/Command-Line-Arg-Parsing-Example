package universitymanager;

import java.util.HashMap;

public class MapTest {

    HashMap<String,String> mapOfXTC = new HashMap<String,String>();

    public MapTest() {
      mapOfXTC.put("Philip Pleins", "200mg");
      mapOfXTC.put("Red Tesla", "1000000mg");
      mapOfXTC.put("Orange ??", "?????? mg");
        mapOfXTC.put("Philip Pleins", "200mg");  //hello
        mapOfXTC.put("Red Tesla", "1000000mg");
        mapOfXTC.put("Orange ??", "?????? mg");
        mapOfXTC.put("Philip Pleins", "200mg");
        mapOfXTC.put("Red Tesla", "1000000mg");
        mapOfXTC.put("Orange ??", "?????? mg");
        mapOfXTC.put("Philip Pleins", "200mg");
        mapOfXTC.put("Red Tesla", "1000000mg");
        mapOfXTC.put("Orange ??", "?????? mg");
        mapOfXTC.put("Philip Pleins", "200mg");
        mapOfXTC.put("Red Tesla", "1000000mg");
        mapOfXTC.put("Orange ??", "?????? mg");
        mapOfXTC.put("Philip Pleins", "200mg");
        mapOfXTC.put("Red Tesla", "1000000mg");
        mapOfXTC.put("Orange ??", "?????? mg");




            System.out.println(mapOfXTC.keySet());
            System.out.println(mapOfXTC.values());
        System.out.println(mapOfXTC.entrySet());

        System.out.println("---------------------------------------");

        mapOfXTC.forEach((key, value) -> {
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        });


    }
}
