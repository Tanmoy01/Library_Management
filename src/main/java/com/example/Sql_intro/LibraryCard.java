package com.example.Sql_intro;

import jakarta.persistence.*;

@Entity
@Table(name = "Library_card")

public class LibraryCard {
    @Id
    private int cardNo;

    private int fine;

    private int bookIssued;

    @Enumerated(value = EnumType.STRING) //to store the values in the DB in string format
    private CardStatus cardStatus;

    @OneToOne //Mapping relation between two entity
    @JoinColumn //add a forgeion key column join the column... by default it is the primary key of the parent class
    User user;
}
