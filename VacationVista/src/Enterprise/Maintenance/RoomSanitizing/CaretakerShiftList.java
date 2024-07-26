/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Maintenance.RoomSanitizing;

import java.util.ArrayList;

/**
 *
 * @author saneeth
 */
public class CaretakerShiftList {
    
    ArrayList<CaretakerShift> scheduleDirectory;

    public CaretakerShiftList() {
        this.scheduleDirectory = new ArrayList<CaretakerShift>();
    }
    
    public ArrayList<CaretakerShift> getScheduleDirectory() {
        return scheduleDirectory;
    }

    public void setScheduleDirectory(ArrayList<CaretakerShift> scheduleDirectory) {
        this.scheduleDirectory = scheduleDirectory;
    }

    public CaretakerShift getScheduleById(String scheduleId) {
        
        CaretakerShift selectedSchedule = new CaretakerShift();
        for(CaretakerShift schedule : scheduleDirectory) {
            if(schedule.getScheduleId().equals(scheduleId)) {
                selectedSchedule = schedule;
                break;
            }
        }
        return selectedSchedule;
    }
    
    public void updateSchedule (CaretakerShift schedule) {
        CaretakerShift newSchedule = new CaretakerShift();
        
        int position = 0;
        for (int iter = 0; iter < scheduleDirectory.size(); iter++) {
            if((scheduleDirectory.get(iter).getScheduleId()).equals(schedule.getScheduleId())) {
                position = iter;
                break;
            }
        }

        newSchedule.setScheduleId(schedule.getScheduleId());        
        newSchedule.setDate(schedule.getDate());
        newSchedule.setRoomNumber(schedule.getRoomNumber());
        newSchedule.setTime(schedule.getTime());
        newSchedule.setStatus(schedule.getStatus());
        newSchedule.setCustomer(schedule.getCustomer());
        
        scheduleDirectory.set(position, newSchedule);
    }
}
