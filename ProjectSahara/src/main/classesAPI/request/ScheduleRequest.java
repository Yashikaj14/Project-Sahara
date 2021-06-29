package request;

import constants.RequestCode;

import java.io.Serializable;

public class ScheduleRequest extends Request implements Serializable {
    private String doctorID;
    public ScheduleRequest(String doctorID) {
        this.doctorID = doctorID;
        requestCode = RequestCode.SCHEDULE_REQUEST;
    }

    public ScheduleRequest() {
        this.doctorID = "ALL";
        requestCode = RequestCode.SCHEDULE_REQUEST;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }
}
