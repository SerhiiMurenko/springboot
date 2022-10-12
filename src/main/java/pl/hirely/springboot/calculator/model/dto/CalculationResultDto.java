package pl.hirely.springboot.calculator.model.dto;

public class CalculationResultDto {
    private  double result;

    public CalculationResultDto(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
