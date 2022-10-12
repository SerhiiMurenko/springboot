package pl.hirely.springboot.calculator.model.service;

import org.springframework.stereotype.Service;
import pl.hirely.springboot.calculator.model.dto.CalculationResultDto;

import java.util.List;

@Service
public class CalculationService {
    public CalculationResultDto simpleAdd(double a, double b) {
        return new CalculationResultDto(a + b);
    }

    public CalculationResultDto multiAdd(List<Double> doubles) {
        return new CalculationResultDto(doubles.stream()
                .mapToDouble(d -> d)
                .sum());


    }

    public CalculationResultDto multiPly(double a, double b) {
        return new CalculationResultDto(a * b);


    }

    public CalculationResultDto multiPly2(List<Double> doubles) {
        return new CalculationResultDto(doubles.stream()
                .mapToDouble(d -> d)
                .reduce(1, (a, b)->a*b));
    }


    public CalculationResultDto divide(double a, double b) {
        return new CalculationResultDto(a - b);
    }
}