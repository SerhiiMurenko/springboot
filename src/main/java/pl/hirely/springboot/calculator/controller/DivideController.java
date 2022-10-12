package pl.hirely.springboot.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.hirely.springboot.calculator.model.dto.CalculationResultDto;
import pl.hirely.springboot.calculator.model.service.CalculationService;

@RestController
@RequestMapping("/calculator")

public class DivideController {
    private  final CalculationService calculationService;
    @Autowired


    public DivideController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public CalculationResultDto getMultiDivide(@RequestParam(name =  "n1")double n1,
                                               @RequestParam(name = "n2")double n2){
        return calculationService.divide(n1, n2);
    }
}
