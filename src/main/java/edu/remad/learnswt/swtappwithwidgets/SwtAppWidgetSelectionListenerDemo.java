package edu.remad.learnswt.swtappwithwidgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Demonstrates a label, text and button. The button has a selection listener.
 */
public class SwtAppWidgetSelectionListenerDemo {

  /**
   * @param args argument from system environment
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

    // initializes a SWT Text Widget
    Text text = new Text(shell, SWT.NONE);
    text.setText("Initialized SWT Text Widget");
    text.setBackground(display.getSystemColor(SWT.COLOR_BLACK));
    text.setForeground(display.getSystemColor(SWT.COLOR_WHITE));

    // initializes a SWT Button Widget, also initializes a selection event
    Button button = new Button(shell, SWT.PUSH);
    button.setText("Press me, and fire selection event");
    button.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        System.out.println("Called!"); //register listener for the selection event
        Button pressedButton = e.getSource() instanceof Button ? (Button)e.getSource() : null;


        if(pressedButton != null) {
          // toggles text when button pressed
          if(pressedButton.getText().equals("Press me, and fire selection event")) {
            pressedButton.setText("printed called to console ");
          } else {
            pressedButton.setText("Press me, and fire selection event");
          }
        }
      }
    });

    // set widgets size to their preferred size
    text.pack();
    label.pack();
    button.pack();

    shell.open();
    while (!shell.isDisposed()) {
      if (!display.readAndDispatch()) {
        display.sleep();
      }
    }
    display.dispose();
  }
}
