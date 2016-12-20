package com.example.administrator.timeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import com.example.administrator.timeline.adapter.ExpandListViewAdapter;
import com.example.administrator.timeline.entity.ChildEntity;
import com.example.administrator.timeline.entity.ParentEntity;
import com.example.administrator.timeline.entity.TraceEntity;
import com.example.administrator.timeline.entity.TraceExEntity;

import java.util.ArrayList;
import java.util.List;

public class ExpandListViewTimeLineActivity extends AppCompatActivity {

    private ExpandableListView expandableListView;

    private ExpandListViewAdapter expandListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expand_list_view_time_line);
        initData();


    }

    private void initData() {

        List<ParentEntity> tracelist = new ArrayList<>();
        ParentEntity p1 = new ParentEntity();
        List<ChildEntity> c1 = new ArrayList<>();
        c1.add(new ChildEntity("[杭州市] [杭州乔司区]的市场部已收件 电话:18358xxxxxx"));
        c1.add(new ChildEntity("[杭州市] 快件到达 [杭州汽运部]"));
        c1.add(new ChildEntity("[杭州市] 快件离开 [杭州乔司区]已发往[沈阳]"));
        p1.setList(c1);
        p1.setTime("05-23");
        tracelist.add(p1);
        ParentEntity p2 = new ParentEntity();
        List<ChildEntity> c2 = new ArrayList<>();
        c2.add(new ChildEntity("[嘉兴市] 快件离开 [杭州中转部]已发往[沈阳中转]"));
        c2.add(new ChildEntity("[沈阳市] 快件到达 [沈阳中转]"));
        p2.setList(c2);
        p2.setTime("05-24");
        tracelist.add(p2);
        ParentEntity p3 = new ParentEntity();
        List<ChildEntity> c3 = new ArrayList<>();
        c3.add(new ChildEntity("[沈阳市] 快件到达 [沈阳和平五部]"));
        c3.add(new ChildEntity("[沈阳市] [沈阳和平五部]的东北大学代理点正在派件 电话:18040xxxxxx 请保持电话畅通、耐心等待"));
        p3.setList(c3);
        p3.setTime("05-25");
        tracelist.add(p3);

        expandableListView = (ExpandableListView) findViewById(R.id.timeline_ex);
        expandListViewAdapter = new ExpandListViewAdapter(this,tracelist);
        expandableListView.setAdapter(expandListViewAdapter);
        for (int i = 0; i < tracelist.size(); i++) {
            expandableListView.expandGroup(i);
        }

        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long l) {
                return true;
            }
        });

    }
}
