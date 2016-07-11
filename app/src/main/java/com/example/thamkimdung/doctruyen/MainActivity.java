package com.example.thamkimdung.doctruyen;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.*;
import list.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private DrawerLayout drawerLayout;
    private ImageView imageView;
    private static int save = -1;

    private Adapterrr adapterrr;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        adapterrr=new Adapterrr(this);
        listView= (ListView) findViewById(R.id.listview);

        drawerLayout= (DrawerLayout) findViewById(R.id.drawerlayout);
      imageView= (ImageView) findViewById(R.id.iv_menu);
        imageView.setOnClickListener(this);
        listView.setAdapter(adapterrr);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.iv_menu){


            drawerLayout.openDrawer(Gravity.LEFT);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

       switch (position){


           case 0:

               Intent intent=new Intent(this, ChiLayMotDong.class);
               startActivity(intent);
               break;
           case 1:
               Intent intent1=new Intent(this, Vova_Ongdoctruyen.class);
               startActivity(intent1);
               break;
           case 2:
               Intent intent2=new Intent(this, Vova_ghen.class);
               startActivity(intent2);
               break;
           case 3:
               Intent intent3=new Intent(this, Vova_tapve.class);
               startActivity(intent3);
               break;
           case 4:
               Intent intent4=new Intent(this, Muaxetang.class);
               startActivity(intent4);
               break;
           case 5:
               Intent intent5=new Intent(this, Diadauphong.class);
               startActivity(intent5);
               break;
           case 6:
               Intent intent6=new Intent(this, Vova_vaolopmot.class);
               startActivity(intent6);
               break;
           default:
               break;
       }

    }
}
