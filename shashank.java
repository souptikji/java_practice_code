package practice1;

public class shashank {
	
	public static String changeSlashes(String original)
	{
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<original.length();i++)
		{
			if(original.charAt(i)=='/')
			{
				sb.append('\\');
				sb.append('\\');
			}
			else
			{
				sb.append(original.charAt(i));
			}
		}
		String answer= new String(sb);
		return answer;
	}
	
	public static String changeSlashesOptimized(String original)
	{
		int countForSlash=0,newlength,i,j;
		for(i=0;i<original.length();i++)
		{
			if(original.charAt(i)=='/') ++countForSlash;
		}
		
		newlength=original.length()+countForSlash;
		char[] ansArr= new char[newlength];i=0;
		
		for(j=0;j<newlength;++j)
		{
			if(original.charAt(i)=='/')
			{
				ansArr[j++]='\\';
				ansArr[j]='\\';
			}
			else
			{
				ansArr[j]=original.charAt(i);
			}
			if(i<original.length()-1) ++i;
		}
		
		String answer=new String(ansArr);
		return answer;
	}
	
	public static void main(String[] args)
	{
		String s="C:/temp/nit/bit/ranchi";
		System.out.println(changeSlashes(s));
		System.out.println(changeSlashesOptimized(s));
	}

}
