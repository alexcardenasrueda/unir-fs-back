package com.unir.librarybrowser.controller;

import com.unir.librarybrowser.domain.dto.LendDto;
import com.unir.librarybrowser.domain.dto.PersonDto;
import com.unir.librarybrowser.exception.GenericException;
import com.unir.librarybrowser.service.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/people")
@RequiredArgsConstructor
public class PersonController {

    @Autowired
    private Person service;

    @GetMapping
    ResponseEntity<List<PersonDto>> getAll() throws GenericException {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping(value ="/get_by_id/{id}")
    ResponseEntity<PersonDto> getById(@RequestParam(required = true, name = "id") long id ) throws GenericException {
        return ResponseEntity.ok(service.getById(id));
    }
}
