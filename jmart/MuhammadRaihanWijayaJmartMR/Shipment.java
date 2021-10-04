package MuhammadRaihanWijayaJmartMR;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 * Class for Shipment
 *
 * @author Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public class Shipment implements FileParser
{
    public String address;
    public int shipmentCost;
    public Duration duration;
    public String receipt;
    
    public Shipment(String address, int shipmentCost, Duration duration, String receipt){
        this.address = address;
        this.shipmentCost = shipmentCost;
        this.duration = duration;
        this.receipt = receipt;
    }
    
    public static class Duration{
        public static final Duration INSTANT = new Duration ((byte)(1 << 0)); //0000 0001
        public static final Duration SAME_DAY = new Duration ((byte)(1 << 1)); //0000 0010
        public static final Duration NEXT_DAY = new Duration ((byte)(1 << 2)); //0000 0100
        public static final Duration REGULER = new Duration ((byte)(1 << 3)); //0000 1000
        public static final Duration KARGO = new Duration ((byte)(1 << 4)); //0001 0000
        public static SimpleDateFormat ESTIMATION_FORMAT = new SimpleDateFormat("E MMMM dd yyyy");
        private byte bit;
        
        private Duration(byte bit){
            this.bit = bit;
        }

        public String getEstimatedArrival(Date reference){
            Calendar cal = Calendar.getInstance();
            if (this.bit == 1 << 0 || this.bit == 1 << 1){
                return ESTIMATION_FORMAT.format(reference.getTime());
            }
            else if (this.bit == 1 << 2){
                cal.setTime(reference);
                cal.add(Calendar.DATE, 1);
                return ESTIMATION_FORMAT.format(cal);
            }
            else if (this.bit == 1 << 3){
                cal.setTime(reference);
                cal.add(Calendar.DATE, 2);
                return ESTIMATION_FORMAT.format(cal);
            }
            else{
                cal.setTime(reference);
                cal.add(Calendar.DATE, 5);
                return ESTIMATION_FORMAT.format(cal);
            }
        }
    }
    
    public class MultiDuration{
        public byte bit;
        
        public MultiDuration(byte... args){
            for (byte i : args){
                this.bit = (byte) (this.bit | i);
            }
        }
        
        public boolean isDuration(Duration reference){
            if ((reference.bit & this.bit) != 0){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
    @Override
    public boolean read(String content){
        return false;
    }
}
