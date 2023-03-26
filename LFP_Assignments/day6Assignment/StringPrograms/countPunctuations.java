package day6Assignment.StringPrograms;

public class countPunctuations {
	public static void main(String[] args) {
		String str="'She is' isn't a complete sentence ;unless, it is an answer to a  question. (Is she running late? She is.)";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='!'||str.charAt(i)==';'||str.charAt(i)=='.'||str.charAt(i)==','||str.charAt(i)=='?')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
