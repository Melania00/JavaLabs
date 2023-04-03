package ua.lviv.iot.algo.part1.labs;
import lombok.*;

import java.util.LinkedList;
import java.util.List;

@ToString
@Getter

public class FridgeManager {
    private static LinkedList<FridgeCamera> fridgesCameraList;
    private static int[] fridgeCameraCapacity = {3, 5, 1};
    private static String[] brand = {"Nexus","Samsung","Apple"};
    private static int[] volumePerKilogram= {2,4,5};

    private static LinkedList<WineFridge> wineFridges;
    private static int[] fridgeWineCapacity = {1,2,3};

    public static void main(String[] args) {
        fridgesCameraList = new LinkedList<>();
        for(int i = 0; i < fridgeCameraCapacity.length; i++){
            fridgesCameraList.add(new FridgeCamera(brand[i],"dfy677y",fridgeCameraCapacity[i],true,"A",1,"mechanic",20,1,15));
        }

        wineFridges = new LinkedList<>();
        for(int i = 0; i < fridgeWineCapacity.length; i++){
            wineFridges.add(new WineFridge(brand[i],"ff4hh8",fridgeWineCapacity[i],false, "B", 40, 2));
        }

        for (FridgeCamera item : fridgesCameraList) {
            item.toString(item);
        }
        for (WineFridge item : wineFridges) {
            item.toString(item);
        }
    }
}
