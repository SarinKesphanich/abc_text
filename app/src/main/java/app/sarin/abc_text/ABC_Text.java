package app.sarin.abc_text;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ABC_Text extends Activity implements View.OnClickListener {

    private TextView txt02;
    private Button btnA, btnB, btnC, btnD, btnE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc__text);

        initialWidget();

        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnD.setOnClickListener(this);
        btnE.setOnClickListener(this);
    }

    private void initialWidget() {
        txt02 = (TextView) findViewById(R.id.txt02);
        btnA = (Button) findViewById(R.id.btnA);
        btnB = (Button) findViewById(R.id.btnB);
        btnC = (Button) findViewById(R.id.btnC);
        btnD = (Button) findViewById(R.id.btnD);
        btnE = (Button) findViewById(R.id.btnE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_abc__text, menu);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnA:
                txt02.setText(ABC_Text.this.getString(R.string.a));
                break;
            case R.id.btnB:
                txt02.setText(ABC_Text.this.getString(R.string.b));
                break;
            case R.id.btnC:
                txt02.setText(ABC_Text.this.getString(R.string.c));
                break;
            case R.id.btnD:
                txt02.setText(ABC_Text.this.getString(R.string.d));
                break;
            case R.id.btnE:
                txt02.setText(ABC_Text.this.getString(R.string.e));
                break;
        }
    }
}
