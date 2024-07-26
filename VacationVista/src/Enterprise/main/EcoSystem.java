/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.main;

import Enterprise.DiningMenu.MenuSelectionList;
import Enterprise.Maintenance.Laundry.LaundryServiceList;
import Enterprise.Maintenance.RoomSanitizing.CaretakerShiftList;
import Enterprise.RecreationEvents.GameRoom.GameRoomList;
import Enterprise.RecreationEvents.SwimmingPool.SwimmingPoolList;
import Enterprise.InhouseShoppingMall.GiftwareList;
import Enterprise.Payments.CustomerPaymentsList;
import Enterprise.Commute.BookaRide.VehicleList;
import Enterprise.Customer.CustomerList;
import Enterprise.ServiceRequest.DiningRoomServiceRequestList;
import Enterprise.ServiceRequest.GameRoomServiceRequestList;
import Enterprise.ServiceRequest.LaundryServiceRequestList;
import Enterprise.ServiceRequest.SwimmingPoolServiceRequestList;
import Enterprise.ServiceRequest.VehicleServiceRequestList;

/**
 *
 * @author saneeth
 */
public class EcoSystem {

    private static EcoSystem ecoSystem;
    CustomerList customerList;
    VehicleList vehicleList;
    GiftwareList giftwareList;
    SwimmingPoolList swimmingPoolList;
    GameRoomList gameRoomList;
    LaundryServiceList laundryServiceList;
    MenuSelectionList menuSelectionList;
    DiningRoomServiceRequestList diningRoomServiceRequestList;
    GameRoomServiceRequestList gameRoomServiceRequestList;
    LaundryServiceRequestList laundryServiceRequestList;
    SwimmingPoolServiceRequestList swimmingPoolServiceRequestList;
    VehicleServiceRequestList vehicleServiceRequestList;
    CustomerPaymentsList customerPaymentsList;
    CaretakerShiftList caretakerShiftList;

    public static EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public static void setEcoSystem(EcoSystem ecoSystem) {
        EcoSystem.ecoSystem = ecoSystem;
    }

    public CustomerList getCustomerList() {
        return customerList;
    }

    public void setCustomerList(CustomerList customerList) {
        this.customerList = customerList;
    }

    public VehicleList getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(VehicleList vehicleList) {
        this.vehicleList = vehicleList;
    }

    public GiftwareList getGiftwareList() {
        return giftwareList;
    }

    public void setGiftwareList(GiftwareList giftwareList) {
        this.giftwareList = giftwareList;
    }

    public SwimmingPoolList getSwimmingPoolList() {
        return swimmingPoolList;
    }

    public void setSwimmingPoolList(SwimmingPoolList swimmingPoolList) {
        this.swimmingPoolList = swimmingPoolList;
    }

    public GameRoomList getGameRoomList() {
        return gameRoomList;
    }

    public void setGameRoomList(GameRoomList gameRoomList) {
        this.gameRoomList = gameRoomList;
    }

    public LaundryServiceList getLaundryServiceList() {
        return laundryServiceList;
    }

    public void setLaundryServiceList(LaundryServiceList laundryServiceList) {
        this.laundryServiceList = laundryServiceList;
    }

    public MenuSelectionList getMenuSelectionList() {
        return menuSelectionList;
    }

    public void setMenuSelectionList(MenuSelectionList menuSelectionList) {
        this.menuSelectionList = menuSelectionList;
    }

    public DiningRoomServiceRequestList getDiningRoomServiceRequestList() {
        return diningRoomServiceRequestList;
    }

    public void setDiningRoomServiceRequestList(DiningRoomServiceRequestList diningRoomServiceRequestList) {
        this.diningRoomServiceRequestList = diningRoomServiceRequestList;
    }

    public GameRoomServiceRequestList getGameRoomServiceRequestList() {
        return gameRoomServiceRequestList;
    }

    public void setGameRoomServiceRequestList(GameRoomServiceRequestList gameRoomServiceRequestList) {
        this.gameRoomServiceRequestList = gameRoomServiceRequestList;
    }

    public LaundryServiceRequestList getLaundryServiceRequestList() {
        return laundryServiceRequestList;
    }

    public void setLaundryServiceRequestList(LaundryServiceRequestList laundryServiceRequestList) {
        this.laundryServiceRequestList = laundryServiceRequestList;
    }

    public SwimmingPoolServiceRequestList getSwimmingPoolServiceRequestList() {
        return swimmingPoolServiceRequestList;
    }
    

    public void setSwimmingPoolServiceRequestList(SwimmingPoolServiceRequestList swimmingPoolServiceRequestList) {
        this.swimmingPoolServiceRequestList = swimmingPoolServiceRequestList;
    }

    public VehicleServiceRequestList getVehicleServiceRequestList() {
        return vehicleServiceRequestList;
    }

    public void setVehicleServiceRequestList(VehicleServiceRequestList vehicleServiceRequestList) {
        this.vehicleServiceRequestList = vehicleServiceRequestList;
    }

    public CustomerPaymentsList getCustomerPaymentsList() {
        return customerPaymentsList;
    }

    public void setCustomerPaymentsList(CustomerPaymentsList customerPaymentsList) {
        this.customerPaymentsList = customerPaymentsList;
    }

    public CaretakerShiftList getCaretakerShiftList() {
        return caretakerShiftList;
    }

    public void setCaretakerShiftList(CaretakerShiftList caretakerShiftList) {
        this.caretakerShiftList = caretakerShiftList;
    }

   
    public static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    private EcoSystem() {

        customerList = new CustomerList();
        vehicleList = new VehicleList();
        giftwareList = new GiftwareList();
        swimmingPoolList = new SwimmingPoolList();
        gameRoomList = new GameRoomList();
        laundryServiceList = new LaundryServiceList();
        menuSelectionList = new MenuSelectionList();
        diningRoomServiceRequestList = new DiningRoomServiceRequestList();
        gameRoomServiceRequestList = new GameRoomServiceRequestList();
        laundryServiceRequestList = new LaundryServiceRequestList();
        swimmingPoolServiceRequestList = new SwimmingPoolServiceRequestList();
        vehicleServiceRequestList = new VehicleServiceRequestList();
        customerPaymentsList = new CustomerPaymentsList();
        caretakerShiftList = new CaretakerShiftList();
        
    }
}
