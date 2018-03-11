package com.ms.airline.repository;

import com.ms.airline.domain.Airport;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.awt.print.Pageable;
import java.util.Set;

//@RepositoryRestController
public interface AirportRepository extends JpaRepository<Airport, String>{

    /*//Method to filter Airports by name
    @RestResource(path = "findbyname",exported = false)
    Set<Airport> findByNameContainingIgnoreCase(@Param("name") String name);

    //Method to filter Airports by IATA Code
    @RestResource(path = "findbyiata")
    Airport findByIataIgnoreCase(@Param("iata") String iata);

    //Method to filter Airports by ICAO Code
    @RestResource(path = "findbyicao")
    Airport findByIcaoIgnoreCase(@Param("icao") String icao);

    //Method to filter Airports by City
    @RestResource(path = "findbycity")
    Page findByCityContaining(@Param("city") String city, Pageable p);

    //Method to filter Airports by Country
    @RestResource(path = "findbycountry")
    Page findByCountryNameContaining(@Param("country") String countryname, Pageable p);

    //Method to filter Airports by Status : Active = true and InActive = false
    @RestResource(path = "findbyactive")
    Page findByActive(@Param("active") Boolean active, Pageable p);*/

}
