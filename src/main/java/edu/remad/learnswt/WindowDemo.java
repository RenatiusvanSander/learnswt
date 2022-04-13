package edu.remad.learnswt;

import org.eclipse.swt.widgets.*;

/**
 * Demonstrates the Eclipse SWT window
 */
public class WindowDemo {

  /**
   * Opens a Eclipse SWT
   *
   * @param args the argument from operating system
   */
  public static void main (String [] args) {
    Display display = new Display ();
    Shell shell = new Shell(display);
    shell.setText("Window Demo");
    shell.open ();

    while (!shell.isDisposed ()) {
      if (!display.readAndDispatch ()) {
        display.sleep ();
      }
    }

    display.dispose ();
  }
}