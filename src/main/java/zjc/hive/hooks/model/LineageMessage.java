package zjc.hive.hooks.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class LineageMessage {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    //yyyy-MM-dd HH:mm:ss.SSS
    private String eventTime;
    private String valueClass;

    public LineageMessage() {
        this.eventTime = dtf.format( LocalDateTime.now());
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getValueClass() {
        return valueClass;
    }

    public void setValueClass(String valueClass) {
        this.valueClass = valueClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineageMessage kafkaKey = (LineageMessage) o;
        return Objects.equals(eventTime, kafkaKey.eventTime) &&
                Objects.equals(valueClass, kafkaKey.valueClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventTime, valueClass);
    }

    @Override
    public String toString() {
        return "LineageMessage{" +
                "eventTime=" + eventTime +
                ", valueClass='" + valueClass + '\'' +
                '}';
    }
}
