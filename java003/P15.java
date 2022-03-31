package java003;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class P15 {

	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");

		Scanner sc = new Scanner(System.in);

		while(true) {
			String text = sc.nextLine();
			
			if(text == "exit")
				break;

			Object result = engine.eval(text);
			System.out.println(result);
		}

		sc.close();
	}
}


