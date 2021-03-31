package com.example.baithi.controller;

import com.example.baithi.model.City;
import com.example.baithi.service.city.CityService;
import com.example.baithi.service.national.NationalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("city")
public class CityController {
    @Autowired
    private CityService cityService;

    @Autowired
    private NationalService nationalService;


    @GetMapping("")
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("list", cityService.findAll());
        return modelAndView;
    }

    @GetMapping("delete/{id}")
    public ModelAndView deleteCity(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/city");
        cityService.delete(id);
        return modelAndView;
    }

    @GetMapping("create")
    public ModelAndView createCity() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("nations",nationalService.findAll());
        modelAndView.addObject("city", new City());
        return modelAndView;

    }

    @PostMapping("create")
    public ModelAndView createStudent(@ModelAttribute City city) {
        cityService.create(city);
        ModelAndView modelAndView = new ModelAndView("redirect:/city");
        return modelAndView;
    }

    @GetMapping("edit/{id}")
    public ModelAndView editPeople(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        City city = cityService.findById(id);
        modelAndView.addObject("c", city);
        return modelAndView;
    }

    @PostMapping("edit/{id}")
    public ModelAndView edit(@ModelAttribute City city, @PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/city");
//        city.setId(id);
        cityService.edit(city);
        return modelAndView;
    }

    @GetMapping("view/{id}")
    public ModelAndView findNameCity(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("city",cityService.findAll());
        return modelAndView;
    }


}
