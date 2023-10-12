package com.cydeo.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@EntityListeners(BaseEntity.class) // this is related with "BaseEntityListener" class
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean isDeleted = false;

    @Column(nullable = false,updatable = false)
    private LocalDateTime insertDateTime;
    @Column(nullable = false,updatable = false)
    private Long insertUserId;
    @Column(nullable = false)
    private LocalDateTime lastUpdateDateTime;
    @Column(nullable = false)
    private Long lastUpdateUserId;
// When we need to update or persist something we need to show that details in the dataBase for that we need to capture that information help of "BaseEntityListener" class
// // here(HardCoded) we move these code to another class to set to user ID "BaseEntityListener"
//    @PrePersist
//    private void onPrePersist(){
//        this.insertDateTime = LocalDateTime.now();
//        this.lastUpdateDateTime=LocalDateTime.now();
//        this.insertUserId=1L;
//        this.lastUpdateUserId=1L;
//    }
//
//    @PreUpdate
//    private void onPreUpdate(){
//        this.lastUpdateDateTime=LocalDateTime.now();
//        this.lastUpdateUserId=1L;
//    }

}
