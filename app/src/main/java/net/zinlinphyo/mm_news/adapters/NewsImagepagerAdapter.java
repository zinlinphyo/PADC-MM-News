package net.zinlinphyo.mm_news.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.zinlinphyo.mm_news.R;

/**
 * Created by zinlinphyo on 11/11/17.
 */

public class NewsImagepagerAdapter extends PagerAdapter {

    private LayoutInflater mLayoutInflater;

    public NewsImagepagerAdapter(Context context){
        super();
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.view_item_news_details_image, container, false);
        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (View)object);
    }
}