/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.RecreationEvents.SwimmingPool;

/**
 *
 * @author saneeth
 */
public class SwimmingPool {
    String swimmingpoolId;
    String swimmingpoolName;
    Float price;

    public String getSwimmingpoolId() {
        return swimmingpoolId;
    }

    public void setSwimmingpoolId(String swimmingpoolId) {
        this.swimmingpoolId = swimmingpoolId;
    }

    public String getSwimmingpoolName() {
        return swimmingpoolName;
    }

    public void setSwimmingpoolName(String swimmingpoolName) {
        this.swimmingpoolName = swimmingpoolName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    
     @Override
    public String toString(){
        return swimmingpoolName;
    }
    
}
