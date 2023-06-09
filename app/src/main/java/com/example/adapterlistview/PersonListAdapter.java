package com.example.adapterlistview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PersonListAdapter extends ArrayAdapter<Person> {

    private Context mContext;
    private int mResource;
    private int lastPosition=-1;
    static class ViewHolder
    {
        TextView name;
        TextView birthday;
        TextView sex;
    }

    public PersonListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Person> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;


    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String name = getItem(position).getName();
        String birthday = getItem(position).getBirthday();
        String sex = getItem(position).getSex();

        Person person = new Person(name,birthday,sex);

        final View result;
        ViewHolder holder;
        if(convertView == null)
        {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource,parent,false);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.name_text);
            holder.birthday = (TextView) convertView.findViewById(R.id.birthday_text);
            holder.sex = (TextView) convertView.findViewById(R.id.SEX_txt);
            result = convertView;
            convertView.setTag(holder);
        }
        else
        {
         holder = (ViewHolder) convertView.getTag();
         result = convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition) ? R.anim.load_dwon_anim : R.anim.load_up_anim);

        result.startAnimation(animation);
        lastPosition = position;

        holder.name.setText(name);
        holder.birthday.setText(birthday);
        holder.sex.setText(sex);

        return convertView;
    }
}
