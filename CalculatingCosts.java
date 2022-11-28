package HW7;

import java.util.List;

public class CalculatingCosts implements Visitor{
	
	
public void calculateCosts(List<HouseholdItem> namesList) {
	for(HouseholdItem h: namesList) {
		h.accept(this);
	}
}

@Override
public void visitGlass(Glass G) {
	// TODO Auto-generated method stub
	double cost;
	if(G.thickness==1) {
		cost=((double)2/100)*G.lenght;
		System.out.println("Total Cost for "+ G.name + " is: "+ cost + " Euros");
	}
	if(G.thickness==2) {
		cost=((double)1.2/100)*G.lenght;
		System.out.println("Total Cost for "+ G.name + " is: "+ cost + " Euros");
	}
	if(G.thickness==3) {
		cost=0.007*G.lenght;
		System.out.println("Total Cost for "+ G.name + " is: "+ cost + " Euros");
	}
}

@Override
public void visitFurniture(Furniture F) {
	// TODO Auto-generated method stub
	double cost;
	cost=0.25*F.weight;
	System.out.println("Total Cost for "+ F.name + " is: "+ cost + " Euros");
	
}

@Override
public void visitElectronic(Electronic E) {
	// TODO Auto-generated method stub
	double cost;
	if(E.fragile==true) {
		cost=0.5*E.weight;
		System.out.println("Total Cost for "+ E.name + " is: "+ cost + " Euros");
	}
	if(E.fragile==false) {
		cost=((double)5/15)*E.weight;
		System.out.println("Total Cost for "+ E.name + " is: "+ cost + " Euros");
	}
	
}
}
