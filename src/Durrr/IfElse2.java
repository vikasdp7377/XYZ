package Durrr;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int amt = 450;
		
		if(amt>3000)
		{
			System.out.println("5 Star");
		}
		else if(amt>1000)
		{
			System.out.println("kfc");
		}
		else if(amt>500)
		{
			System.out.println("macd");
		}
		else if(amt>200)
		{
			System.out.println("thali");
		}
		else
		{
			System.out.println("mess");
		}*/
		
		int amt = 450;
		
		if(amt>3000)
		{
			System.out.println("5 star");
		}
		else {
			if(amt>1000)
			{
				System.out.println("kfc");
			}
			else
			{
				if(amt>500)
				{
					System.out.println("mcd");
				}
				else
				{
					if(amt>200)
					{
						System.out.println("thali");
					}
					else
					{
						System.out.println("mess");
					}
				}
			}
		}

	}

}
