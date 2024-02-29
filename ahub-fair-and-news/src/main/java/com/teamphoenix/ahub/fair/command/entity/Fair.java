package com.teamphoenix.ahub.fair.command.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "fair")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Fair {

    @Id
    @Column(name = "fair_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fairId;

    @Column(name = "fair_title")
    private String fairTitle;

    @Column(name = "fair_content")
    private String fairContent;

    @Column(name = "fair_writedate", columnDefinition = "default NOW()")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fairWritedate;

    @Column(name = "use_acceptance")
    private int useAcceptance;

    @Column(name = "member_code", columnDefinition = "default 1")
    private int memberCode;




}
