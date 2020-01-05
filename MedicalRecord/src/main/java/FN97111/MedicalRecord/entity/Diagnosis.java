package FN97111.MedicalRecord.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Entity
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="treatment")
    private String treatment;

    @Column(name="sickLeaveFrom")
    private Date sickLeaveFrom;

    @Column(name="sickLeaveTo")
    private Date sickLeaveTo;

    public Diagnosis() {
        this.treatment = "";
        this.sickLeaveFrom = Date.from(Instant.now());
    }
}
