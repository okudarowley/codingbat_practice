package map1;

import java.util.Map;

public class MapBully {

	// Modify and return the given map as follows: if the key "a" has a value,
	// set the key "b" to have that value, and set the key "a" to have the value
	// "".
	// Basically "b" is a bully, taking the value and replacing it with the
	// empty string.
	public Map<String, String> mapBully(Map<String, String> map) {
		String aValue = map.get("a");

		if (aValue != null) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}
}
