package cn.snow.loan.al.snowalapi.loan.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InAlLoanContract {

    @JsonProperty("contractNo")
    private String contractNo;
    private double loanAmount = 12000;
    private double fundingYearRate = 8.2;
    private double overdueFeeYearRate = 8.2;
    private int loanTerm = 12;
    private int repayMonthDay = 12;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Shanghai")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate firstRepayDate;
    private int dayOfGrace = 5;

    private double alFundingYearRate = 23.898;
    private double breachFeeDayRate = 0.062;
    private double termLateFeeDayRate = 0.097;
    private double loanLateFeeDayRate = 0.097;
    private int dayOfCompensation = 10;
}
