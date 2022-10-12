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
public class AddController {
    private  final CalculationService calculationService;
    @Autowired
    public  AddController(CalculationService calculationService){
        this.calculationService = calculationService;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public CalculationResultDto getaddResult(@RequestParam(name =  "n1")double n1,
                                             @RequestParam(name = "n2")double n2){
        return calculationService.simpleAdd(n1, n2);
    }
    @RequestMapping(value = "/multi-add",
            method = RequestMethod.GET)
    public CalculationResultDto getMultiAddResult(
            @RequestParam Map<String, String> paramMap) {
        List<Double> doubles = paramMap.entrySet().stream()
                .map(entry->Double.parseDouble((entry.getValue())))
                .collect(Collectors.toList());
        return calculationService.multiAdd(doubles);
    }

}