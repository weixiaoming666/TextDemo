package com.example.administrator.textdemo.demo.recyclerview;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.textdemo.R;

import java.util.List;

public class RecyclerviewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<ShowItem> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        list = DataConfig.getItems();
        recyclerView =findViewById(R.id.recyclerView);
//         布局填充器   原来的写法  ojbk  完全没问题  可以自己优化    数量和样式
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL));

        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {

            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.top = 20;
                outRect.left = 20;
                outRect.right = 20;
                outRect.bottom = 20;
            }
        });
        recyclerView.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                if (viewType==list.size()-1){
                    return new MyHolder2(LayoutInflater.from(RecyclerviewActivity.this).inflate( R.layout.item_edit, null));
                }else {
                    return new MyHolder(LayoutInflater.from(RecyclerviewActivity.this).inflate( R.layout.flow_item, null));
                }
//                可以 通过写holder 去做页面布局不同的操作；
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
                if (position != list.size() - 1) {
                    TextView textView = ((MyHolder) holder).text;
                    textView.setBackgroundDrawable(list.get(position).color);
                    textView.setText(list.get(position).des);
                    holder.itemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(RecyclerviewActivity.this, list.get(position).des, Toast.LENGTH_SHORT).show();
                        }
                    });
                } else {
                    EditText textView = ((MyHolder2) holder).edit_add;
                    textView.setBackgroundDrawable(list.get(position).color);
//                 textView.setText(list.get(position).des);
                    LinearLayout ll_edit = ((MyHolder2) holder).ll_edit;
                    ((MyHolder2) holder).bt_add.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(RecyclerviewActivity.this, "添加成功", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
                @Override
                public int getItemCount () {
                    return list.size();
                }

                class MyHolder extends RecyclerView.ViewHolder {

                    private TextView text;
//            private EditText edit_add;
//            private Button bt_add;
//            private LinearLayout ll_edit;

                    public MyHolder(View itemView) {
                        super(itemView);
                        text = (TextView) itemView.findViewById(R.id.flow_text);
//                ll_edit = (LinearLayout) itemView.findViewById(R.id.ll_edit);
//                edit_add = (EditText) itemView.findViewById(R.id.edit_add);
//                bt_add = (Button) itemView.findViewById(R.id.bt_add);
                    }
                }
                class MyHolder2 extends RecyclerView.ViewHolder {

                    private EditText edit_add;
                    private Button bt_add;
                    private LinearLayout ll_edit;

                    public MyHolder2(View itemView) {
                        super(itemView);
                        edit_add = (EditText) itemView.findViewById(R.id.edit_add);
                        bt_add = (Button) itemView.findViewById(R.id.bt_add);
                        ll_edit = (LinearLayout) itemView.findViewById(R.id.ll_edit);
                    }
                }
            @Override
            public int getItemViewType(int position) {
                return position;
            }
        });


    }
}
