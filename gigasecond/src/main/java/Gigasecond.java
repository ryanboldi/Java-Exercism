import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Gigasecond {
    private static final long GIGASECOND = 1_000_000_000L;
    LocalDateTime afterGiga;

    public Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        afterGiga = moment.plusSeconds(GIGASECOND);
    }

    public LocalDateTime getDateTime() {
        return afterGiga;
    }
}
