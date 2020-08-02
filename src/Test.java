import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		ArrayList inputList = new ArrayList();
		HashMap input1 = new HashMap();
		input1.put("System_Name", "FTTX_ACT");
		input1.put("Battery_Instance_ID", "2BLT-02-05-FNO-001");
		HashMap input2 = new java.util.HashMap();
		input2.put("System_Name", "FTTX_ACT");
		input2.put("Battery_Instance_ID", "2BLT-02-05-FNO-002");
		HashMap input3 = new java.util.HashMap();
		input3.put("System_Name", "FTTX_ACT");
		input3.put("Battery_Instance_ID", "2BLT-02-05-FNO-003");
		HashMap input4 = new java.util.HashMap();
		input4.put("System_Name", "FTTX_ACT");
		input4.put("Battery_Instance_ID", "2BLT-02-05-FNO-004");
		HashMap input5 = new java.util.HashMap();
		input5.put("System_Name", "FTTX_ACT");
		input5.put("Battery_Instance_ID", "2BLT-02-05-FNO-005");

		inputList.add(input1);
		inputList.add(input2);
		inputList.add(input3);
		inputList.add(input4);
		inputList.add(input5);
		
		System.out.println("Result"+inputList);

	}

}
