package pw.javbus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 面试题实践
 * 
 * @author Lee
 *
 */
@RestController
public class EntrevistaTest {

	@GetMapping("strTest")
	public String ifIgual() {
		String str1 = "Mike";
		String str2 = "Mike";
		if (str1 == str2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		str2 = str1;
		str1 = "Scot";
		if (str2 == str1) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		System.out.println(4 + 5 + "=" + 4 + 5); // 9 = 45
		System.out.println(4 + 5  + "=" + 4 + "5"); // 9 = 45
		
		return ("str1: " + str1 + "    " + "str2: " + str2);
	}
}
