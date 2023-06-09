package cn.snow.loan.contract;


import java.math.BigDecimal;

import cn.snow.loan.plan.al.AlLoanRate;
import cn.snow.loan.plan.funding.Loan;
import cn.snow.loan.plan.funding.LoanAmount;
import cn.snow.loan.plan.funding.LoanRate;
import cn.snow.loan.plan.funding.LoanTerm;

@SuppressWarnings("all")
public class AlLoanContractTest {


    public static void main(String[] args) {
        AlLoanContract alLoanContract = new AlLoanContract(new FundingLoanContract(
                LoanAmount.valueOf(new BigDecimal("12000")),
                LoanTerm.monthTerm(12),
                LoanRate.yearRate(8.2),
                LoanRate.yearRate(8.2)
        ), new AlLoanRate(LoanRate.yearRate(23.9)));
        Loan loan = alLoanContract.repayPlanTrial();
        System.out.println(loan);
    }

}