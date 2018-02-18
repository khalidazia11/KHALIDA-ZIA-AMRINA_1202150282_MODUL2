package com.example.khalidaziaamrina.studycase2;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    String[] Menu, Harga;
    int[] Img_res = {R.drawable.icecream2, R.drawable.icecreamvanila, R.drawable.icecreamfruite, R.drawable.icecreamcup,
            R.drawable.icecreamcoklat, R.drawable.icecreamcampur, R.drawable.icecreambrownies, R.drawable.icecreamblueberry,
            R.drawable.icecreamalmond, R.drawable.doublestrawberry};
    ArrayList<Menu>menuList = new ArrayList<Menu>();
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        mRecyclerView = findViewById(R.id.recyclerview);
        Menu = getResources().getStringArray(R.array.menu_makanan); //mengambil data dari string
        Harga = getResources().getStringArray(R.array.harga_makanan);
        int i = 0;
        for (String name : Menu){  //mengisi data arraylist
            Menu menu = new Menu(Img_res[i], name, "Harga: Rp " + Harga[i]);
            menuList.add(menu);
            i++;
        }
        //menset recyclerview
        mAdapter = new MenuAdapter(this, menuList);
        mRecyclerView.setAdapter(mAdapter);
        //recyclerview sebagai pengelola tata letak default
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
