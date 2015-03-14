package sawapp;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class CreateWindow {
	private static Text text;
	private static Text text_1;
	private static Text text_2;
	private static Text text_3;
	private static Text text_4;
	private static Text text_5;
	private static Text text_6;
	private static Text text_7;
	private static Text text_8;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(640, 480);
		shell.setText("裁縫アプリ");
		shell.setLayout(null);
		
		Status status = new Status();
		
		Literal literal = new Literal();
		SawData sawdata = new SawData(literal.getfilePath());

		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		tabFolder.setBounds(0, 0, 624, 441);

		TabItem tabItem_1 = new TabItem(tabFolder, SWT.NONE);
		tabItem_1.setText("計算機");

		Composite composite = new Composite(tabFolder, SWT.NONE);
		tabItem_1.setControl(composite);

		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Meiryo UI", 14, SWT.NORMAL));
		lblNewLabel.setText("裁縫計算機");
		lblNewLabel.setBounds(10, 10, 97, 24);

		Label label = new Label(composite, SWT.NONE);
		label.setBounds(10, 43, 29, 15);
		label.setText("部位");

		Label label_1 = new Label(composite, SWT.NONE);
		label_1.setText("装備名");
		label_1.setBounds(10, 77, 36, 15);

		Combo combo = new Combo(composite, SWT.NONE);
		combo.setItems(new String[] {"頭", "体上", "体下"});
		combo.setBounds(52, 40, 131, 23);
		
		Combo combo_1 = new Combo(composite, SWT.NONE);

		combo_1.setBounds(52, 74, 131, 23);
		
		
		

		Label label_2 = new Label(composite, SWT.SEPARATOR | SWT.VERTICAL);
		label_2.setBounds(223, 43, 2, 300);

		Label label_3 = new Label(composite, SWT.SEPARATOR);
		label_3.setBounds(604, 43, 2, 300);

		Label label_4 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_4.setFont(SWTResourceManager.getFont("Meiryo UI", 9, SWT.NORMAL));
		label_4.setBounds(223, 43, 383, 2);

		Label label_5 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_5.setBounds(223, 341, 383, 2);

		Label label_6 = new Label(composite, SWT.SEPARATOR);
		label_6.setBounds(350, 43, 2, 300);

		Label label_7 = new Label(composite, SWT.SEPARATOR);
		label_7.setBounds(477, 43, 2, 300);

		Label label_8 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_8.setBounds(223, 95, 383, 2);

		Label label_9 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_9.setBounds(223, 145, 383, 2);

		Label label_10 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_10.setBounds(223, 195, 383, 2);

		Label label_11 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_11.setBounds(223, 245, 383, 2);

		Label label_12 = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_12.setBounds(223, 295, 383, 2);

		Label hp_1 = new Label(composite, SWT.NONE);
		hp_1.setAlignment(SWT.CENTER);
		hp_1.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		hp_1.setBounds(230, 50, 113, 40);
		hp_1.setText("0");

		Label hp_2 = new Label(composite, SWT.NONE);
		hp_2.setText("0");
		hp_2.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		hp_2.setAlignment(SWT.CENTER);
		hp_2.setBounds(357, 50, 113, 40);

		Label hp_3 = new Label(composite, SWT.NONE);
		hp_3.setText("0");
		hp_3.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		hp_3.setAlignment(SWT.CENTER);
		hp_3.setBounds(485, 50, 113, 40);

		Label hp_4 = new Label(composite, SWT.NONE);
		hp_4.setText("0");
		hp_4.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		hp_4.setAlignment(SWT.CENTER);
		hp_4.setBounds(230, 150, 113, 40);

		Label hp_5 = new Label(composite, SWT.NONE);
		hp_5.setText("0");
		hp_5.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		hp_5.setAlignment(SWT.CENTER);
		hp_5.setBounds(357, 150, 113, 40);

		Label hp_6 = new Label(composite, SWT.NONE);
		hp_6.setText("0");
		hp_6.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		hp_6.setAlignment(SWT.CENTER);
		hp_6.setBounds(485, 150, 113, 40);

		Label hp_9 = new Label(composite, SWT.NONE);
		hp_9.setText("0");
		hp_9.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		hp_9.setAlignment(SWT.CENTER);
		hp_9.setBounds(485, 250, 113, 40);

		Label hp_8 = new Label(composite, SWT.NONE);
		hp_8.setText("0");
		hp_8.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		hp_8.setAlignment(SWT.CENTER);
		hp_8.setBounds(357, 250, 113, 40);

		Label hp_7 = new Label(composite, SWT.NONE);
		hp_7.setText("0");
		hp_7.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		hp_7.setAlignment(SWT.CENTER);
		hp_7.setBounds(230, 250, 113, 40);

		Button btnNewButton = new Button(composite, SWT.NONE);
		btnNewButton.setBounds(280, 350, 113, 40);
		btnNewButton.setText("リセット");

		Button button = new Button(composite, SWT.NONE);
		button.setText("決定");
		button.setBounds(420, 350, 113, 40);

		text = new Text(composite, SWT.BORDER);
		text.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		text.setBounds(230, 100, 113, 40);

		text_1 = new Text(composite, SWT.BORDER);
		text_1.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		text_1.setBounds(230, 200, 113, 40);

		text_2 = new Text(composite, SWT.BORDER);
		text_2.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		text_2.setBounds(230, 299, 113, 40);

		text_3 = new Text(composite, SWT.BORDER);
		text_3.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		text_3.setBounds(357, 100, 113, 40);

		text_4 = new Text(composite, SWT.BORDER);
		text_4.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		text_4.setBounds(357, 200, 113, 40);

		text_5 = new Text(composite, SWT.BORDER);
		text_5.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		text_5.setBounds(357, 299, 113, 40);

		text_6 = new Text(composite, SWT.BORDER);
		text_6.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		text_6.setBounds(485, 100, 113, 40);

		text_7 = new Text(composite, SWT.BORDER);
		text_7.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		text_7.setBounds(485, 200, 113, 40);

		text_8 = new Text(composite, SWT.BORDER);
		text_8.setFont(SWTResourceManager.getFont("Meiryo UI", 20, SWT.BOLD));
		text_8.setBounds(485, 299, 113, 40);

		Label turnView = new Label(composite, SWT.NONE);
		turnView.setAlignment(SWT.RIGHT);
		turnView.setFont(SWTResourceManager.getFont("Meiryo UI", 14, SWT.BOLD));
		turnView.setBounds(337, 10, 68, 27);
		turnView.setText("0");

		Label label_22 = new Label(composite, SWT.NONE);
		label_22.setText("ターン目");
		label_22.setFont(SWTResourceManager.getFont("Meiryo UI", 14, SWT.BOLD));
		label_22.setBounds(411, 10, 68, 27);

		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("シミュレータ");

		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tabItem.setControl(composite_1);

		TabItem tabItem_2 = new TabItem(tabFolder, SWT.NONE);
		tabItem_2.setText("今日の依頼");

		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tabItem_2.setControl(composite_2);

		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);

		MenuItem mntmNewSubmenu = new MenuItem(menu, SWT.CASCADE);
		mntmNewSubmenu.setText("その他");

		Menu menu_1 = new Menu(mntmNewSubmenu);
		mntmNewSubmenu.setMenu(menu_1);

		MenuItem menuItem_1 = new MenuItem(menu_1, SWT.NONE);
		menuItem_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageBox box1 = new MessageBox(shell,SWT.NONE);
				box1.setMessage(literal.getVersion());
				box1.open();
			}
		});
		menuItem_1.setText("裁縫アプリについて");

		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int firstNumber = sawdata.searchSawTypesFirstNumber(combo.getSelectionIndex()+1);
				int LastNumber = sawdata.searchSawTypesLastNumber(combo.getSelectionIndex()+1);
				List<String> combo1Items = new ArrayList<String>();
				for(int i = firstNumber;i<=LastNumber;i++){
					combo1Items.add(sawdata.getSawNames(i));
				}
				combo_1.setItems(combo1Items.toArray(new String[0]));
				status.setLifePoints(new Integer[9]);
				status.setTurn(0);
				status.setClothType(0);
				turnView.setText("0");
				hp_1.setText("0");
				hp_2.setText("0");
				hp_3.setText("0");
				hp_4.setText("0");
				hp_5.setText("0");
				hp_6.setText("0");
				hp_7.setText("0");
				hp_8.setText("0");
				hp_9.setText("0");
			}
		});
		
		combo_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				status.setLifePoints(sawdata.getSawLifePoints(combo_1.getSelectionIndex()));
				status.setTurn(1);
				status.setClothType(sawdata.getClothTypes(combo_1.getSelectionIndex()));
				turnView.setText(String.valueOf(status.getTurn()));
				hp_1.setText(String.valueOf(status.getLifePoints(0)));
				hp_2.setText(String.valueOf(status.getLifePoints(1)));
				hp_3.setText(String.valueOf(status.getLifePoints(2)));
				hp_4.setText(String.valueOf(status.getLifePoints(3)));
				hp_5.setText(String.valueOf(status.getLifePoints(4)));
				hp_6.setText(String.valueOf(status.getLifePoints(5)));
				hp_7.setText(String.valueOf(status.getLifePoints(6)));
				hp_8.setText(String.valueOf(status.getLifePoints(7)));
				hp_9.setText(String.valueOf(status.getLifePoints(8)));
			}
		});
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
