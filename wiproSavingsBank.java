package wiprosavingsbank;

public class wiproSavingsBank {
	String name;
	int age;
	String address;
	int avail_bal;
	int min_bal;
	
	void setName(String name){
		this.name=name;
	}

	void setAge(int age){
		this.age=age;
	}

	void setAddress(String address){
		this.address=address;
	}

	void setMinBal(int min_bal){
		this.min_bal=min_bal;
	}

	String deposit(int amount){
		avail_bal+=amount;
		return "Deposited successfully";
	}

	String withdraw(int amount){
		if( (avail_bal-amount)>=min_bal){
			avail_bal-=amount;
			return "success";
		}
		else return "Insufficient bal";
	}

	int balEnquiry(){
		return avail_bal;
	}


public static void main(String[] args){
	wiproSavingsBank cust1=new wiproSavingsBank();
	wiproSavingsBank cust2=new wiproSavingsBank();
	cust1.setName("xyz");
	cust2.setName("abc");
	cust1.setAge(24);
	cust2.setAge(23);
	cust1.setAddress("India");
	cust2.setAddress("India");
	cust1.setMinBal(1000);
	cust2.setMinBal(500);

	System.out.println(cust1.deposit(1500));
	System.out.println(cust2.deposit(1500));
	System.out.println(cust1.withdraw(700));
	System.out.println(cust2.withdraw(700));
	System.out.println(cust1.balEnquiry());
	System.out.println(cust2.balEnquiry());
	
}
}