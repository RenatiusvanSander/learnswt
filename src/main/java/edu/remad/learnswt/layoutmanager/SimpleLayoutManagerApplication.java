package edu.remad.learnswt.layoutmanager;

import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * Demonstrates simplest use of layout manager
 */
public class SimpleLayoutManagerApplication {

  /**
   * SWT windows with used layoutmanager
   *
   * @param args argument of operating system
   */
  public static void main(String[] args) {
    Display display = new Display();

    Shell shell = new Shell(display);
    shell.setText("Layout Manager Demo");

    // the layout manager to handle the layout
    shell.setLayout(new FillLayout());

    // window opens and runs
    shell.open();
    while (!shell.isDisposed()) {
      if (!display.readAndDispatch()) {
        display.sleep();
      }
    }
    display.dispose();
  }
}
