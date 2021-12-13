package calc;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class FuzzTarget {
    public static void fuzzerTestOneInput(FuzzedDataProvider data){
        String s = data.consumeRemainingAsString();
        try
        {
            double d =Calc.calculate(s);
        }
        catch (CalcException e) {

        }
    }
}
