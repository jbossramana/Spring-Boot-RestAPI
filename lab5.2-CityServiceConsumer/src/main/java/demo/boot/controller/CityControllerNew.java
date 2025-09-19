package demo.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponentsBuilder;

import demo.boot.model.City;

@RestController
@RequestMapping("/new/client/city")
public class CityControllerNew {

    private final String BASE_URL = "http://localhost:8081/city";

    @Autowired
    RestClient restClient;

    @GetMapping
    public List<City> findCities() {
        City[] cities = restClient.get()
                .uri(BASE_URL)
                .retrieve()
                .body(City[].class);
        return List.of(cities);
    }

    @GetMapping("/{cityId}")
    public City findCity(@PathVariable Long cityId) {
        return restClient.get()
                .uri(BASE_URL + "/" + cityId)
                .retrieve()
                .body(City.class);
    }

    @PostMapping
    public void insertCity(@RequestBody City city) {
        restClient.post()
                .uri(BASE_URL)
                .body(city)
                .retrieve()
                .toBodilessEntity(); 
    }

    @PutMapping("/{cityId}")
    public void updateCity(@RequestBody City city, @PathVariable Long cityId) {
        restClient.put()
                .uri(BASE_URL + "/" + cityId)
                .body(city)
                .retrieve()
                .toBodilessEntity(); 
    }

    @DeleteMapping("/{cityId}")
    public void deleteCity(@PathVariable int cityId) {
        restClient.delete()
                .uri(BASE_URL + "/" + cityId)
                .retrieve();
    }

    @GetMapping("/search")
    public List<City> findCitiesByPopulation(@RequestParam("people") int people) {
        String uri = UriComponentsBuilder.fromHttpUrl(BASE_URL + "/search")
                .queryParam("people", people)
                .toUriString();

        City[] cities = restClient.get()
                .uri(uri)
                .retrieve()
                .body(City[].class);
        return List.of(cities);
    }
}

