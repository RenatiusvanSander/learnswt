package edu.remad.learnswt.swtappwithwidgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Demonstrates SWT Application with a label and text widget.
 */
public class SwtApplicationWidgetDemo {

  /**
   * The main method to run swt application with widgets
   * @param args arguments from operating system
   */
  public static void main(String[] args) {
    Display display = new Display();
    Shell shell = new Shell(display);

    // sets layout manager to handle layout
    shell.setLayout(new FillLayout());

    // initializes a SWT Label
    Label label = new Label(shell, SWT.BORDER);
    label.setText("This is a label:");
    label.setToolTipText("This is the tooltip of this label");

    // initializes the SWT Text Widget
    Text text = new Text(shell, SWT.NONE);
    text.setText("Initialized SWT Text Widget");
    text.setBackground(display.getSystemColor(SWT.COLOR_BLACK));
    text.setForeground(display.getSystemColor(SWT.COLOR_WHITE));

    // set widgets size to their preferred size
    text.pack();
    label.pack();

    shell.open();
    while (!shell.isDisposed()) {
      if (!display.readAndDispatch()) {
        display.sleep();
      }
    }
    display.dispose();
  }
}
