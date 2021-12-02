import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskEx {
    public static void main(String[] args){
        Timer time=new Timer();
        TimerTask task=new TimerTask() {
            int count=10;
            @Override
            public void run() {
                if(count>0){
                    System.out.println(count +" Secondes");
                    count--;
                }
                else {
                    System.out.println("Happy new year!!!");
                    time.cancel();
                }
            }
        };
        Calendar date=Calendar.getInstance();
        date.set(Calendar.YEAR,2021);
        date.set(Calendar.MONTH,Calendar.MAY);
        date.set(Calendar.DAY_OF_MONTH,17);
        date.set(Calendar.HOUR_OF_DAY,9);
        date.set(Calendar.MINUTE,12);
        date.set(Calendar.SECOND,50);
        date.set(Calendar.MILLISECOND,0);

        time.scheduleAtFixedRate(task,date.getTime(),1000);
    }
}
