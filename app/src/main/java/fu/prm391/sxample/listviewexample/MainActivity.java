package fu.prm391.sxample.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    private List<Person> list;
    private StudentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = this.findViewById(R.id.listView);
        list = new ArrayList<>();
        list.add(new Person("CatAngry1","098765321",R.drawable.cat1));
        list.add(new Person("CatAngry2","0123445566",R.drawable.cat2));
        list.add(new Person("CatAngry3","0999999999",R.drawable.cat3));

        adapter = new StudentAdapter(this,R.layout.person_layout,list);
        listView.setAdapter(adapter);
    }
}
