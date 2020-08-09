//package uk.co.argos.payments.keyan.practicedemo.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//import uk.co.argos.payments.keyan.practicedemo.models.Reading;
//import uk.co.argos.payments.keyan.practicedemo.repositories.Esp32Repository;
//
//import java.time.Instant;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/v1/esp32")
//public class Esp32Controller {
//    @Autowired
//    private Esp32Repository esp32Repository;
//
//    @GetMapping
//    public List<Reading> list(){
//        return esp32Repository.findAll();
//    }
//
//    @GetMapping
//    @RequestMapping("{id}")
//    public Reading get(@PathVariable long id){
//        return esp32Repository.getOne(id);
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Reading create(@RequestBody final Reading reading){
//        Instant instant = Instant.now();
//        long timeStampSeconds = instant.getEpochSecond();
//        reading.setTimestamp(timeStampSeconds);
//        return esp32Repository.saveAndFlush(reading);
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
//    public void delete(@PathVariable long id){
//        esp32Repository.deleteById(id);
//    }
//
//}