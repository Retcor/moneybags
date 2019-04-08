package com.moneybags.jpa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.util.StringUtils;

/**
 * Created by dan on 4/7/19.
 */
@MappedSuperclass
public abstract class BasePersistenceJpa implements Serializable {
    private static final long serialVersionUID = 2996386581541833701L;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    protected Date dtmCreated;

    @LastModifiedBy
    private String modBy;

    @LastModifiedDate
    protected Date dtmMod;

    public BasePersistenceJpa() {
    }

    @Column(name = "CREATED_BY", nullable = false, length = 30)
    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name = "DTM_CREATED", nullable = false, length = 11)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDtmCreated() {
        return this.dtmCreated;
    }

    public void setDtmCreated(Date dtmCreated) {
        this.dtmCreated = dtmCreated;
    }

    @Column(name = "MOD_BY", length = 30)
    public String getModBy() {
        return this.modBy;
    }

    public void setModBy(String modBy) {
        this.modBy = modBy;
    }

    @Column(name = "DTM_MOD", length = 11)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDtmMod() {
        return this.dtmMod;
    }

    public void setDtmMod(Date dtmMod) {
        this.dtmMod = dtmMod;
    }

    @Override
    public boolean equals(Object o) {
        boolean res = false;

        if (this == o) {res = true;}
        else if (o == null || getClass() != o.getClass()) {res = false;}
        else if(o instanceof BasePersistenceJpa) {
            BasePersistenceJpa that = (BasePersistenceJpa) o;
            if (createdBy == null) {
                res = (that.getCreatedBy() == null);
            }
            else {
                res = createdBy.equals(that.getCreatedBy());
            }
        }

        return res;
    }

    @Override
    public int hashCode() {
        int result = 0;
        if (createdBy != null) {
            result = 31 * super.hashCode() + createdBy.hashCode();
        }
        return result;
    }

    @PreUpdate
    public void onPreUpdate() {
        /**
         * Stamp modified date time to insure value is set
         * and included in update
         * @LastModifiedDate Not working at times
         *
         **/
        java.util.Calendar now = java.util.Calendar.getInstance();
        now.add(java.util.Calendar.MILLISECOND, 100);
        this.dtmMod = now.getTime();

        /** update modifyBy to insure included in update **/
        String modBy = this.modBy;
        this.modBy = "JWORKS";
        if (!StringUtils.isEmpty(modBy))
            this.modBy = modBy;
    }
}
