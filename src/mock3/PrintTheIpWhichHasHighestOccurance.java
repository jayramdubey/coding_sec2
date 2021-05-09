package mock3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintTheIpWhichHasHighestOccurance {

	public static void main(String[] args) {
/*		String [] log1 = {
				"102.240.211.50:Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				"102.240.211.50:Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				"102.240.211.60:Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				"102.240.211.60:Lorem Ipsum is simply dummy text of the printing and typesetting industry."};*/
		
		String [] log1 = {
				"102.240.211.50:Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				"102.240.211.50:Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				"102.240.211.60:Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				"102.240.211.60:Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				"102.240.211.60:Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				"102.240.211.70:Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				"102.240.211.80:Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				"102.240.211.90:Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				"102.240.211.91:Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				"102.240.211.81:Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				"102.240.211.51:Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
				"102.240.211.52:Lorem Ipsum is simply dummy text of the printing and typesetting industry."};
		int len = log1.length;

		highestOccurance(log1, len);
	}

	private static void highestOccurance(String[] log1, int len) {

		Map<String, Integer> hm = new HashMap<>();
		
		for (int i = 0; i < len; i++) {
			String ip[] = log1[i].split("\\:");
		
			if (hm.containsKey(ip[0])) {
				hm.put(ip[0], hm.get(ip[0]) + 1);
			} else {
				hm.put(ip[0], 1);
			}
		}
		int max=0;
		String hasHighestOccurance="";
		for (int i = 0; i < len; i++) {
			String ip[] = log1[i].split("\\:");
			if (hm.get(ip[0])>max) {
				max = hm.get(ip[0]);
				hasHighestOccurance=ip[0];
			}
		}
		System.out.println("highest occurance IP: "+hasHighestOccurance);
	}

}
