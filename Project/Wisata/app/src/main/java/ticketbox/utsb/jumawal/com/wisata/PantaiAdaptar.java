package ticketbox.utsb.jumawal.com.wisata;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;


public class PantaiAdaptar extends  ArrayAdapter<String>{

    private final AppCompatActivity context;
    private final String[] NamaNegara;
    private final Integer[] GbrBendera;

    public PantaiAdaptar(AppCompatActivity context, String[] NamaNegara, Integer[] GbrBendera) {
        super(context, R.layout.mylist, NamaNegara);


        this.context=context;
        this.NamaNegara=NamaNegara;
        this.GbrBendera=GbrBendera;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);


        txtTitle.setText(NamaNegara[position]);
        imageView.setImageResource(GbrBendera[position]);

        return rowView;

    };
}