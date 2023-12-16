package aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import utils.InfoPrint;

@Aspect
public class LogAspect {
    @Pointcut("execution(* org.upper_lower_case.CaseConvertor.getMessageFromUser())")
    public void inputLogging() {
    }
    @Pointcut("execution(* org.upper_lower_case.CaseConvertor.getStringFromSymbolsArray(String[]))")
    public void outputLogging() {
    }

    @AfterReturning(value = "inputLogging()", returning = "returningValue")
    public void beforeAdvice(String returningValue) {
        new InfoPrint().getInputString(returningValue);
    }

    @AfterReturning(value = "outputLogging()", returning = "returningValue")
    public void beforeAdvice1(String returningValue) {
        new InfoPrint().getOutputString(returningValue);
    }


}