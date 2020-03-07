package yashuSimpleInterest;
	import java.util.*;
	import  org.apache.log4j.*;

	class SimpleInterest{
	public double calculate(double principle,double time, double rate) {
	double simpleinterest = (principle * time * rate)/100;
	return simpleinterest;
	}
	}

	class CompoundInterest {
	public double calculate(double principle, double time, double rate) {
	    double amount = principle * (Math.pow((1 + rate / 100), time));
	    double compoundinterest = amount - principle;
	    return compoundinterest;
	   }
	}

	public class yashuSimpleInterest {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	final Logger logger = Logger.getLogger(yashuSimpleInterest.class);
	double simple,compound;
	double principle,time,rate;
	Scanner sc = new Scanner(System.in);
	logger.info("Enter principle time and rate");
	principle = sc.nextDouble();
	time = sc.nextDouble();
	rate = sc.nextDouble();

	SimpleInterest simpleinterest = new SimpleInterest();
	simple = simpleinterest.calculate(principle,time,rate);

	CompoundInterest compoundinterest = new CompoundInterest();
	compound = compoundinterest.calculate(principle,time,rate);

	logger.info("Simple Interest is "+simple);
	logger.info("Compound Interest is "+compound);
	sc.close();
	}

	}


