//2. Make neccassary changes in Factory Pattern example, to support SportsCar also?

public class FactoryPatternEg {
    public static void main(String[] args) {
    	
    	Car sObj = CarFactory.buildCar(CarType.SMALL);
    	
    	Car snObj = CarFactory.buildCar(CarType.SEDAN);
    	
    	Car lObj = CarFactory.buildCar(CarType.LUXURY);
    	
    	Car spobj = CarFactory.buildCar(CarType.SPORTSCAR);
    	
    	
    	//How to avoid printing of Class name along with hashcode
        System.out.println(sObj);
        
        System.out.println(snObj);
        
        System.out.println(lObj);
        
        System.out.println(spobj);
    }
}