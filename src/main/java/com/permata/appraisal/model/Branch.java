package com.permata.appraisal.model;

import com.permata.appraisal.common.AppConstans;
import com.permata.appraisal.common.EntityBase;
import jakarta.persistence.*;


@Entity
@Table(name = AppConstans.HibernateConstanstan.PREFIX_DB_NAME + "CABANG")
public class Branch extends EntityBase<Long> {

    private static final long serialVersionUID = 298709118747959644L;
    private Long id;
    private String name;
    private Group group;
    private String kodeCabang;

    @Id
    @GeneratedValue(generator = "CABANG_SEQ", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "CABANG_SEQ", sequenceName = "CABANG_SEQ", initialValue = 1, allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAMA", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GROUP_ID")
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Column(name = "KODE_CABANG",  length = 20)
    public String getKodeCabang() {
        return kodeCabang;
    }

    public void setKodeCabang(String kodeCabang) {
        this.kodeCabang = kodeCabang;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Branch{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", group=").append(group).append('\'');
        sb.append(", kodeCabang=").append(kodeCabang);
        sb.append('}');
        return sb.toString();
    }
}