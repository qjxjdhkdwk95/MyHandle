package hyunism.myhandline;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by 608-6 on 2017-05-12.
 */

public class MultiPageActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myListener(View target) {
        Intent intent = new Intent(getApplicationContext(), ActionCameraActivity.class);
        startActivity(intent);
    }
}
