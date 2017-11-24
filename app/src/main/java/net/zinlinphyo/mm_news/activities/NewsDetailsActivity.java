package net.zinlinphyo.mm_news.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewParent;

import net.zinlinphyo.mm_news.R;
import net.zinlinphyo.mm_news.adapters.NewsAdapter;
import net.zinlinphyo.mm_news.adapters.NewsImagepagerAdapter;
import net.zinlinphyo.mm_news.adapters.RelatedNewsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zinlinphyo on 11/11/17.
 */

public class NewsDetailsActivity extends AppCompatActivity {

    @BindView(R.id.vp_news_details_images)
    ViewPager vpNewsDetailsImages;

    public static Intent newIntent(Context context){
        Intent intent = new Intent(context, NewsDetailsActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        ButterKnife.bind(this,this);

        NewsImagepagerAdapter newsImagepagerAdapter = new NewsImagepagerAdapter(getApplicationContext());
        vpNewsDetailsImages.setAdapter(newsImagepagerAdapter);

        RecyclerView rvNews = findViewById(R.id.rv_related_news);
        rvNews.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        RelatedNewsAdapter newsAdapter = new RelatedNewsAdapter(getApplicationContext());
        rvNews.setAdapter(newsAdapter);
    }
}
