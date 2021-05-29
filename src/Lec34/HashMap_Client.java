package Lec34;

public class HashMap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Ram", 80);
		map.put("Mohan", 90);
		map.put("Pooja", 75); 
		map.put("Ravi", 78);
		System.out.println(map.get("Ram"));
		System.out.println(map.containsKey("pooja"));
	//	System.out.println(map.remove("Pooja"));
		System.out.println(map.size());
		System.out.println(map);

	}

}
