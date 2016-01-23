package bsuir.task;

import bsuir.task.action.Multiplicator;
import bsuir.task.creator.MatrixCreator;
import bsuir.task.entity.Matrix;
import bsuir.task.exceptions.MatrixException;

public class Runner {
	public static void main(String[] args) {
		try {
			Matrix p = new Matrix(2, 3);
			// Тут я на static заменил
			MatrixCreator.fillRandomized(p, 2, 8);
			System.out.println("Matrix first is: " + p);
			Matrix q = new Matrix(3, 4);
			MatrixCreator.fillRandomized(q, 2, 7);
			System.out.println("Matrix second is: "+q);
			Multiplicator mult = new Multiplicator();
			System.out.println("Matrices product is: "+ mult.multiply(p, q));
		} catch (MatrixException e) {
System.err.println("Error of creating matrix"+ e);
		}
	}
}
