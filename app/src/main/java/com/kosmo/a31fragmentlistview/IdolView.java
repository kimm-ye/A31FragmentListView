package com.kosmo.a31fragmentlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class IdolView extends LinearLayout {

    TextView textView1;//그룹명
    TextView textView2;//인원수
    //생성자
    public IdolView(Context context) {
        super(context);
        //xml 레이아웃을 inflate(전개) 하기 위한 객체 생성 및 전개
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.idol_view, this, true);
        //전개하면 아래와 같이 위젯을 얻어오기 가능
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
    }
    //setter()메서드
    public void setName(String name) {
        textView1.setText(name);
    }

    public void setPerson(String pCount) {
        textView2.setText(pCount);
    }
}

