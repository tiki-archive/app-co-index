package com.mytiki.company_index.features.latest.company;

import com.mytiki.company_index.features.latest.hibp.HibpDO;
import com.mytiki.company_index.utilities.ListToStringAttrConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name = "company")
public class CompanyDO implements Serializable {
    private Long id;
    private String domain;
    private String name;
    private String description;
    private String logo;
    private String url;
    private String address;
    private String phone;
    private String sector;
    private String industry;
    private String subIndustry;
    private List<String> tags;
    private String facebook;
    private String twitter;
    private String linkedin;
    private BigDecimal sensitivityScore;
    private ZonedDateTime cachedOn;
    private List<HibpDO> breaches;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "sector")
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Column(name = "industry")
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Column(name = "sub_industry")
    public String getSubIndustry() {
        return subIndustry;
    }

    public void setSubIndustry(String subIndustry) {
        this.subIndustry = subIndustry;
    }

    @Column(name = "tag_list")
    @Convert(converter = ListToStringAttrConverter.class)
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Column(name = "facebook_handle")
    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Column(name = "twitter_handle")
    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @Column(name = "linkedin_handle")
    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    @Column(name = "sensitivity_score", precision = 8, scale = 5)
    public BigDecimal getSensitivityScore() {
        return sensitivityScore;
    }

    public void setSensitivityScore(BigDecimal sensitivityScore) {
        this.sensitivityScore = sensitivityScore;
    }

    @Column(name = "cached_on_utc")
    public ZonedDateTime getCachedOn() {
        return cachedOn;
    }

    public void setCachedOn(ZonedDateTime cachedOn) {
        this.cachedOn = cachedOn;
    }

    @OneToMany
    @JoinColumn(name="domain", referencedColumnName = "domain")
    public List<HibpDO> getBreaches() {
        return breaches;
    }

    public void setBreaches(List<HibpDO> breaches) {
        this.breaches = breaches;
    }
}
