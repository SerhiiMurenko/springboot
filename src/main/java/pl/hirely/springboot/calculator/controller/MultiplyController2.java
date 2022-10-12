package pl.hirely.springboot.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.hirely.springboot.calculator.model.dto.CalculationResultDto;
import pl.hirely.springboot.calculator.model.service.CalculationService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/calculator")

public class MultiplyController2 {
    private  final CalculationService calculationService;
    @Autowired
    public  MultiplyController2(CalculationService calculationService){
        this.calculationService = calculationService;
    }
    @RequestMapping(value = "/multi-multiply",
            method = RequestMethod.GET)
    public CalculationResultDto getMultiply2Result(
            @RequestParam Map<String, String> paramMap) {
        List<Double> doubles = paramMap.entrySet().stream()
                .map(entry->Double.parseDouble(entry.getValue()))
                .collect(Collectors.toList());
        return calculationService.multiPly2(doubles);
    }
}
