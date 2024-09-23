package com.fresh.coding.patrimoineapi.Controller;

import com.fresh.coding.patrimoineapi.Service.PatrimoineService;
import com.fresh.coding.patrimoineapi.model.Patrimoine;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/patrimoines")
public class PatrimoineController {

    private final PatrimoineService patrimoineService;

    public PatrimoineController(PatrimoineService patrimoineService) {
        this.patrimoineService = patrimoineService;
    }

    @PutMapping("/{id}")
    public Patrimoine updatePatrimoine(
            @PathVariable(name = "id") String name
    ) {
        return patrimoineService.save(name);
    }

    @GetMapping("/{id}")
    public Patrimoine findPatrimoineByName(@PathVariable(name = "id") String name)  {
        return patrimoineService.findByName(name);
    }
}