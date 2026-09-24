package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "TL_GROUP")
public class Group extends EntityBase<Long> {

    private static final long serialVersionUID = 6356875074250073040L;
    private Long id;
    private String name;
    private List<Branch> branches;
    /*private Set<Person> persons = new HashSet<Person>();*/

    @Id
    @Column(name = "GROUP_ID")
    @GeneratedValue(generator = "SEQ_TBL_GROUP", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "SEQ_TBL_GROUP", sequenceName = "TL_GROUP_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAMA", nullable = false, unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "group")
    // @Cascade default
    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

	/*@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "TL_USERS_GROUPS", joinColumns = @JoinColumn(name = "GROUP_ID"), inverseJoinColumns = @JoinColumn(name = "USER_ID"))
	public Set<Person> getPersons() {
		return persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}*/
}