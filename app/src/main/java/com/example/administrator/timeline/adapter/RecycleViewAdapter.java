package com.example.administrator.timeline.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.timeline.R;
import com.example.administrator.timeline.RecycleViewTimelineActivity;
import com.example.administrator.timeline.entity.TraceEntity;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Administrator on 2016/12/20.
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyHolder>{


    private Context context;

    private List<TraceEntity> list ;

    private static final int ISFIRST = 0;

    private static final int NOTFIRST = 1;


    public RecycleViewAdapter(Context context, List<TraceEntity> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        MyHolder  myHolder = new MyHolder(LayoutInflater.from(context).inflate(R.layout.item_trace,parent,false));

        return myHolder;

    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        if (getItemViewType(position) == ISFIRST){
            holder.message.setTextColor(0xff555555);
            holder.time.setTextColor(0xff555555);
            holder.topDot.setTextColor(0xff555555);
            holder.topLine.setVisibility(View.GONE);
        }else{

        }
            holder.time.setText(list.get(position).getTraceTime());
            holder.message.setText(list.get(position).getTraceMessage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0){
            return ISFIRST;
        }else {
            return  NOTFIRST;
        }
    }

    public class MyHolder extends RecyclerView.ViewHolder{

        TextView time;

        TextView message;

        TextView topDot;

        TextView topLine;

        public MyHolder(View itemView) {
            super(itemView);
            time = (TextView) itemView.findViewById(R.id.tvAcceptTime);
            message = (TextView) itemView.findViewById(R.id.tvAcceptStation);
            topDot = (TextView) itemView.findViewById(R.id.tvDot);
            topLine = (TextView) itemView.findViewById(R.id.tvTopLine);

        }
    }
}
