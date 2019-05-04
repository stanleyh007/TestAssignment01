import java.time.LocalTime;

public class blackBox
{
    public boolean isSaverTicket(String Time){
        if(!isRushHour(LocalTime.parse(Time))){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isRushHour(LocalTime t){
        if(t.isBefore(LocalTime.of(19, 30)) && t.isAfter(LocalTime.of(16, 0))){
            return true;
        }
        if(t.isBefore(LocalTime.of(9, 30)) && t.isAfter(LocalTime.of(5, 0))){
            return true;
        }
        else return false;
    }
}
