package com.mytiki.company_index.features.latest.hibp;

import com.mytiki.company_index.utilities.ListToStringAttrConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name = "hibp")
public class HibpDO implements Serializable {
    private String name;
    private String domain;
    private ZonedDateTime breachedOn;
    private ZonedDateTime cachedOn;
    private Integer pwnCount;
    private BigDecimal pwnScore;
    private List<String> types;
    private BigDecimal typeScore;
    private List<String> classes;
    private BigDecimal classScore;
    private BigDecimal comboScore;

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Column(name = "breached_on_utc")
    public ZonedDateTime getBreachedOn() {
        return breachedOn;
    }

    public void setBreachedOn(ZonedDateTime breachedOn) {
        this.breachedOn = breachedOn;
    }

    @Column(name = "cached_on_utc")
    public ZonedDateTime getCachedOn() {
        return cachedOn;
    }

    public void setCachedOn(ZonedDateTime cachedOn) {
        this.cachedOn = cachedOn;
    }

    @Column(name = "pwn_count")
    public Integer getPwnCount() {
        return pwnCount;
    }

    public void setPwnCount(Integer pwnCount) {
        this.pwnCount = pwnCount;
    }

    @Column(name = "pwn_score", precision = 8, scale = 5)
    public BigDecimal getPwnScore() {
        return pwnScore;
    }

    public void setPwnScore(BigDecimal pwnScore) {
        this.pwnScore = pwnScore;
    }

    @Column(name = "type_list")
    @Convert(converter = ListToStringAttrConverter.class)
    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    @Column(name = "type_score", precision = 8, scale = 5)
    public BigDecimal getTypeScore() {
        return typeScore;
    }

    public void setTypeScore(BigDecimal typeScore) {
        this.typeScore = typeScore;
    }

    @Column(name = "class_list")
    @Convert(converter = ListToStringAttrConverter.class)
    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    @Column(name = "class_score", precision = 8, scale = 5)
    public BigDecimal getClassScore() {
        return classScore;
    }

    public void setClassScore(BigDecimal classScore) {
        this.classScore = classScore;
    }

    @Column(name = "combo_score", precision = 8, scale = 5)
    public BigDecimal getComboScore() {
        return comboScore;
    }

    public void setComboScore(BigDecimal comboScore) {
        this.comboScore = comboScore;
    }
}
