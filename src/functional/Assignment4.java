package functional;

import java.util.List;

public class Assignment4 {
	public List<String> removeX(List<String> stringy) {
		stringy.replaceAll(string -> string.replace("x", ""));
		return stringy;
	}
	
}
