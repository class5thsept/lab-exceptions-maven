package edu.grinnell.csc207.main;

import edu.grinnell.csc207.util.Quadratic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Interactively compute quadratic roots.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class QR {
  /**
   * Do all the work.
   *
   * @param args
   *   Command-line arguments (ignored).
   *
   * @throws Exception
   *   If something goes wrong with the I/O or elsewhere.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    // ...
    pen.printf("Hi! I'm here to help you understand quaratic functions.\n");
    pen.printf("Please enter a (the coefficient of the squared term): ");
    pen.printf("Please enter b (the coefficient of the linear term) : ");
    pen.printf("Please enter c (the constant)                       : ");

    // pen.printf("The smaller root of" ++ "x^2 + " ++ "x + "++"is"+.);
    // pen.printf("Experimentally," ++ "x^2 + " ++ "x + "++"is"+.);

    // STOPPED AT EXERCISE 3 PART a


    

    eyes.close();
    pen.close();
  } // main(String[])

} // QR
