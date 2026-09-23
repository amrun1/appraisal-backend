package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "PERSON_ROLES",
        uniqueConstraints = @UniqueConstraint(columnNames = {"USER_ID", "PERSON_LEVEL"}))
public class PersonRole {

    private Long id;
    private Person person;
    private PersonLevel level;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "PERSON_ROLES_SEQ", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "PERSON_ROLES_SEQ", sequenceName = "PERSON_ROLES_SEQ", allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Column(name = "PERSON_LEVEL", nullable = false)
    @Enumerated(EnumType.STRING)
    public PersonLevel getLevel() {
        return level;
    }

    public void setLevel(PersonLevel level) {
        this.level = level;
    }
}