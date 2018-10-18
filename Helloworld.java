class Helloworld{
public static void main(String[] args){
System.out.println("hello world");

int erg = sum(1,100);
System.out.println("sum "+erg);
System.out.println("sum7 "+sum7());
System.out.println("fact "+fact(1)+ "  " +fact(6));

System.out.println("Dfact"+Dfact(10));

int n,s,i;
n=4; s=0; i=0;
while(i<=n)
{
	i = i + 1;
	s = s +i;
	
	}
	System.out.println(i);
}


static int sum(int start, int ende){
	int ergebnis = 0;
	int summe = 0;
	int i= start;
	while (i <= ende){
		
		summe = summe +i;
		i= i+1;
		}
	
	return summe;
	}
	
static int sum7(){
	int i = 0;

	while((i+7)< 1000){
		i = i+7;
		}
		return i;
	}
	
static int fact(int n ){
	int erg = 1;
	int i = 1;
	while(i <= n){
		erg = erg*i;
		i = i+1;
		}
	
	return erg;
	}		

static int Dfact(int n){
	 
	int erg = 1;
	
	if (n%2==0){
	int i  = n-2;
	
	while((i)>=2){
		n = n * i;
		System.out.println("ii  "+ i);
		i = i-2;
		}
	return n;
		
		}
	else 
		{
			
	int i = n-2;
	
	while((i)>=1)
		n= n*i;
		i = i-2;	
			
		return n;	
			}
			
	}
	


} 
