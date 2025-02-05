public class test{
	public static void main(String[] args){
		String s = "Neeraj123@!";
		int uppercase = 0;
		int lowercase = 0;
		int digit = 0;
		int special = 0;
		for(char ch : s.toCharArray()){
			if(Character.isUpperCase(ch)){
				uppercase++;
} else if(Character.isLowerCase(ch)){
	lowercase++;
} else if(Character.isDigit(ch)){
	digit++;
} else{
	special++;
}
}
	System.out.println(uppercase);
        System.out.println(lowercase);
        System.out.println(digit);
        System.out.println(special);		
}
}
