
public class palindrome {
	private String palavra;

	private String getPalavra() {
		return palavra;
	}

	private void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	public palindrome(String palavra)
	{
		this.setPalavra(palavra.replace(" ", ""));
	}
	
	private boolean analisa(String palavra)
	{
		int i, j, n=palavra.length();
		
		for(i=0, j=palavra.length()-1; i<j; i++, j--)
			if(palavra.charAt(i)!=palavra.charAt(j)) break;
		
		if(i<j) return true;
				
		return false;
	}
	
	
	public String toString ()
	{
		if(this.analisa(this.getPalavra()))
			return this.getPalavra() + " não é palindrome";
		
		return this.getPalavra() + " é palindrome";
	}
	
	
}
