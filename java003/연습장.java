package java003;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ������ {

	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("������ �Է��ϼ���: ");
			String s = sc.nextLine();
			
			if(s == "exit")
				break;

			Object result = engine.eval(s);
			System.out.println(result);
		}

		sc.close();
	}
}


