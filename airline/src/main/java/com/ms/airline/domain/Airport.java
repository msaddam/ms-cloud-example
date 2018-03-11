package com.ms.airline.domain;

import com.ms.resource.dictionary.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity(name = "AIRPORT")
@Table(name = "AIRPORT",indexes = { @Index(name = "IATA_INDEX", columnList = "IATA") })
@Data
@EqualsAndHashCode(exclude = {"ID"})
@AllArgsConstructor
@NoArgsConstructor
public class Airport /*extends BaseEntity */{
    //Airport FS Code
    @Column(name = "FS")
    private String fs;

    //Airport IATA Code
    @Column(name = "IATA")
    private String iata;

    //Airport ICAO Code
    @Column(name = "ICAO")
    private String icao;

    //Airport Name
    @Column(name = "NAME")
    private String name;

    //Airport Street
    @Column(name = "STREET")
    private String street;

    //Airport City
    @Column(name = "CITY")
    private String city;

    //Airport City Code
    @Column(name = "CITY_CODE")
    private String cityCode;

    //Airport Country Code
    @Column(name = "COUNTRY_CODE")
    private String countryCode;

    //Airport Country name
    @Column(name = "COUNTRY")
    private String countryName;

    //Airport Region Name
    @Column(name = "REGION")
    private String regionName;

    //Airport TIme Zone Region Name
    @Column(name = "TIME_ZONE_REGION")
    private String timeZoneRegionName;

    /*//Airport Local Time
    @Column(name = "LOCAL_TIME")
    private String localTime;*/

    //Airport UTC Offset Hours
    @Column(name = "UTC_OFFSET_HOURS")
    private Double utcOffsetHours;

    //Airport Latitude
    @Column(name = "LATITUDE")
    private Double latitude;

    //Airport Longitude
    @Column(name = "LONGITUDE")
    private Double longitude;

    //Airport Elevation in Feet
    @Column(name = "ELEVATION_FEET")
    private Integer elevationFeet;

    //Airport Classification
    @Column(name = "CLASSIFICATION")
    private Integer classification;

    //Airport Active
    @Column(name = "ACTIVE")
    private Boolean active;

    //Airport Delay Index URL from FlightStats.com Api
    @Column(name = "DELAY_INDEX_URL")
    private String delayIndexUrl;

    //Airport Current Weather URL from FlightStats.com Api
    @Column(name = "WEATHER_URL")
    private String weatherUrl;

}