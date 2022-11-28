package HW7;

import java.util.List;

public class PackingInstructions implements Visitor{
	public void packingInstruction(List<HouseholdItem> namesList) {
		for(HouseholdItem h: namesList) {
			h.accept(this);
		}
	}
	
	@Override
	public void visitGlass(Glass G) {
		// TODO Auto-generated method stub
		System.out.println(G.name+ ":");
		System.out.println(">should be wrapped with Bubble wraps and packed in a box with dimensions: "+ (G.height+1) + "x"+ (G.lenght+1)+"x"+(G.width+1));	}

	@Override
	public void visitFurniture(Furniture F) {
		// TODO Auto-generated method stub
		System.out.println(F.name+ ":");
		System.out.println(">should be covered with waterproof covers with area of: "+  (F.lenght)+"x"+(F.width));
	}

	@Override
	public void visitElectronic(Electronic E) {
		// TODO Auto-generated method stub
		System.out.println(E.name+ ":");
		System.out.println(">should be covered with Polyethylene foam film and packed in a box with dimensions: "+ (E.height+1) + "x"+ (E.lenght+1)+"x"+(E.width+1));
	}

}
