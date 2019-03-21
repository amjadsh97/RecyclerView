package codingwithmitch.com.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by User on 1/1/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> memails = new ArrayList<>();
    private ArrayList<String> mphones = new ArrayList<>();
    private ArrayList<String> maddress = new ArrayList<>();
    private ArrayList<String> mhiringdate = new ArrayList<>();


    private Context mContext;

    public RecyclerViewAdapter(Context context, ArrayList<String> imageNames, ArrayList<String> images,ArrayList<String> address,
                               ArrayList<String> hiringDate,ArrayList<String> phone,ArrayList<String> email)
    {
        mImageNames = imageNames;
        mImages = images;
        memails = email;
        mphones=phone;
        maddress = address;
        mhiringdate = hiringDate;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);

        holder.imageName.setText(mImageNames.get(position));
        holder.email.setText(memails.get(position));
        holder.hiringDate.setText(mhiringdate.get(position));
        holder.phone.setText(mphones.get(position));
        holder.address.setText(maddress.get(position));



        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mImageNames.get(position));

                Toast.makeText(mContext, mImageNames.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, GalleryActivity.class);
                intent.putExtra("image_url", mImages.get(position));
                intent.putExtra("image_name", mImageNames.get(position));
                intent.putExtra("address",maddress.get(position));
                intent.putExtra("email",memails.get(position));
                intent.putExtra("phone",mphones.get(position));
                intent.putExtra("hiring_date",mhiringdate.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView imageName;
        TextView address;
        TextView phone;
        TextView hiringDate;
        TextView email;
        ConstraintLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            address = itemView.findViewById(R.id.address);
            phone = itemView.findViewById(R.id.phone);
            hiringDate = itemView.findViewById(R.id.hiringDate);
            email = itemView.findViewById(R.id.email);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}















