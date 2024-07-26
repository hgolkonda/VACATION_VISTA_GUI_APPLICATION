/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.RecreationEvents.SwimmingPool;

import Enterprise.Commute.BookaRide.Vehicle;
import java.util.ArrayList;

/**
 *
 * @author saneeth
 */
public class SwimmingPoolList {
    ArrayList<SwimmingPool> swimmingPoolList;
    
    public SwimmingPoolList(){
        this.swimmingPoolList = new ArrayList<>();
    }

    public ArrayList<SwimmingPool> getPoolDirectory() {
        return swimmingPoolList;
    }

    public void setPoolDirectory(ArrayList<SwimmingPool> poolDirectory) {
        this.swimmingPoolList = poolDirectory;
    }
    
    public SwimmingPool getPools(int index){
        SwimmingPool newPool = new SwimmingPool();
        newPool = swimmingPoolList.get(index);
        return newPool;
    }
    
    public SwimmingPool addPoolDetails(){
        SwimmingPool newPool = new SwimmingPool();
        swimmingPoolList.add(newPool);
        
        return newPool;
    }
    
    public SwimmingPool getPoolByName(String poolName) {
        
        SwimmingPool selectedPool = new SwimmingPool();
        for(SwimmingPool pool : swimmingPoolList) {
            if(pool.getSwimmingpoolName().equals(poolName)) {
                selectedPool = pool;
                break;
            }
        }
        return selectedPool;
    }
    
    public void deletePool(SwimmingPool pool){
        swimmingPoolList.remove(pool);
    }
    
}
