package ru.netology.springjdbc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springjdbc.repository.DataBaseRepository;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class DataBaseController {
        private final DataBaseRepository dataBaseRepository;

        @GetMapping("products/fetch-product")
        public List<String> productName(@RequestParam String name){
                return dataBaseRepository.getProductName(name);
        }



}
