package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 *控制类
 */

public class MainActivity extends AppCompatActivity {
    private EditText name,author;
    private Button submit;
    private StroyList mStroyList;
    private String sname,sauthor;
    private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.editText1);
        author=(EditText)findViewById(R.id.editText2);
        submit=(Button)findViewById(R.id.button1);
        show=(TextView)findViewById(R.id.textView2);
        mStroyList=new StroyList();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //调用业务操作类来操作数
                // 先获取输入，交给业务操作类据\
                sname=name.getText().toString();
                sauthor=author.getText().toString();
                mStroyList.addStroy(sname,sauthor);
                //再调用业务操作类数据显示
                show.setText(mStroyList.getStroyList());
             //   show.setText("");
            }
        });
    }
}
