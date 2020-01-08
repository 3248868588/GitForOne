package com.peekay.gitforone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.peekay.gitforone.MY.MY1Activity;

public class MainActivity extends AppCompatActivity {
    Class[] classes = {MY1Activity.class, MainActivity.class, MainActivity.class, MainActivity.class, MainActivity.class,
            MainActivity.class, MainActivity.class, MainActivity.class, MainActivity.class};
    String[] names = {"MY1Activity.class", "名字1（数量与上面的对应即可）", "名字（没有对应就不要点击listview）",
            "名字(用于跳转页面)", "名字", "名字", "名字", "名字", "名字"};
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lv);
        listView.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, names));
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            startActivity(new Intent(MainActivity.this, classes[i]));
            //finish();  //跳转完成后是否关闭此页面
        });
    }
}
