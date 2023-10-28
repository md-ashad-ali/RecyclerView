package com.example.passcodeviewinandroid;

import static android.app.PendingIntent.getActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    HashMap<String,String> hashMap;
    ArrayList<HashMap<String,String>> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclervew);

        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("number","01796594798");
        hashMap.put("name","Ashasdur Rahman");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("number","0172212555");
        hashMap.put("name","Ashikur Rahman");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("number","01796594798");
        hashMap.put("name","Alamin Hossain");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("number","01796594798");
        hashMap.put("name","Enamul Haque");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("number","01796594798");
        hashMap.put("name","Rakibul Islam");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("number","01796594798");
        hashMap.put("name","Nabir Uddin");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("number","01796594798");
        hashMap.put("name","Shemul Hossain");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("number","01796594798");
        hashMap.put("name","Shohel Hossain");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("number","01796594798");
        hashMap.put("name","Nil Hossain");
        arrayList.add(hashMap);



        RecyclerAdepter recyclerAdepter = new RecyclerAdepter();
        recyclerView.setAdapter(recyclerAdepter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));




    }

    //===============reycler view
    private class RecyclerAdepter extends RecyclerView.Adapter<RecyclerAdepter.Recyclermodel> {

        private class Recyclermodel extends RecyclerView.ViewHolder{

            ImageView imageView;
            TextView name,number;

            public Recyclermodel(@NonNull View itemView) {
                super(itemView);

                imageView = itemView.findViewById(R.id.model_iamge);
                name = itemView.findViewById(R.id.model_textivew_name);
                number = itemView.findViewById(R.id.model_textivew_number);

            }
        }

        @NonNull
        @Override
        public Recyclermodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater = getLayoutInflater();
           View myview = layoutInflater.inflate(R.layout.model_design,parent,false);

            return new Recyclermodel(myview);

        }

        @Override
        public void onBindViewHolder(@NonNull Recyclermodel holder, int position) {

            /*holder.name.setText("Ashadur Rahman" );
            holder.number.setText("017xxxxxxx");
*/

            hashMap = arrayList.get(position);
           String nm = hashMap.get("name");
           String num = hashMap.get("number");

           holder.name.setText(nm);
           holder.number.setText(num);


        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }




    }



}