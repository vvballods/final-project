package lv.sda.finalproject.dto;

import javax.validation.constraints.NotNull;

public class NumberForm {
    @NotNull
    private Integer number1;
    @NotNull
    private Integer number2;

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }
}
