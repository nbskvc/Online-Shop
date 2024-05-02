package nikola.boskovic.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class ItemActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt_back;
    TextView tv_category;
    ListView lista;
    ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        bt_back = findViewById(R.id.back_buttonID);
        tv_category = findViewById(R.id.categoryID);
        lista = findViewById(R.id.item_listID);

        bt_back.setOnClickListener(this);

        String cat = getIntent().getStringExtra("category");
        tv_category.setText(cat);

        adapter = new ItemAdapter(this);
        lista.setAdapter(adapter);

        switch (cat) {
            case "Majice":
                ItemModel item1 = new ItemModel(getResources().getDrawable(R.drawable.majica1), "Crna majica", "600din");
                adapter.addElement(item1);
                ItemModel item2 = new ItemModel(getResources().getDrawable(R.drawable.majica2), "Siva majca", "800din");
                adapter.addElement(item2);
                ItemModel item3 = new ItemModel(getResources().getDrawable(R.drawable.majica3), "Zelena majica", "900din");
                adapter.addElement(item3);
                ItemModel item4 = new ItemModel(getResources().getDrawable(R.drawable.majica4), "Crvena majica", "700din");
                adapter.addElement(item4);
                ItemModel item5 = new ItemModel(getResources().getDrawable(R.drawable.majica1), "Crna majica", "600din");
                adapter.addElement(item5);
                ItemModel item6 = new ItemModel(getResources().getDrawable(R.drawable.majica2), "Siva majca", "800din");
                adapter.addElement(item6);
                ItemModel item7 = new ItemModel(getResources().getDrawable(R.drawable.majica3), "Zelena majica", "900din");
                adapter.addElement(item7);
                ItemModel item8 = new ItemModel(getResources().getDrawable(R.drawable.majica4), "Crvena majica", "700din");
                adapter.addElement(item8);
                ItemModel item9 = new ItemModel(getResources().getDrawable(R.drawable.majica1), "Crna majica", "600din");
                adapter.addElement(item9);
                ItemModel item10 = new ItemModel(getResources().getDrawable(R.drawable.majica2), "Siva majca", "800din");
                adapter.addElement(item10);
                ItemModel item11 = new ItemModel(getResources().getDrawable(R.drawable.majica3), "Zelena majica", "900din");
                adapter.addElement(item11);
                ItemModel item12 = new ItemModel(getResources().getDrawable(R.drawable.majica4), "Crvena majica", "700din");
                adapter.addElement(item12);
                ItemModel item13 = new ItemModel(getResources().getDrawable(R.drawable.majica1), "Crna majica", "600din");
                adapter.addElement(item13);
                ItemModel item14 = new ItemModel(getResources().getDrawable(R.drawable.majica2), "Siva majca", "800din");
                adapter.addElement(item14);
                ItemModel item15 = new ItemModel(getResources().getDrawable(R.drawable.majica3), "Zelena majica", "900din");
                adapter.addElement(item15);
                ItemModel item16 = new ItemModel(getResources().getDrawable(R.drawable.majica4), "Crvena majica", "700din");
                adapter.addElement(item16);
                break;
            case "Košulje":
                ItemModel k1 = new ItemModel(getResources().getDrawable(R.drawable.kosulja1), "Plava košulja", "600din");
                adapter.addElement(k1);
                ItemModel k2 = new ItemModel(getResources().getDrawable(R.drawable.kosulja2), "Braon košulja", "800din");
                adapter.addElement(k2);
                ItemModel k3 = new ItemModel(getResources().getDrawable(R.drawable.kosulja3), "Bela košulja", "900din");
                adapter.addElement(k3);
                ItemModel k4 = new ItemModel(getResources().getDrawable(R.drawable.kosulja4), "Crna košulja", "700din");
                adapter.addElement(k4);
                ItemModel k5 = new ItemModel(getResources().getDrawable(R.drawable.kosulja1), "Plava košulja", "600din");
                adapter.addElement(k5);
                ItemModel k6 = new ItemModel(getResources().getDrawable(R.drawable.kosulja2), "Braon košulja", "800din");
                adapter.addElement(k6);
                ItemModel k7 = new ItemModel(getResources().getDrawable(R.drawable.kosulja3), "Bela košulja", "900din");
                adapter.addElement(k7);
                ItemModel k8 = new ItemModel(getResources().getDrawable(R.drawable.kosulja4), "Crna košulja", "700din");
                adapter.addElement(k8);
                ItemModel k9 = new ItemModel(getResources().getDrawable(R.drawable.kosulja1), "Plava košulja", "600din");
                adapter.addElement(k9);
                ItemModel k10 = new ItemModel(getResources().getDrawable(R.drawable.kosulja2), "Braon košulja", "800din");
                adapter.addElement(k10);
                ItemModel k11 = new ItemModel(getResources().getDrawable(R.drawable.kosulja3), "Bela košulja", "900din");
                adapter.addElement(k11);
                ItemModel k12 = new ItemModel(getResources().getDrawable(R.drawable.kosulja4), "Crna košulja", "700din");
                adapter.addElement(k12);
                ItemModel k13 = new ItemModel(getResources().getDrawable(R.drawable.kosulja1), "Plava košulja", "600din");
                adapter.addElement(k13);
                ItemModel k14 = new ItemModel(getResources().getDrawable(R.drawable.kosulja2), "Braon košulja", "800din");
                adapter.addElement(k14);
                ItemModel k15 = new ItemModel(getResources().getDrawable(R.drawable.kosulja3), "Bela košulja", "900din");
                adapter.addElement(k15);
                ItemModel k16 = new ItemModel(getResources().getDrawable(R.drawable.kosulja4), "Crna košulja", "700din");
                adapter.addElement(k16);
                break;
            case "Pantalone":
                ItemModel p1 = new ItemModel(getResources().getDrawable(R.drawable.pantalone1), "Crne pantalone", "600din");
                adapter.addElement(p1);
                ItemModel p2 = new ItemModel(getResources().getDrawable(R.drawable.pantalone2), "Bele pantalone", "800din");
                adapter.addElement(p2);
                ItemModel p3 = new ItemModel(getResources().getDrawable(R.drawable.pantalone3), "Zelene pantalone", "900din");
                adapter.addElement(p3);
                ItemModel p4 = new ItemModel(getResources().getDrawable(R.drawable.pantalone4), "Braon pantalone", "700din");
                adapter.addElement(p4);
                ItemModel p5 = new ItemModel(getResources().getDrawable(R.drawable.pantalone1), "Crne pantalone", "600din");
                adapter.addElement(p5);
                ItemModel p6 = new ItemModel(getResources().getDrawable(R.drawable.pantalone2), "Bele pantalone", "800din");
                adapter.addElement(p6);
                ItemModel p7 = new ItemModel(getResources().getDrawable(R.drawable.pantalone3), "Zelene pantalone", "900din");
                adapter.addElement(p7);
                ItemModel p8 = new ItemModel(getResources().getDrawable(R.drawable.pantalone4), "Braon pantalone", "700din");
                adapter.addElement(p8);
                ItemModel p9 = new ItemModel(getResources().getDrawable(R.drawable.pantalone1), "Crne pantalone", "600din");
                adapter.addElement(p9);
                ItemModel p10 = new ItemModel(getResources().getDrawable(R.drawable.pantalone2), "Bele pantalone", "800din");
                adapter.addElement(p10);
                ItemModel p11 = new ItemModel(getResources().getDrawable(R.drawable.pantalone3), "Zelene pantalone", "900din");
                adapter.addElement(p11);
                ItemModel p12 = new ItemModel(getResources().getDrawable(R.drawable.pantalone4), "Braon pantalone", "700din");
                adapter.addElement(p12);
                ItemModel p13 = new ItemModel(getResources().getDrawable(R.drawable.pantalone1), "Crne pantalone", "600din");
                adapter.addElement(p13);
                ItemModel p14 = new ItemModel(getResources().getDrawable(R.drawable.pantalone2), "Bele pantalone", "800din");
                adapter.addElement(p14);
                ItemModel p15 = new ItemModel(getResources().getDrawable(R.drawable.pantalone3), "Zelene pantalone", "900din");
                adapter.addElement(p15);
                ItemModel p16 = new ItemModel(getResources().getDrawable(R.drawable.pantalone4), "Braon pantalone", "700din");
                adapter.addElement(p16);
                break;
            case "Jakne/Kaputi":
                ItemModel jk1 = new ItemModel(getResources().getDrawable(R.drawable.kaput1), "Crni Kaput", "5000din");
                adapter.addElement(jk1);
                ItemModel jk2 = new ItemModel(getResources().getDrawable(R.drawable.koznajakna), "Kožna jakna", "4500din");
                adapter.addElement(jk2);
                ItemModel jk3 = new ItemModel(getResources().getDrawable(R.drawable.vunenikaput), "Vuneni Kaput", "3600din");
                adapter.addElement(jk3);
                ItemModel jk4 = new ItemModel(getResources().getDrawable(R.drawable.teksasprsluk), "Teksas Prsluk", "2800din");
                adapter.addElement(jk4);
                ItemModel jk5 = new ItemModel(getResources().getDrawable(R.drawable.kaput1), "Crni Kaput", "5000din");
                adapter.addElement(jk5);
                ItemModel jk6 = new ItemModel(getResources().getDrawable(R.drawable.koznajakna), "Kožna jakna", "4500din");
                adapter.addElement(jk6);
                ItemModel jk7 = new ItemModel(getResources().getDrawable(R.drawable.vunenikaput), "Vuneni Kaput", "3600din");
                adapter.addElement(jk7);
                ItemModel jk8 = new ItemModel(getResources().getDrawable(R.drawable.teksasprsluk), "Teksas Prsluk", "2800din");
                adapter.addElement(jk8);
                ItemModel jk9 = new ItemModel(getResources().getDrawable(R.drawable.kaput1), "Crni Kaput", "5000din");
                adapter.addElement(jk9);
                ItemModel jk10 = new ItemModel(getResources().getDrawable(R.drawable.koznajakna), "Kožna jakna", "4500din");
                adapter.addElement(jk10);
                ItemModel jk11 = new ItemModel(getResources().getDrawable(R.drawable.vunenikaput), "Vuneni Kaput", "3600din");
                adapter.addElement(jk11);
                ItemModel jk12 = new ItemModel(getResources().getDrawable(R.drawable.teksasprsluk), "Teksas Prsluk", "2800din");
                adapter.addElement(jk12);
                ItemModel jk13 = new ItemModel(getResources().getDrawable(R.drawable.kaput1), "Crni Kaput", "5000din");
                adapter.addElement(jk13);
                ItemModel jk14 = new ItemModel(getResources().getDrawable(R.drawable.koznajakna), "Kožna jakna", "4500din");
                adapter.addElement(jk14);
                ItemModel jk15 = new ItemModel(getResources().getDrawable(R.drawable.vunenikaput), "Vuneni Kaput", "3600din");
                adapter.addElement(jk15);
                ItemModel jk16 = new ItemModel(getResources().getDrawable(R.drawable.teksasprsluk), "Teksas Prsluk", "2800din");
                adapter.addElement(jk16);

                break;
            case "Odela":
                ItemModel o1 = new ItemModel(getResources().getDrawable(R.drawable.odelo1), "Crno odelo", "1600din");
                adapter.addElement(o1);
                ItemModel o2 = new ItemModel(getResources().getDrawable(R.drawable.odelo2), "Plavo odelo", "1800din");
                adapter.addElement(o2);
                ItemModel o3 = new ItemModel(getResources().getDrawable(R.drawable.odelo3), "Braon odelo", "1900din");
                adapter.addElement(o3);
                ItemModel o4 = new ItemModel(getResources().getDrawable(R.drawable.odelo4), "Belo odelo", "1700din");
                adapter.addElement(o4);
                ItemModel o5 = new ItemModel(getResources().getDrawable(R.drawable.odelo1), "Crno odelo", "1600din");
                adapter.addElement(o5);
                ItemModel o6 = new ItemModel(getResources().getDrawable(R.drawable.odelo2), "Plavo odelo", "1800din");
                adapter.addElement(o6);
                ItemModel o7 = new ItemModel(getResources().getDrawable(R.drawable.odelo3), "Braon odelo", "1900din");
                adapter.addElement(o7);
                ItemModel o8 = new ItemModel(getResources().getDrawable(R.drawable.odelo4), "Belo odelo", "1700din");
                adapter.addElement(o8);
                ItemModel o9 = new ItemModel(getResources().getDrawable(R.drawable.odelo1), "Crno odelo", "1600din");
                adapter.addElement(o9);
                ItemModel o10 = new ItemModel(getResources().getDrawable(R.drawable.odelo2), "Plavo odelo", "1800din");
                adapter.addElement(o10);
                ItemModel o11 = new ItemModel(getResources().getDrawable(R.drawable.odelo3), "Braon odelo", "1900din");
                adapter.addElement(o11);
                ItemModel o12 = new ItemModel(getResources().getDrawable(R.drawable.odelo4), "Belo odelo", "1700din");
                adapter.addElement(o12);
                ItemModel o13 = new ItemModel(getResources().getDrawable(R.drawable.odelo1), "Crno odelo", "1600din");
                adapter.addElement(o13);
                ItemModel o14 = new ItemModel(getResources().getDrawable(R.drawable.odelo2), "Plavo odelo", "1800din");
                adapter.addElement(o14);
                ItemModel o15 = new ItemModel(getResources().getDrawable(R.drawable.odelo3), "Braon odelo", "1900din");
                adapter.addElement(o15);
                ItemModel o16 = new ItemModel(getResources().getDrawable(R.drawable.odelo4), "Belo odelo", "1700din");
                adapter.addElement(o16);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.back_buttonID:
                onBackPressed();
                break;
        }
    }
}