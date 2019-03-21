package codingwithmitch.com.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by User on 1/2/2018.
 */

public class GalleryActivity extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name" )&& getIntent().hasExtra("address" )&& getIntent().hasExtra("email" )
        && getIntent().hasExtra("phone")&& getIntent().hasExtra("hiring_date")) {
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String address = getIntent().getStringExtra("address");
            String email = getIntent().getStringExtra("email");
            String phone = getIntent().getStringExtra("phone");
            String hiring_Date = getIntent().getStringExtra("hiring_date");


            setImage(imageUrl, imageName,address,email,phone,hiring_Date);
        }
    }


    private void setImage(String imageUrl, String imageName,String imageAddress,String imageEmail, String imagePhone,String imageHiringDate){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = findViewById(R.id.image_description);
        name.setText(imageName);

        TextView email = findViewById(R.id.email);
        email.setText(imageEmail);

        TextView phone = findViewById(R.id.phone);
        phone.setText(imagePhone);

        TextView hiringDate = findViewById(R.id.hiringDate);
        hiringDate.setText(imageHiringDate);


        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }

}


















