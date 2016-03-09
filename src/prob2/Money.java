package prob2;

public class Money {
	private int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add( Money money ) {
        //더하기
    	Money m = new Money(this.amount+money.amount);
    	
    	return m;
    }
    public Money minus( Money money ) {
        //빼기

    	Money m = new Money(this.amount-money.amount);
    	
    	return m;
    }
    public Money multiply( Money money ) {
        //곱하기
   
    	Money m = new Money(this.amount*money.amount);
    	
    	return m;
    }
    public Money devide( Money money ) {
        //나누기
    
    	Money m = new Money(this.amount/money.amount);
    	
    	return m;
    }
    
    public boolean equals(Object obj)
    {
    	Money a = (Money)obj;  // 들어온 obj 객체를 Money형으로 캐스팅 하여 새로운 Money 객체를 생성하였다.
    	
    	if (obj.getClass() == this.getClass())  // getClass -> 지금 클래스가 어떤 타입인지 반환하는 메소드
    	{
    		if (this.amount == a.amount)
    		{
    			return true;
    		}
    	}
    	
    	return false;
    }
    

}