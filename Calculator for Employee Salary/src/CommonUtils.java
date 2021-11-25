import java.text.NumberFormat;
import java.util.Locale;

public class CommonUtils {
	 static Locale locale = new Locale("en","IN");
	 static String getSalaryFormat(double salary) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		return nf.format(salary);
	}
}
