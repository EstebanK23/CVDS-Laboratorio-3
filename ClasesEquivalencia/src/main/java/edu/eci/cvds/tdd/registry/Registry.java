package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;
public class Registry {
	private ArrayList<int> identificaciones = new ArrayList<int>();
    public RegisterResult registerVoter(Person p) {
		
        if (p.getAge < 18 && p.getAge > 0){
			return RegisterResult.UNDERAGE;
		}
		if (!p.isAlive()){
			return RegisterResult.DEAD;
		}
		if (p.getAge <= 0 && p.getAge >= 120){
			return RegisterResult.INVALID_AGE;
		}
		if (identificaciones.contains(p.getId)){
			return RegisterResult.DUPLICATED;
		}
		identificaciones.add(p.getId);
        return RegisterResult.VALID;
    }
} 