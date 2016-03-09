package prob4;

public class SmartPhone extends MusicPhone 
{
	@Override
	public void execute(String function) 
	{
		if (function.equals("음악"))
		{
			downPlayMusic();
		}
		else if (function.equals("통화"))
		{
			super.execute(function);
		}
		else if (function.equals(("앱")))
		{
			appStart();
		}

	}
	
	public void downPlayMusic()
	{
		System.out.println("다운로드해서 음악재생");
	}
	
	public void appStart()
	{
		System.out.println("앱실행");
	}
	
	
}


