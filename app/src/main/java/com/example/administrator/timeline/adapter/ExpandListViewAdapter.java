package com.example.administrator.timeline.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.administrator.timeline.ExpandListViewTimeLineActivity;
import com.example.administrator.timeline.R;
import com.example.administrator.timeline.entity.ParentEntity;

import java.util.List;

/**
 * Created by Administrator on 2016/12/20.
 */

public class ExpandListViewAdapter extends BaseExpandableListAdapter {

    private Context context;

    private List<ParentEntity> tracelist;

    private LayoutInflater layoutInflater;

    public ExpandListViewAdapter(Context context, List<ParentEntity> tracelist) {
        this.context = context;
        this.tracelist = tracelist;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getGroupCount() {
        return tracelist.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return tracelist.get(i).getList().size();
    }

    @Override
    public Object getGroup(int i) {
        return tracelist.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return tracelist.get(i).getList().get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        GroupHolder groupHolder = null;
        if (view == null){
            groupHolder = new GroupHolder();
            view = layoutInflater.inflate(R.layout.item_parent,null,false);
            groupHolder.date = (TextView) view.findViewById(R.id.tv_day);
            view.setTag(groupHolder);
        }else{
            groupHolder = (GroupHolder) view.getTag();
        }

        groupHolder.date.setText(tracelist.get(i).getTime());
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        ChildHolder childHolder = null;
        if (view == null){
            childHolder = new ChildHolder();
            view = layoutInflater.inflate(R.layout.item_child,null,false);
            childHolder.message = (TextView) view.findViewById(R.id.tv_content);
            view.setTag(childHolder);
        }else {
            childHolder = (ChildHolder) view.getTag();
        }
        childHolder.message.setText(tracelist.get(i).getList().get(i1).getMessage());
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }

    class GroupHolder {
        TextView date;
    }

    class ChildHolder{
        TextView message;
    }
}
