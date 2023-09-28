package com.sha.UniversityEvent.Modle;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {


    @Id
    private Integer eventId;

    @NotBlank(message = "Event name is required")
    private String eventName;

    private String locationOfEvent;
    @Pattern(regexp = "\\d{2}-\\d{2}-\\d{4}", message = "Invalid time format. Use HH:mm")
    private String date;

    @Pattern(regexp = "\\d{2}:\\d{2}", message = "Invalid time format. Use HH:mm")
    private String startTime;

    @Pattern(regexp = "\\d{2}:\\d{2}", message = "Invalid time format. Use HH:mm")
    private String endTime;
}
