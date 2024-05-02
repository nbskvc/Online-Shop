package nikola.boskovic.shoppinglist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ItemModel> items;

    public ItemAdapter(Context context) {
        this.context = context;
        items = new ArrayList<ItemModel>();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        Object tmp = null;
        try{
            tmp = items.get(i);
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return tmp;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private class ViewHolder {
        ImageView image;
        TextView name;
        TextView price;
        Button addButton;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.shopping_item, null);
            viewHolder = new ViewHolder();
            viewHolder.name = (TextView)
                    view.findViewById(R.id.tvitem);
            viewHolder.price = (TextView)
                    view.findViewById(R.id.tvprice);
            viewHolder.image = (ImageView)
                    view.findViewById(R.id.imageviewID);
            viewHolder.addButton = (Button)
                    view.findViewById(R.id.btadd);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        /* Get data Object on position from list/database */
        viewHolder.name.setText(items.get(i).getName());
        viewHolder.price.setText(items.get(i).getPrice());
        viewHolder.image.setImageDrawable(items.get(i).getImage());
        viewHolder.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemName = items.get(i).getName();
                Toast.makeText(context, "Predmet " + itemName + " dodat u korpu.", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    public void addElement(ItemModel element){
        items.add(element);
        notifyDataSetChanged();
    }
    public void removeElement(ItemModel element){
        items.remove(element);
        notifyDataSetChanged();
    }
}
