package nikola.boskovic.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class PurchaseHistoryActivity extends AppCompatActivity implements View.OnClickListener {

    ListView lista;
    TextView tv_empty;
    Button bt_brisi;
    PurchaseHistoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_history);

        lista = findViewById(R.id.purch_hist);
        tv_empty = findViewById(R.id.tv_empty);
        lista.setEmptyView(tv_empty);

        bt_brisi = findViewById(R.id.bt_del);
        bt_brisi.setOnClickListener(this);

        adapter = new PurchaseHistoryAdapter(this);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                adapter.changeStatus(i);
            }
        });

        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "2000 RSD", "25.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "3000 RSD", "06.04.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("WAITING FOR DELIVERY", "3000 RSD", "08.04.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "2344 RSD", "10.4.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("CANCELLED", "5311 RSD", "12.04.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "2333 RSD", "014.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "43333 RSD", "29.02.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("WAITING FOR DELIVERY", "1200 RSD", "01.04.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "1500 RSD", "01.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "1000 RSD", "03.02.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("CANCELLED", "3544 RSD", "03.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "5050 RSD", "21.01.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "2344 RSD", "18.01.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("CANCELLED", "5435 RSD", "22.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "23434 RSD", "01.04.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "2000 RSD", "25.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "3000 RSD", "06.04.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("WAITING FOR DELIVERY", "3000 RSD", "08.04.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "2344 RSD", "10.4.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("CANCELLED", "5311 RSD", "12.04.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "2333 RSD", "014.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "43333 RSD", "29.02.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("WAITING FOR DELIVERY", "1200 RSD", "01.04.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "1500 RSD", "01.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "1000 RSD", "03.02.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("CANCELLED", "3544 RSD", "03.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "5050 RSD", "21.01.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "2344 RSD", "18.01.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("CANCELLED", "5435 RSD", "22.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "23434 RSD", "01.04.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "2000 RSD", "25.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "3000 RSD", "06.04.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("WAITING FOR DELIVERY", "3000 RSD", "08.04.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "2344 RSD", "10.4.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("CANCELLED", "5311 RSD", "12.04.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "2333 RSD", "014.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "43333 RSD", "29.02.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("WAITING FOR DELIVERY", "1200 RSD", "01.04.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "1500 RSD", "01.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "1000 RSD", "03.02.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("CANCELLED", "3544 RSD", "03.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "5050 RSD", "21.01.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "2344 RSD", "18.01.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("CANCELLED", "5435 RSD", "22.03.2024."));
        adapter.addPurchaseHistoryItem(new PurchaseHistoryModel("DELIVERED", "23434 RSD", "01.04.2024."));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_del:
                int i;
                for(i=0; i<45; i++)
                    adapter.removePurchaseHistoryItem((PurchaseHistoryModel) adapter.getItem(0));
                break;
            case R.id.tv_status:

        }
    }
}