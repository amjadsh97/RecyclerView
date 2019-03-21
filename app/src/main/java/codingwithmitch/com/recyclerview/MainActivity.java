package codingwithmitch.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mEmail = new ArrayList<>();
    private ArrayList<String> mPhone = new ArrayList<>();
    private ArrayList<String> mAdress = new ArrayList<>();
    private ArrayList<String> mHiringDate = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("Havasu Falls");
        mAdress.add("Illar-Tulkarem");
        mHiringDate.add("16/7/2018");
        mEmail.add("Example@gmail.com");
        mPhone.add("0595112001");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Trondheim");
        mAdress.add("Illar-Tulkarem");
        mHiringDate.add("16/7/2018");
        mEmail.add("Example@gmail.com");
        mPhone.add("0595112001");

        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("Portugal");
        mAdress.add("Illar-Tulkarem");
        mHiringDate.add("16/7/2018");
        mEmail.add("Example@gmail.com");
        mPhone.add("0595112001");

        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Rocky Mountain National Park");
        mAdress.add("Illar-Tulkarem");
        mHiringDate.add("16/7/2018");
        mEmail.add("Example@gmail.com");
        mPhone.add("0595112001");

        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Mahahual");
        mAdress.add("Illar-Tulkarem");
        mHiringDate.add("16/7/2018");
        mEmail.add("Example@gmail.com");
        mPhone.add("0595112001");

        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Frozen Lake");
        mAdress.add("Illar-Tulkarem");
        mHiringDate.add("16/7/2018");
        mEmail.add("Example@gmail.com");
        mPhone.add("0595112001");

        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands Desert");
        mAdress.add("Illar-Tulkarem");
        mHiringDate.add("16/7/2018");
        mEmail.add("Example@gmail.com");
        mPhone.add("0595112001");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");
        mAdress.add("Illar-Tulkarem");
        mHiringDate.add("16/7/2018");
        mEmail.add("Example@gmail.com");
        mPhone.add("0595112001");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");
        mAdress.add("Illar-Tulkarem");
        mHiringDate.add("16/7/2018");
        mEmail.add("Example@gmail.com");
        mPhone.add("0595112001");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls,mAdress,mHiringDate,mEmail,mPhone);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}






















