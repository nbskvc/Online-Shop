package nikola.boskovic.shoppinglist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PurchaseHistoryAdapter extends BaseAdapter {

    private Context myContext;
    private ArrayList<PurchaseHistoryModel> itemsList;

    public PurchaseHistoryAdapter(Context myContext) {
        this.myContext = myContext;
        itemsList = new ArrayList<PurchaseHistoryModel>();
    }

    @Override
    public int getCount() {
        return itemsList.size();
    }

    @Override
    public Object getItem(int i) {
        Object rv = null;
        try {
            rv = itemsList.get(i);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return rv;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public void addPurchaseHistoryItem(PurchaseHistoryModel item) {
        itemsList.add(item);
        notifyDataSetChanged();
    }
    public void removePurchaseHistoryItem(PurchaseHistoryModel item) {
        itemsList.remove(item);
        notifyDataSetChanged();
    }
    public void changeStatus(int i){
        itemsList.get(i).setStatus("DELIVERED");
        notifyDataSetChanged();
    }

    private class ViewHolder {
        TextView status;
        TextView date;
        TextView price;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.purchase_history_item, null);
            viewHolder = new ViewHolder();
            viewHolder.status = (TextView)
                    view.findViewById(R.id.statusTextView);
            viewHolder.date = (TextView)
                    view.findViewById(R.id.dateTextView);
            viewHolder.price = (TextView)
                    view.findViewById(R.id.priceTextView);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.status.setText(itemsList.get(i).getStatus());
        viewHolder.price.setText(itemsList.get(i).getPrice());
        viewHolder.date.setText(itemsList.get(i).getDate());

        return view;
    }
}
