package com.gowhich.androidtabhost;

import android.app.TabActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabhost);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec page1 = tabHost.newTabSpec("tab1")
                .setIndicator("图片1")
                .setContent(R.id.fengjing1);
        tabHost.addTab(page1);

        TabHost.TabSpec page2 = tabHost.newTabSpec("tab2")
                .setIndicator("图片2")
                .setContent(R.id.fengjing2);
        tabHost.addTab(page2);

        TabHost.TabSpec page3 = tabHost.newTabSpec("tab3")
                .setIndicator("图片3")
                .setContent(R.id.fengjing3);
        tabHost.addTab(page3);

        TabHost.TabSpec page4 = tabHost.newTabSpec("tab4")
                .setIndicator("图片4")
                .setContent(R.id.fengjing4);
        tabHost.addTab(page4);
    }
}
