class InterestCalculator{
    double principal;
    double rate;
    int time;
    int frequency;
    
    
    public InterestCalculator(double principal,double rate,int time,int frequency){
        this.principal=principal;
        this.rate=rate;
        this.time=time;
        this.frequency=frequency;
    }
    
    
    
    public double simpleInterest(){
        return (principal*rate*time)/100;
    }
    
    
    public double compoundInterest(){
        double value=rate/100;
        double amount=principal* Math.pow(1+ (value/frequency) ,frequency*time);
        
        return amount-principal;
    }



public static void main (String[] args) {
    InterestCalculator ic=new InterestCalculator(10000,10,4,1);
    
    double finalValue=ic.simpleInterest();
    System.out.println("Simple Interest: "+ finalValue);
    
    System.out.println("Compound Interest: "+ ic.compoundInterest());
}
}