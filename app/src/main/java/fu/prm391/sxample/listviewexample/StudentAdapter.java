package fu.prm391.sxample.listviewexample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static androidx.core.content.ContextCompat.startActivity;

public class StudentAdapter extends BaseAdapter {

    private Activity activity;
    private int layout;
    private List<Person> list;

    public StudentAdapter(Activity activity, int layout, List<Person> list) {
        this.activity = activity;
        this.layout = layout;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        final TextView textViewName, textViewPhone;
        Button btnCall;
        if(view == null){
            view = activity.getLayoutInflater().inflate(layout,null);
            imageView = view.findViewById(R.id.imageView);
            textViewName = view.findViewById(R.id.textViewName);
            textViewPhone = view.findViewById(R.id.textViewPhone);
            btnCall = view.findViewById(R.id.btnCall);
            view.setTag(R.id.imageView,imageView);
            view.setTag(R.id.textViewName,textViewName);
            view.setTag(R.id.textViewPhone,textViewPhone);
            view.setTag(R.id.btnCall,btnCall);
        }else{
            imageView = (ImageView)view.getTag(R.id.imageView);
            textViewName = (TextView) view.getTag(R.id.textViewName);
            textViewPhone = (TextView)view.getTag(R.id.textViewPhone);
            btnCall = (Button) view.getTag(R.id.btnCall);
        }
        Person p = list.get(i);
        imageView.setImageResource(p.getImageID());
        textViewName.setText(p.getName());
        textViewPhone.setText(p.getPhone());
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: "+textViewPhone.getText()));

            }
        });
        return view;
    }
}
