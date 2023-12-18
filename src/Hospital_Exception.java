public class Hospital_Exception {
    
}

class InvalidCondition extends RuntimeException{
    @Override
    public String getMessage(){
        return "Invalid condition..... please select a valid condition";
    }
}

class PatientAlreadyExistsException extends RuntimeException{
    @Override
    public String getMessage(){
        return "Patient already exists..... please enter another patient id";
    }
}

class AppointmentPatientIDException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Patient/Doctor not found , kindly register before booking appointment...!";
    }
}
class AppointmentIDException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Appointment ID is not available ";
    }
}
