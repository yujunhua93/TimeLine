package com.example.administrator.timeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.timeline.adapter.RecycleViewAdapter;
import com.example.administrator.timeline.entity.TraceEntity;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewTimelineActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private RecycleViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view_timeline);


        initData();

    }






    private void initData() {

        List<TraceEntity> list = new ArrayList<TraceEntity>();
        list.add(new TraceEntity("2016-05-25 17:48:00", "[沈阳市] [沈阳和平五部]的派件已签收 感谢使用中通快递,期待再次为您服务!"));
        list.add(new TraceEntity("2016-05-25 14:13:00", "[沈阳市] [沈阳和平五部]的东北大学代理点正在派件 电话:18040xxxxxx 请保持电话畅通、耐心等待"));
        list.add(new TraceEntity("2016-05-25 13:01:04", "[沈阳市] 快件到达 [沈阳和平五部]"));
        list.add(new TraceEntity("2016-05-25 12:19:47", "[沈阳市] 快件离开 [沈阳中转]已发往[沈阳和平五部]"));
        list.add(new TraceEntity("2016-05-25 11:12:44", "[沈阳市] 快件到达 [沈阳中转]"));
        list.add(new TraceEntity("2016-05-24 03:12:12", "[嘉兴市] 快件离开 [杭州中转部]已发往[沈阳中转]"));
        list.add(new TraceEntity("2016-05-23 21:06:46", "[杭州市] 快件到达 [杭州汽运部]"));
        list.add(new TraceEntity("2016-05-23 18:59:41", "[杭州市] 快件离开 [杭州乔司区]已发往[沈阳]"));
        list.add(new TraceEntity("2016-05-23 18:35:32", "[杭州市] [杭州乔司区]的市场部已收件 电话:18358xxxxxx"));
        list.add(new TraceEntity("2016-05-23 18:59:41", "[杭州市] 快件离开 [杭州乔司区]已发往[沈阳]"));
        list.add(new TraceEntity("2016-05-23 18:35:32", "[杭州市] [杭州乔司区]的市场部已收件 电话:18358xxxxxx"));



        recyclerViewAdapter = new RecycleViewAdapter(this,list);
        recyclerView = (RecyclerView) findViewById(R.id.timeline_rv);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
