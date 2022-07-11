package org.bnt.controller;

import org.bnt.entity.Provider;
import org.bnt.mapper.ProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResultUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/provider")
public class ProviderEntityController {

    @Autowired
    private ProviderMapper providerMapper;

    @PostMapping("/del")
    public void removeProvider(int providerid) {
        providerMapper.remove(providerid);
    }

    @DeleteMapping
    public void DelProvider(int providerid) {
        providerMapper.remove(providerid);
    }

    @GetMapping
    public ModelAndView priceResult(Model model) {
        ModelAndView modelAndView = new ModelAndView("provider");
        modelAndView.addObject("content", "Заголовок сайта не создан");
        modelAndView.addObject("providers", providerMapper.getAll());
        return modelAndView;
    }

    @PostMapping
    public void AddProvider(@ModelAttribute("provider") Provider provider) {
        providerMapper.add(provider);
    }

    @PutMapping
    public void PutProvider(@ModelAttribute("provider") Provider provider) {
        providerMapper.update(provider);
    }
}
