//Importing Random class
import java.util.Random;

//Create DICE MATH class
class DiceMath{

	//dicenum---- RETURNS int / PARAMETES numbers of SIDE
	int diceNum(int sides){

		//CREATE instance of RANDOM
		Random randomGenerator = new Random();
		
		//This could have returned the value directly
		//return = randomGenerator.nextInt(sides) + 1;
		int randomInt = randomGenerator.nextInt(sides) + 1;

		//return randomInt;
		return randomInt;

	}

}

