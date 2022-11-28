package com.dev.passbatch.repository.booking;

import com.dev.passbatch.repository.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@Table(name = "booking")
public class BookingEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingSeq;

    private Integer passSeq;

    private String userId;

    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    private boolean usedPass;

    private boolean attended;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;

    private LocalDateTime cancelledAt;

}