package easyway2in.com.radiobuttondemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView  final_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final_result = (TextView)findViewById(R.id.result_text);
        final_result.setEnabled(false);
    }

    public void selectFruit(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.fruit_apple:
                if (checked)
                {
                    final_result.setText("You select Apple..");
                    final_result.setEnabled(true);
                }
                    else
                {
                   final_result.setEnabled(false);
                }
                break;


            case R.id.fruit_orange:
                if (checked)
                {
                    final_result.setText("You select Orange..");
                    final_result.setEnabled(true);
                }
                else
                {
                    final_result.setEnabled(false);
                }
                break;


            case R.id.fruit_grapes:
                if (checked)
                {
                    final_result.setText("You select Grapes..");
                    final_result.setEnabled(true);
                }
                else
                {
                    final_result.setEnabled(false);
                }
                break;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
