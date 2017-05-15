package hyunism.myhandline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // 체크박스와 달리 라디오 그룹은 그룹 전체를 등록한다
            // RadioButton 은 각각 선언하는 것이 아니라 RadioGroup 으로 선언해서 사용한다.

            final RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup1);
            Button b = (Button)findViewById(R.id.button1);
            final TextView tv = (TextView)findViewById(R.id.textView1);
            b.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    int id = rg.getCheckedRadioButtonId();
                    //getCheckedRadioButtonId() 의 리턴값은 선택된 RadioButton 의 id 값.
                    RadioButton rb = (RadioButton) findViewById(id);
                    tv.setText("결과: " + rb.getText().toString());
                } // end onClick()
            });  // end Listener

        } // end onCreate

    } // end Main
