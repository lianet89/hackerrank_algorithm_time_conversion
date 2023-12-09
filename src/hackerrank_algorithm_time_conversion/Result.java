package hackerrank_algorithm_time_conversion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Result {
	public static String timeConversion(String s) throws ParseException {

		DateFormat parser = new SimpleDateFormat("HH:mm:ss");
		Calendar calendar = new GregorianCalendar();

		Date date = parser.parse(s);
		calendar.setTime(date);

		if (s.endsWith("PM") && !s.startsWith("12") || s.endsWith("AM") && s.startsWith("12")) {
			calendar.add(Calendar.HOUR, 12);
		}

		return parser.format(calendar.getTime());
	}

}
