class Muenzen{
public static void main(String[] args){
double dollar = Double.parseDouble(args[0]);

int buck;
int half;
int quarter; 
int dime;
int nickel;
int penny;


int ges = (int)(100.0*dollar);
int rest = 0;
rest = ges%100;
buck = ges/100;
ges = rest;

rest = ges%50;
half = ges/50;
ges = rest;

rest = ges%25;
quarter = ges/25;
ges = rest;

rest = ges%10;
dime = ges/10;
ges = rest;

rest = ges%5;
nickel = ges/5;
penny = rest;

System.out.println(buck + " x 1 Dollar");
System.out.println(half + " x 50 Cent");
System.out.println(quarter + " x 25 Cent");
System.out.println(dime + " x 10 Cent");
System.out.println(nickel + " x 5 Cent");
System.out.println(penny + " x 1 Cent");

}
}
