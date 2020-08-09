package uk.co.argos.payments.keyan.practicedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity(name="reading")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Reading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reading_id;
    private Integer value;
    private Long timestamp;

    @ManyToMany(mappedBy = "readings")
    @JsonIgnore
    private List<Reading> readings;

    public Reading(){}

    public List<Reading> getReadings() {
        return readings;
    }
    public void setReadings(List<Reading> readings) {
        this.readings = readings;
    }

    public Long getReading_id() {
        return reading_id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
