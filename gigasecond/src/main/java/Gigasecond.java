import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Gigasecond {
    static final TemporalUnit seconds = ChronoUnit.SECONDS;
    LocalDateTime afterGiga;

    public Gigasecond(LocalDate moment) {
        LocalDateTime momentTime = moment.atStartOfDay();
        afterGiga = momentTime.plus(1000000000, seconds);
    }

    public Gigasecond(LocalDateTime moment) {
        afterGiga = moment.plus(1000000000, seconds);
    }

    public LocalDateTime getDateTime() {
        return afterGiga;
    }
}
